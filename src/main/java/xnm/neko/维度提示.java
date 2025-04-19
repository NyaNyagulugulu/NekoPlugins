package xnm.neko;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

import java.util.List;
import java.util.Random;

public class 维度提示 implements Listener {

    private final Random random = new Random();

    @EventHandler
    public void onWorldChange(PlayerChangedWorldEvent event) {
        Player player = event.getPlayer();
        World world = player.getWorld();
        FileConfiguration config = Main.getInstance().getConfig();

        String title;
        String subtitle;
        String quotePath;

        switch (world.getEnvironment()) {
            case NORMAL -> {
                title = ChatColor.AQUA + "主世界";
                subtitle = ChatColor.GRAY + "又是新的冒险开始之地";
                quotePath = "quotes.normal";
            }
            case NETHER -> {
                title = ChatColor.RED + "下界";
                subtitle = ChatColor.DARK_RED + "欢迎来到火与魂的深渊";
                quotePath = "quotes.nether";
            }
            case THE_END -> {
                title = ChatColor.DARK_PURPLE + "末地";
                subtitle = ChatColor.LIGHT_PURPLE + "终点？还是开始？";
                quotePath = "quotes.end";
            }
            default -> {
                title = ChatColor.WHITE + "未知维度";
                subtitle = ChatColor.GRAY + "你的意识好像偏离了轨道……";
                quotePath = "quotes.unknown";
            }
        }

        // 获取该维度对应语录列表
        List<String> quotes = config.getStringList(quotePath);
        String randomQuote = quotes.isEmpty() ? "" : ChatColor.YELLOW + "“" + quotes.get(random.nextInt(quotes.size())) + "”";

        // 显示标题、语录、播放音效
        player.sendTitle(title, subtitle, 10, 60, 20);
        if (!randomQuote.isEmpty()) {
            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(randomQuote));
        }
        player.playSound(player.getLocation(), Sound.ENTITY_PLAYER_LEVELUP, 1f, 1f);
    }
}
