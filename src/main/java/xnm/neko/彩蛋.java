package xnm.neko;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class 彩蛋 implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "这个命令只能由玩家使用喵！");
            return true;
        }

        Player player = (Player) sender;
        String name = player.getName();

        // 获取玩家位置用于播放粒子和音效
        Location loc = player.getLocation();

        if (label.equalsIgnoreCase("MTF")) {
            // 发送私聊消息
            player.sendMessage(ChatColor.LIGHT_PURPLE + "喵呜～" + ChatColor.AQUA + name + ChatColor.LIGHT_PURPLE + " 是一只可爱的 MTF 小猫娘！");
            player.sendMessage(ChatColor.GOLD + "无论外界如何看你，你的身份是值得被尊重和珍惜的。");
            player.sendMessage(ChatColor.GREEN + "请继续做自己，世界因你而更加多彩喵～");

            // 音效
            player.playSound(loc, Sound.ENTITY_CAT_PURR, 1.0f, 1.0f);
            player.playSound(loc, Sound.UI_TOAST_CHALLENGE_COMPLETE, 1.0f, 1.2f);

            // 全服广播
            // Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "[彩蛋] " + ChatColor.AQUA + name +
            //        ChatColor.LIGHT_PURPLE + " 是一只勇敢又可爱的 MTF 小猫娘喵！");

        } else if (label.equalsIgnoreCase("FTM")) {
            // 发送私聊消息
            player.sendMessage(ChatColor.LIGHT_PURPLE + "喵呜～" + ChatColor.AQUA + name + ChatColor.LIGHT_PURPLE + " 是一位帅气的 FTM 猫猫骑士！");
            player.sendMessage(ChatColor.GOLD + "你的坚持和勇气令人敬佩，每一步都值得被肯定。");
            player.sendMessage(ChatColor.GREEN + "继续闪耀吧，真正的你是最棒的喵～");

            // 音效
            player.playSound(loc, Sound.ENTITY_PLAYER_LEVELUP, 1.0f, 1.2f);
            player.playSound(loc, Sound.BLOCK_NOTE_BLOCK_PLING, 1.0f, 1.5f);

            // 全服广播
            // Bukkit.broadcastMessage(ChatColor.LIGHT_PURPLE + "[彩蛋] " + ChatColor.AQUA + name +
            //        ChatColor.LIGHT_PURPLE + " 是一位坚定勇敢的 FTM 猫猫骑士喵！");

        }

        return true;
    }
}
