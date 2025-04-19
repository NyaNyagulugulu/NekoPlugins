package xnm.neko;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.List;
import java.util.Random;

public class 玩家加入提示 implements Listener {

    private final Random random = new Random();

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        FileConfiguration config = Main.getInstance().getConfig();

        // 广播加入信息（全服）
        String broadcast = config.getString("join.broadcast", "&a🟢 玩家 &f%player% &a加入了服务器！");
        broadcast = ChatColor.translateAlternateColorCodes('&', broadcast.replace("%player%", player.getName()));
        Bukkit.broadcastMessage(broadcast);

        // 欢迎标题 & 副标题（仅对该玩家）
        String titleRaw = config.getString("join.title", "&b欢迎回来，%player%！");
        String subtitleRaw = config.getString("join.subtitle", "&7你被世界想念了。");

        String title = ChatColor.translateAlternateColorCodes('&', titleRaw.replace("%player%", player.getName()));
        String subtitle = ChatColor.translateAlternateColorCodes('&', subtitleRaw.replace("%player%", player.getName()));

        // 音效
        String soundStr = config.getString("join.sound", "ENTITY_PLAYER_LEVELUP");
        Sound sound;
        try {
            sound = Sound.valueOf(soundStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            sound = Sound.ENTITY_PLAYER_LEVELUP;
        }

        // ActionBar 语录
        List<String> quotes = config.getStringList("join.quotes");
        String randomQuote = quotes.isEmpty() ? "" :
                ChatColor.YELLOW + "“" + quotes.get(random.nextInt(quotes.size())) + "”";

        player.sendTitle(title, subtitle, 10, 60, 20);
        if (!randomQuote.isEmpty()) {
            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(randomQuote));
        }
        player.playSound(player.getLocation(), sound, 1f, 1f);
    }

    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        FileConfiguration config = Main.getInstance().getConfig();

        String quitMessage = config.getString("quit.broadcast", "&c🔴 玩家 &f%player% &c离开了服务器。");
        quitMessage = ChatColor.translateAlternateColorCodes('&', quitMessage.replace("%player%", player.getName()));
        Bukkit.broadcastMessage(quitMessage);
    }
}
