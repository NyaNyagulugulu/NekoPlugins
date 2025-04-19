package xnm.neko;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Location;
import org.bukkit.metadata.FixedMetadataValue;

public class 自杀 implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // 确保只有玩家才能执行该指令
        if (sender instanceof Player) {
            Player player = (Player) sender;
            Location loc = player.getLocation();

            // 设置玩家的元数据标记，用于在死亡事件中识别
            String customMessage = player.getName() + "§c想不开终结了自己的生命喵！";
            player.setMetadata("custom_death", new FixedMetadataValue(player.getServer().getPluginManager().getPlugin("neko"), customMessage));

            // 在玩家当前位置召唤无害的闪电
            player.getWorld().strikeLightningEffect(loc);

            // 设置玩家生命值为0，导致死亡
            player.setHealth(0);
        } else {
            sender.sendMessage("该指令只能由玩家执行喵~");
        }
        return true;
    }
}
