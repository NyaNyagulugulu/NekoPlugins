package xnm.neko;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.time.LocalDate;
import java.util.Random;

public class 今日人品 implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        // 确保只有玩家才能执行该指令
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "该指令只能由玩家执行喵~");
            return true;
        }

        Player player = (Player) sender;

        // 获取当前日期
        LocalDate today = LocalDate.now();

        // 生成基于日期的种子
        int seed = today.toString().hashCode();

        // 创建随机数生成器
        Random random = new Random(seed);

        // 生成 0 到 100 之间的人品值
        int luckValue = random.nextInt(101);

        // 根据人品值给予评价，并添加颜色
        ChatColor color;
        String evaluation;
        if (luckValue == 100) {
            color = ChatColor.GOLD;
            evaluation = "哇喵！你今天的人品爆棚了喵！";
        } else if (luckValue >= 80) {
            color = ChatColor.GREEN;
            evaluation = "你今天的人品非常不错喵！";
        } else if (luckValue >= 50) {
            color = ChatColor.YELLOW;
            evaluation = "你今天的人品还可以喵~";
        } else if (luckValue >= 20) {
            color = ChatColor.RED;
            evaluation = "你今天的人品有点低喵...";
        } else {
            color = ChatColor.DARK_RED;
            evaluation = "喵呜...你今天的人品不太好喵...";
        }

        // 向玩家发送人品值和评价
        player.sendMessage(color + "你今天的人品值是：" + luckValue + "。 " + evaluation);

        return true;
    }
}
