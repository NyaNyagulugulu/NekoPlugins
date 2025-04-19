package xnm.neko;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;

import java.util.Objects;

public final class Main extends JavaPlugin {
    private static Main instance;

    public static Main getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        //生成 config.yml
        saveDefaultConfig();

        // 注册事件
        getServer().getPluginManager().registerEvents(new 节日发送(), this);
        getServer().getPluginManager().registerEvents(new 玩家死亡监听(), this);
        getServer().getPluginManager().registerEvents(new 维度提示(), this);
        getServer().getPluginManager().registerEvents(new 玩家加入提示(), this);
        getServer().getPluginManager().registerEvents(new 群系提示(), this);

        // 配置重载
        Objects.requireNonNull(this.getCommand("xnm")).setExecutor(new 重载配置());
        // tab补全和输入提示
        重载配置 command = new 重载配置();
        Objects.requireNonNull(this.getCommand("xnm")).setExecutor(command);
        Objects.requireNonNull(this.getCommand("xnm")).setTabCompleter(command);

        // 崩溃玩家
        Objects.requireNonNull(this.getCommand("crash")).setExecutor(new 客户端崩溃());

        // 今日人品
        Objects.requireNonNull(this.getCommand("luck")).setExecutor(new 今日人品());

        // 彩蛋
        Objects.requireNonNull(this.getCommand("MTF")).setExecutor(new 彩蛋());
        Objects.requireNonNull(this.getCommand("FTM")).setExecutor(new 彩蛋());

        // 自杀指令事件
        Objects.requireNonNull(this.getCommand("514")).setExecutor(new 自杀());
        Objects.requireNonNull(this.getCommand("killneko")).setExecutor(new 自杀());

        // 优化后的启动消息
        sendColoredMessage(new String[] {
                "&d╔═╗╔═╗╔╦╗╔═╗ &b╔═╗╔╦╗╔═╗╔═╗╔╦╗",
                "&d║ ║╠═╝║║║╠═╣ &b║ ║║║║║╣ ║ ║║║║",
                "&d╚═╝╩  ═╩╝╩ ╩ &b╚═╝╩ ╩╚═╝╚═╝╩ ╩",
                "&b⋆ &3版本 &f1.0 &a| &3作者 &f不穿胖次の小奶猫",
                "&b⋆ &3QQ &f1178878128 &a| &3Telegram &ft.me/maomaoChengguang",
                "&d⚡ 插件已成功加载！喵呜～准备好开始冒险了吗？"
        });
    }

    @Override
    public void onDisable() {
        sendColoredMessage(new String[] {
                "&d╔═╗╔═╗╔╦╗╔═╗ &c╔═╗╔╦╗╔═╗╔═╗╔╦╗",
                "&d║ ║╠═╝║║║╠═╣ &c║ ║║║║║╣ ║ ║║║║",
                "&d╚═╝╩  ═╩╝╩ ╩ &c╚═╝╩ ╩╚═╝╚═╝╩ ╩",
                "&c✧ &4插件已安全卸载！下次见喵～ &c✧"
        });
    }

    /**
     * 发送彩色消息到控制台
     * @param messages 要发送的消息数组
     */
    private void sendColoredMessage(String[] messages) {
        for (String message : messages) {
            getServer().getConsoleSender().sendMessage(
                    ChatColor.translateAlternateColorCodes('&',
                            "&8[&dNekoPlugin&8] &r" + message)
            );
        }
    }
}
