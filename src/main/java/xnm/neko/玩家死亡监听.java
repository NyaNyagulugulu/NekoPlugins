package xnm.neko;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.entity.Player;

public class 玩家死亡监听 implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        // 获取死亡的玩家
        Player player = event.getEntity();

        // 检查玩家是否有特定的元数据标记
        if (player.hasMetadata("custom_death")) {
            // 取消默认的死亡消息
            event.setDeathMessage(null);

            // 获取自定义的死亡消息
            String customMessage = player.getMetadata("custom_death").get(0).asString();

            // 广播自定义的死亡消息
            player.getServer().broadcastMessage(customMessage);

            // 移除元数据标记
            player.removeMetadata("custom_death", player.getServer().getPluginManager().getPlugin("neko"));
        }
    }
}
