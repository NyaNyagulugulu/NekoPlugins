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
        holidays.put("1-1", new String[] {
                "§e🎉 元旦节快乐！",
                "§b新的一年，愿你心想事成喵～"
        });
        holidays.put("1-15", new String[] {
                "§e🏮 元宵节",
                "§b吃汤圆，赏花灯，猜灯谜，热闹非凡喵～"
        });
        holidays.put("2-10", new String[] {
                "§e🌸 春节快乐！",
                "§b新年快乐，万事如意喵～"
        });
        holidays.put("4-4", new String[] {
                "§e🌱 清明节",
                "§b扫墓祭祖，踏青插柳，缅怀先人喵～"
        });
        holidays.put("4-10", new String[] {
                "§d💖 男娘日",
                "§b今天是属于男娘们的节日喵～",
                "§e愿你们的可爱与魅力闪耀全场！"
        });
        holidays.put("5-1", new String[] {
                "§e👷 劳动节快乐！",
                "§b辛勤劳动，收获满满喵～"
        });
        holidays.put("5-5", new String[] {
                "§e🐉 端午节",
                "§b粽叶飘香，龙舟竞渡，节日快乐喵～"
        });
        holidays.put("6-1", new String[] {
                "§e👶 儿童节快乐！",
                "§b愿你童心未泯，快乐成长喵～"
        });
        holidays.put("7-7", new String[] {
                "§e🎋 七夕节",
                "§b牛郎织女鹊桥会，中国情人节喵～"
        });
        holidays.put("8-15", new String[] {
                "§e🌕 中秋节快乐！",
                "§b赏月吃月饼，记得别喂猫哦喵～"
        });
        holidays.put("9-9", new String[] {
                "§e🌄 重阳节",
                "§b登高赏秋，敬老孝亲喵～"
        });
        holidays.put("10-1", new String[] {
                "§e🎆 国庆节快乐！",
                "§b祖国生日，举国同庆喵～"
        });
        holidays.put("12-22", new String[] {
                "§e❄️ 冬至",
                "§b北方吃饺子，南方吃汤圆，暖暖过冬喵～"
        });
        holidays.put("12-30", new String[] {
                "§e🥣 腊八节",
                "§b腊八粥暖，辞旧迎新喵～"
        });
        holidays.put("2-2", new String[] {
                "§e🧹 小年",
                "§b扫尘祭灶，年味渐浓喵～"
        });

        // 国际节日
        holidays.put("2-14", new String[] {
                "§e💘 情人节快乐！",
                "§b愿你被爱包围，甜甜蜜蜜喵～"
        });
        holidays.put("3-8", new String[] {
                "§e🌹 三八妇女节快乐！",
                "§b致敬每一位闪耀的女性喵～"
        });
        holidays.put("3-31", new String[] {
                "§e⚧️ 国际跨性别现身日",
                "§bTrans Day of Visibility 💖",
                "§e愿每一个人都能自由地生活在阳光下喵～"
        });
        holidays.put("4-1", new String[] {
                "§e😜 愚人节快乐，小心被整蛊哦喵～",
                "§e🎮 愚人节服务器有新玩法喵～",
                "§e📺 点击查看教程：§bhttps://www.bilibili.com/video/BV1GJ411x7h7"
        });
        holidays.put("11-20", new String[] {
                "§e🕯️ 跨性别纪念日（TDoR）",
                "§b愿世界更加安全与包容喵～"
        });
        holidays.put("12-25", new String[] {
                "§e🎄 圣诞节快乐！",
                "§b愿你圣诞快乐，心想事成喵～"
        });

        // 二次元/日本节日
        holidays.put("3-3", new String[] {
                "§e🎎 女儿节（ひなまつり）",
                "§b愿每位女孩都健康快乐喵～"
        });
        holidays.put("11-11", new String[] {
                "§e🛍️ 双十一购物节",
                "§e🍫 Pocky Day（百奇日）！快去买百奇喵～",
                "§e🥢 在中国也叫光棍节，你有对象嘛喵？"
        });
        holidays.put("10-31", new String[] {
                "§e🎃 万圣夜",
                "§bTrick or Treat！不给糖就捣蛋喵～"
        });

        // 二次元人物生日
        holidays.put("8-31", new String[] {
                "§e🎤 初音未来生日",
                "§b世界第一的公主殿下，生日快乐喵～",
                "§dᴹᴵᴷᵁ ᴹᴵᴷᵁ ᴰᴼᴺᴳᴰᴼᴺᴳ♪♪"
        });
        holidays.put("2-9", new String[] {
                "§e🌟 超天酱生日",
                "§d让世界充满你的电波吧喵～",
                "§bINTERNET OVERDOSE",
                "§5(✧∇✧)╯╰(✧∇✧)̣"
        });

        // 碧蓝档案角色生日
        holidays.put("1-2", new String[] {
                "§e📚 碧蓝档案 小鸟游星野生日",
                "§9哈...好困...但今天会打起精神的~",
                "§1(∪｡∪)｡｡｡zzz"
        });
        holidays.put("1-3", new String[] {
                "§e🧪 碧蓝档案 药子沙耶生日",
                "§b今天是沙耶的生日喵～",
                "§d祝你实验顺利，天天开心！"
        });
        holidays.put("1-3", new String[] {
                "§e🎨 碧蓝档案 浦和花子生日",
                "§b花子的生日到啦喵～",
                "§d愿你的画作越来越棒！"
        });
        holidays.put("1-5", new String[] {
                "§e🎼 碧蓝档案 音濑小玉生日",
                "§b小玉的生日喵～",
                "§d愿你的音乐带来更多快乐！"
        });
        holidays.put("1-6", new String[] {
                "§e🎯 碧蓝档案 鹫见芹奈生日",
                "§b芹奈的生日到啦喵～",
                "§d愿你的射击技术更上一层楼！"
        });
        holidays.put("1-7", new String[] {
                "§e📖 碧蓝档案 月雪都子生日",
                "§b都子的生日喵～",
                "§d愿你的知识越来越丰富！"
        });
        holidays.put("1-30", new String[] {
                "§e🖌️ 碧蓝档案 栗村爱莉生日",
                "§b爱莉的生日到啦喵～",
                "§d愿你的创作灵感源源不断！"
        });
        holidays.put("2-2", new String[] {
                "§e🛡️ 碧蓝档案 角楯花凛生日",
                "§b花凛的生日喵～",
                "§d愿你守护的每一天都充满阳光！"
        });
        holidays.put("2-3", new String[] {
                "§e🌸 碧蓝档案 春日椿生日",
                "§b椿的生日到啦喵～",
                "§d愿你的春天永远灿烂！"
        });
        holidays.put("2-5", new String[] {
                "§e🍰 碧蓝档案 春原旬生日",
                "§b旬的生日喵～",
                "§d愿你的甜点带来更多幸福！"
        });
        holidays.put("2-19", new String[] {
                "§e☀️ 碧蓝档案 空崎阳奈生日",
                "§b阳奈的生日到啦喵～",
                "§d愿你的笑容如阳光般温暖！"
        });
        holidays.put("2-20", new String[] {
                "§e🧘 碧蓝档案 天见和香生日",
                "§b和香的生日喵～",
                "§d愿你的心灵永远平静如水！"
        });
        holidays.put("3-1", new String[] {
                "§e🎭 碧蓝档案 黑馆羽留奈生日",
                "§b羽留奈的生日到啦喵～",
                "§d愿你的表演魅力四射！"
        });
        holidays.put("3-12", new String[] {
                "§e🧩 碧蓝档案 陆八魔亚瑠生日",
                "§b亚瑠的生日喵～",
                "§d愿你的智慧解开所有谜题！"
        });
        holidays.put("3-14", new String[] {
                "§e📊 碧蓝档案 早濑优香生日",
                "§b优香的生日到啦喵～",
                "§d愿你的账本永远平衡！"
        });
        holidays.put("3-15", new String[] {
                "§e💧 碧蓝档案 水羽三森生日",
                "§b三森的生日喵～",
                "§d愿你的每一天都清新如水！"
        });
        holidays.put("3-17", new String[] {
                "§e🧵 碧蓝档案 鬼方佳世子生日",
                "§b佳世子的生日到啦喵～",
                "§d愿你的手工艺品精致无比！"
        });
        holidays.put("3-24", new String[] {
                "§e🎮 碧蓝档案 一之濑明日奈生日",
                "§b明日奈的生日喵～",
                "§d愿你的游戏之路畅通无阻！"
        });
        holidays.put("3-25", new String[] {
                "§e🤖 碧蓝档案 天童爱丽丝生日",
                "§b爱丽丝的生日到啦喵～",
                "§d愿你的机械伙伴永远可靠！"
        });
        holidays.put("4-1", new String[] {
                "§e🎨 碧蓝档案 室笠朱音生日",
                "§b朱音的生日喵～",
                "§d愿你的艺术作品感动人心！"
        });
        holidays.put("4-2", new String[] {
                "§e🐱 碧蓝档案 猫塚响生日",
                "§b响的生日到啦喵～",
                "§d愿你的猫咪朋友永远陪伴！"
        });
        holidays.put("4-7", new String[] {
                "§e🧊 碧蓝档案 冰室濑奈生日",
                "§b濑奈的生日喵～",
                "§d愿你的冷静头脑解决一切问题！"
        });
        holidays.put("4-9", new String[] {
                "§e🌸 碧蓝档案 空井咲希生日",
                "§b咲希的生日到啦喵～",
                "§d愿你的春天充满希望！"
        });
        holidays.put("4-16", new String[] {
                "§e🍬 碧蓝档案 下江小春生日",
                "§b小春的生日到啦喵～",
                "§d愿你的生活甜甜蜜蜜，像糖果一样可口喵～",
                "§d今天就让我们一起庆祝这位可爱少女的特别日子吧！"
        });
        holidays.put("4-19", new String[] {
                "§e🎐 碧蓝档案 小钩晴生日",
                "§b晴的生日到啦喵～",
                "§d愿你的每一天都如晴天般明朗！"
        });
        holidays.put("4-23", new String[] {
                "§e📚 碧蓝档案 古关忧生日",
                "§b忧的生日喵～",
                "§d愿你的知识之旅充满乐趣！"
        });
        holidays.put("4-26", new String[] {
                "§e🎀 碧蓝档案 各务千寻生日",
                "§b千寻的生日到啦喵～",
                "§d愿你的生活如丝般顺滑！"
        });
        holidays.put("4-30", new String[] {
                "§e🌸 碧蓝档案 爱清风华生日",
                "§b风华的生日喵～",
                "§d愿你的每一天都充满清新的气息！"
        });
        holidays.put("5-1", new String[] {
                "§e🌟 碧蓝档案 和泉元英美生日",
                "§b英美的生日到啦喵～",
                "§d愿你的未来充满无限可能！"
        });
        holidays.put("5-11", new String[] {
                "§e💐 碧蓝档案 狮子堂泉生日",
                "§b泉的生日喵～",
                "§d愿你的生活如花般绚烂！"
        });
        holidays.put("5-12", new String[] {
                "§e🎨 碧蓝档案 朝颜花绘生日",
                "§b花绘的生日到啦喵～",
                "§d愿你的艺术之路越走越宽！"
        });
        holidays.put("5-13", new String[] {
                "§e🌿 碧蓝档案 伊草遥香生日",
                "§b遥香的生日喵～",
                "§d愿你的每一天都充满生机！"
        });
        holidays.put("5-16", new String[] {
                "§e🚴 碧蓝档案 砂狼白子生日",
                "§b白子的生日到啦喵～",
                "§d愿你的骑行之旅充满乐趣！"
        });
        holidays.put("5-17", new String[] {
                "§e🌞 碧蓝档案 若叶日向生日",
                "§b日向的生日喵～",
                "§d愿你的每一天都阳光明媚！"
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


        String key = month + "-" + day;
        return holidays.getOrDefault(key, null);
    }
}
