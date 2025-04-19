package xnm.neko;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class 客户端崩溃 implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!sender.hasPermission("neko.crash")) {
            sender.sendMessage(ChatColor.RED + "你没有权限使用这个指令！");
            return true;
        }

        if (args.length != 1) {
            sender.sendMessage(ChatColor.YELLOW + "用法: /crash <玩家>");
            return true;
        }

        Player target = Bukkit.getPlayerExact(args[0]);
        if (target == null || !target.isOnline()) {
            sender.sendMessage(ChatColor.RED + "找不到该玩家！");
            return true;
        }

        sender.sendMessage(ChatColor.GREEN + "已开始强制卡死客户端：" + target.getName());

        new BukkitRunnable() {
            int tick = 0;

            @Override
            public void run() {
                if (!target.isOnline() || tick >= 100) {
                    cancel();
                    return;
                }
                tick++;

                Location loc = target.getLocation();

                // 标题疯狂闪烁
                target.sendTitle(ChatColor.RED + "你的客户端或行为异常", ChatColor.DARK_GRAY + "请联系管理员", 0, 10, 0);

                // 聊天刷屏
                target.sendMessage(ChatColor.RED + "你的客户端或行为异常，请立即停止操作");

                // 粒子轰炸（极高密度）→ 非常卡
                for (int i = 0; i < 800; i++) {
                    double x = (Math.random() - 0.5) * 16;
                    double y = (Math.random() - 0.5) * 8;
                    double z = (Math.random() - 0.5) * 16;
                    target.spawnParticle(Particle.FLAME, loc.clone().add(x, y, z), 0, 0, 0, 0, 0);
                }

                // 卡顿音效：乐器低频轰炸
                target.playSound(loc, Sound.BLOCK_NOTE_BLOCK_BASS, 1f, 0.1f);
                target.playSound(loc, Sound.BLOCK_ANVIL_LAND, 1f, 0.5f);

                // 位置轻微抖动（如同鬼畜）
                if (tick % 2 == 0) {
                    target.teleport(loc.clone().add(Math.random() * 0.3 - 0.15, 0, Math.random() * 0.3 - 0.15));
                }
            }
        }.runTaskTimer(Main.getInstance(), 0L, 1L);

        return true;
    }
}
