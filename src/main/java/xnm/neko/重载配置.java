package xnm.neko;

import org.bukkit.ChatColor;
import org.bukkit.command.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 重载配置 implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length >= 1 && args[0].equalsIgnoreCase("reload")) {
            Main.getInstance().reloadConfig();
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&',
                    "&8[&dNekoPlugin&8] &a配置已重载！喵～"));
            return true;
        }

         sender.sendMessage(ChatColor.RED + "用法: /xnm reload");
        return false;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command,
                                      String alias, String[] args) {
        if (args.length == 1) {
            List<String> subcommands = new ArrayList<>();
            subcommands.add("reload");
            return subcommands.stream()
                    .filter(s -> s.toLowerCase().startsWith(args[0].toLowerCase()))
                    .toList(); // Java 17+
        }

        return Collections.emptyList();
    }
}
