package xnm.neko;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.block.Biome;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;

import java.util.HashMap;
import java.util.Map;

public class 群系提示 implements Listener {

    private final Map<Player, Biome> 上一个群系 = new HashMap<>();

    @EventHandler
    public void 玩家切换维度(PlayerChangedWorldEvent event) {
        Player player = event.getPlayer();

        // 当玩家切换维度时，记录当前群系为“上一个”，避免传送后立刻提示
        Biome 当前群系 = player.getLocation().getBlock().getBiome();
        上一个群系.put(player, 当前群系);
    }


    @EventHandler
    public void 玩家加入(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        Biome 当前群系 = player.getLocation().getBlock().getBiome();
        上一个群系.put(player, 当前群系); // 初始化记录，避免立刻重复提示

        FileConfiguration config = Main.getInstance().getConfig();
        String path = "biome_titles." + 当前群系.name();

        String 默认名 = 当前群系.name().replace("_", " ").toLowerCase();
        默认名 = 默认名.substring(0, 1).toUpperCase() + 默认名.substring(1);

        String title = ChatColor.translateAlternateColorCodes('&',
                config.getString(path + ".title", "&f" + 默认名));
        String subtitle = ChatColor.translateAlternateColorCodes('&',
                config.getString(path + ".subtitle", "&7你来到了新的群系"));

        player.sendTitle(title, subtitle, 10, 60, 20);
    }

    @EventHandler
    public void 玩家移动触发(PlayerMoveEvent event) {
        Player player = event.getPlayer();

        // 不处理末地维度
        // if (player.getWorld().getEnvironment() == World.Environment.THE_END) return;

        if (event.getFrom().getBlockX() == event.getTo().getBlockX() &&
                event.getFrom().getBlockZ() == event.getTo().getBlockZ()) return;

        Biome 当前群系 = player.getLocation().getBlock().getBiome();
        Biome 上次群系 = 上一个群系.get(player);

        if (上次群系 != null && 当前群系 == 上次群系) return;

        上一个群系.put(player, 当前群系);

        FileConfiguration config = Main.getInstance().getConfig();
        String path = "biome_titles." + 当前群系.name();

        // 从 config 读取标题和副标题，如果没有就使用默认中文
        String 默认名 = 当前群系.name().replace("_", " ").toLowerCase();
        默认名 = 默认名.substring(0, 1).toUpperCase() + 默认名.substring(1);

        String title = ChatColor.translateAlternateColorCodes('&',
                config.getString(path + ".title", "&f" + 默认名));
        String subtitle = ChatColor.translateAlternateColorCodes('&',
                config.getString(path + ".subtitle", "&7你来到了新的群系"));

        player.sendTitle(title, subtitle, 10, 60, 20);
    }
}
