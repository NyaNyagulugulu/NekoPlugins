package xnm.neko;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class 节日活动 {

    public static String[] 获取今日节日() {
        LocalDate today = LocalDate.now();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();

        Map<String, String[]> holidays = new HashMap<>();

        // 中国传统节日
        holidays.put("1-1", new String[] { "§e🎉 元旦节快乐！" });
        holidays.put("1-15", new String[] {
                "§e🏮 元宵节",
                "§e吃汤圆，赏花灯猜灯谜"
        });
        holidays.put("2-10", new String[] { "§e🌸 春节快乐！", "祝你新年快乐，万事如意喵～" });
        holidays.put("4-4", new String[] { "§e🌱 清明节", "扫墓祭祖，踏青插柳" });
        holidays.put("5-1", new String[] { "§e👷 劳动节快乐！" });
        holidays.put("5-5", new String[] { "🐉 端午节", "粽叶飘香，龙舟竞渡" });
        holidays.put("6-1", new String[] { "§e👶 儿童节快乐！" });
        holidays.put("7-7", new String[] { "§e🎋 七夕节", "牛郎织女鹊桥会，中国情人节" });
        holidays.put("8-15", new String[] { "§e🌕 中秋节快乐！", "赏月吃月饼，记得别喂猫哦！" });
        holidays.put("9-9", new String[] { "§e🌄 重阳节", "登高赏秋，敬老孝亲" });
        holidays.put("10-1", new String[] { "§e🎆 国庆节快乐！" });
        holidays.put("12-22", new String[] { "§e❄️ 冬至", "北方吃饺子，南方吃汤圆" });
        holidays.put("12-30", new String[] { "§e🥣 腊八节", "腊八粥暖，辞旧迎新" });
        holidays.put("2-2", new String[] { "§e🧹 小年", "扫尘祭灶，年味渐浓" });

        // 国际节日
        holidays.put("2-14", new String[] { "§e💘 情人节快乐！" });
        holidays.put("3-8", new String[] { "§e🌹 三八妇女节快乐！" });
        holidays.put("3-31", new String[] {
                "§e⚧️ 国际跨性别现身日",
                "§eTrans Day of Visibility 💖",
                "§e愿每一个人都能自由的生活在阳光下" });
        holidays.put("4-1", new String[] {
                "§e😜 愚人节快乐，小心被整蛊哦！",
                "§e🎮 愚人节服务器有新玩法哦！",
                "§e📺 点击查看教程：§bhttps://www.bilibili.com/video/BV1GJ411x7h7"
        });
        holidays.put("11-20", new String[] { "§e🕯️ 跨性别纪念日（TDoR）", "愿世界更加安全与包容" });
        holidays.put("12-25", new String[] { "§e🎄 圣诞节快乐！" });

        // 二次元/日本节日
        holidays.put("3-3", new String[] { "§e🎎 女儿节（ひなまつり）" });
        holidays.put("11-11", new String[] {
                "§e🛍️ 双十一购物节",
                "§e🍫 Pocky Day（百奇日）！快去买百奇喵～",
                "§e🥢 在中国也叫光棍节，你有对象嘛？"
        });
        holidays.put("10-31", new String[] { "§e🎃 万圣夜", "Trick or Treat!" });

        // 二次元人物生日
        holidays.put("8-31", new String[] {
                "§e🎤 初音未来生日",
                "§b世界第一的公主殿下，生日快乐！",
                "§dᴹᴵᴷᵁ ᴹᴵᴷᵁ ᴰᴼᴺᴳᴰᴼᴺᴳ♪♪"
        });
        holidays.put("2-9", new String[] {
                "§e🌟 超天酱生日",
                "§d让世界充满你的电波吧！",
                "§bINTERNET OVERDOSE",
                "§5(✧∇✧)╯╰(✧∇✧)̣"
        });

        // 碧蓝档案角色生日
        holidays.put("1-3", new String[] {
                "§e📚 碧蓝档案 星野生日",
                "§9哈...好困...但今天会打起精神的~",
                "§1(∪｡∪)｡｡｡zzz"
        });
        holidays.put("8-8", new String[] {
                "§e🚌 碧蓝档案 白子生日",
                "§b骑行部的弹药已装满！要和我一起抢银行吗",
                "§1✧٩(ˊωˋ*)و✧"
        });
        holidays.put("9-19", new String[] {
                "§e🎲 碧蓝档案 阿露生日",
                "§c赌上一切也要完成任务！",
                "§4(＞﹏＜) 呜...怎么又失败了..."
        });
        holidays.put("12-4", new String[] {
                "§e🎭 碧蓝档案 诺亚生日",
                "§6千年科技学院的智慧之光",
                "§d(￣▽￣)~*"
        });
        holidays.put("3-4", new String[] {
                "§e📊 碧蓝档案 优香生日",
                "§a今天的账本也要完美平衡！",
                "§2Σ(っ°Д°;)っ"
        });

        // VOCALOID系列
        holidays.put("7-12", new String[] {
                "§e🎵 洛天依诞生祭",
                "§a华夏之音，未来之声",
                "§d━━(^∇^*)━━♪"
        });
        holidays.put("12-27", new String[] {
                "§e🎙️ 镜音双子生日",
                "§eリン・レン歌声交织的奇迹",
                "§c♪～(´ε｀ )"
        });

        holidays.put("6-24", new String[] {
                "§e猫羽雫的生日",
                "祝她生日快乐",
                "§d(=^･ω･^)="
        });


                // 自定义节日（插件开发用）
        /** holidays.put("4-3", new String[] {
                "§e插件测试第一行",
                "§e插件测试第二行",
                "§e点击查看链接：§bhttps://www.bilibili.com/video/BV1GJ411x7h7"});
         **/

        String key = month + "-" + day;
        return holidays.getOrDefault(key, null);
    }
}
