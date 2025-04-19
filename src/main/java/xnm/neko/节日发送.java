package xnm.neko;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static org.bukkit.Bukkit.getServer;

public class 节日发送 implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        String[] holidayLines = 节日活动.获取今日节日();
        if (holidayLines != null) {
            for (int i = 0; i < holidayLines.length; i++) {
                String line = holidayLines[i];

                String msg;
                if (i == 0) {
                    msg = ChatColor.translateAlternateColorCodes('&',
                            "&e今天是特别的日子喵～ " + line);
                } else {
                    msg = ChatColor.translateAlternateColorCodes('&', line);
                }

                // getServer().getConsoleSender().sendMessage(msg);

                //发送给玩家
                getServer().getOnlinePlayers().forEach(p -> p.sendMessage(msg));
            }
        }
    }
}
