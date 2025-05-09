﻿# 🐾 Neko 插件介绍

欢迎使用「neko」——一个为 Minecraft 生存模式定制的、富有趣味与整蛊精神的猫娘风格插件。

本插件围绕“猫娘世界”的设定，提供一系列恶搞、趣味、带有世界观彩蛋的命令，旨在为服务器增添一丝混沌与萌系气氛。

---

## 🎮 插件主要功能

- 🧨 **崩溃指令**：强制目标玩家客户端卡死（整蛊用，慎用！）
- 🐱 **猫娘自毁指令**：用 `/514` 或 `/killneko` 触发“猫娘终焉”演出。
- 💫 **运势系统**：通过 `/luck` 命令查看今日人品指数。
- 🔁 **配置热重载**：无需重启服务器，即时生效配置更改。
- ⚔️ **不明阵营交锋**：隐藏指令 `/MTF` 与 `/FTM`，埋藏彩蛋内容。
- 💀 **角色扮演**：通过各种命令增强玩家的沉浸式扮演体验。
- 📢 **登录登出提示**：让猫娘来欢迎与送别你的玩家。
- 🏞 **群系与维度提示**：为每一处地形与维度编写独特标题与描述。
- 📅 **节日祝福系统**：在特定日期触发角色生日与节日彩蛋。
- ☠ **死亡提示扩展**：更具表现力的死亡信息广播。

---

## 💻 命令一览

| 指令             | 描述                       | 权限            |
|----------------|--------------------------|---------------|
| `/514`         | 杀死猫娘（喵喵喵？！）就是自杀          | 无需权限          |
| `/killneko`    | 也是杀死猫娘……                 | 无需权限          |
| `/luck`        | 今日人品（人品值由插件随机生成）         | 无需权限          |
| `/xnm reload`  | 重载插件配置                   | `neko.reload` |
| `/crash <玩家>`  | 强制使目标玩家客户端完全卡死（其实崩不掉，纯恶搞） | `neko.crash`  |
| `/MTF`         | 不告诉你喵（隐藏指令）              | 无需权限          |
| `/FTM`         | 不告诉你喵（隐藏指令）              | 无需权限          |

---

## 🧠 世界观设定

> 世界分为两个阵营：**MTF（木桶饭）** 与 **FTM（飞天猫）**。
>
> 玩家在执行某些命令后可能会触发特定彩蛋剧情，例如神秘的崩溃仪式、猫娘的终极觉醒等。
>
> “514”是隐藏的祭文代码，仅限真正理解猫娘的人执行——以命换喵，代价惨烈。
>
> 崩溃指令 `/crash` 是一把双刃剑，玩笑与毁灭仅一线之隔(其实压根不会崩溃，纯恶搞)。
![img_1.png](img_1.png)

---

## 📝 登录与退出提示

- 登录广播：  
  `喵！猫娘 %player% 钻进了猫窝喵~！`

- 离线广播：  
  `猫娘 %player% 离开猫窝去玩毛线球了喵！`

- 登录时标题：  
  `欢迎回来，%player%！`

- 副标题：  
  `你被猫窝想念了。`

- 登录音效：  
  `ENTITY_EXPERIENCE_ORB_PICKUP`

- 可配置的随机欢迎语：
    - 今天也是充满希望的一天。
    - 小奶猫想你了喵～
    - 我们都在等你上线。
    - 愿你与世界温柔相拥。

---

## 🗺 群系提示系统（biome_titles）

玩家进入以下任一群系时会弹出提示标题和副标题：

- 平原 → “辽阔又宁静的原野”
- 向日葵平原 → “明亮且充满阳光的地方”
- 繁花森林 → “花朵盛开，美不胜收”
- 黑森林 → “阴影笼罩，危险潜伏”
- 巨型松林 → “壮观的绿色高塔”
- 更多群系可在 `config.yml` 中继续定义
![群系](docs/qunxi.png)

---

## 🌌 维度进入提示（dimension_titles）

插件在玩家穿越维度时自动提示：

- 主世界 → 欢迎回来，勇者
- 地狱 → 火与血的世界
- 末地 → 无尽虚空的终点
  ![维度](docs/weidu.png)

---

## 📅 节日系统（节日问候）

插件内置节日彩蛋，例如：

- `1月2日`：小鸟游星野生日
- `1月3日`：药子沙耶 & 浦和花子
- `1月5日`：音濑小玉
  ⋯⋯

> 每个节日都会显示不同的标题、祝福语和配色，强化沉浸感与代入感。

---

## ☠ 玩家死亡提示

当玩家死亡时，插件会触发事件，扩展提示与行为。例如：

- 自定义死亡信息样式
- 后续可扩展音效或粒子表现
![自杀](img.png)

---

## 📁 插件配置结构示例（config.yml）

```yaml
#加入消息
join:
  broadcast: "&a喵！猫娘 &f%player% &a钻进了猫窝喵~！"
  title: "&b欢迎回来，%player%！"
  subtitle: "&7你被猫窝想念了。"
  #音效
  sound: "ENTITY_EXPERIENCE_ORB_PICKUP"
  #随机语录
  quotes:
    - "今天也是充满希望的一天。"
    - "小奶猫想你了喵～"
    - "我们都在等你上线。"
    - "愿你与世界温柔相拥。"

#退出消息
quit:
  broadcast: "&c猫娘 &f%player% &c离开猫窝去玩毛线球了喵！"

#群系提示
#主世界
biome_titles:
  PLAINS:
    title: "&f平原"
    subtitle: "&7辽阔又宁静的原野"
  SUNFLOWER_PLAINS:
    title: "&e向日葵平原"
    subtitle: "&6明亮且充满阳光的地方"
  FOREST:
    title: "&2森林"
    subtitle: "&a树木繁茂，生机勃勃"
  FLOWER_FOREST:
    title: "&d繁花森林"
    subtitle: "&5花朵盛开，美不胜收"
  BIRCH_FOREST:
    title: "&f白桦森林"
    subtitle: "&7树影婆娑的静谧之地"
  OLD_GROWTH_BIRCH_FOREST:
    title: "&f巨型白桦林"
    subtitle: "&7树干高耸入云"
  DARK_FOREST:
    title: "&8黑森林"
    subtitle: "&0阴影笼罩，危险潜伏"
  TAIGA:
    title: "&3针叶林"
    subtitle: "&b寒冷中依然顽强生长"
  SNOWY_TAIGA:
    title: "&b雪原针叶林"
    subtitle: "&f铺满白雪的林地"
  OLD_GROWTH_PINE_TAIGA:
    title: "&3巨型松林"
    subtitle: "&b壮观的绿色高塔"
  OLD_GROWTH_SPRUCE_TAIGA:
    title: "&2巨型云杉林"
    subtitle: "&a冷杉林地，生机盎然"
  DESERT:
    title: "&e沙漠"
    subtitle: "&6炎热干燥，寸草不生"
  SAVANNA:
    title: "&6热带草原"
    subtitle: "&e阳光充沛的开阔地"
  WINDSWEPT_SAVANNA:
    title: "&6风蚀草原"
    subtitle: "&e地形奇特，狂风呼啸"
  JUNGLE:
    title: "&2丛林"
    subtitle: "&a密集的绿意"
  SPARSE_JUNGLE:
    title: "&a稀疏丛林"
    subtitle: "&7比想象中更安静"
  BAMBOO_JUNGLE:
    title: "&a竹林"
    subtitle: "&2熊猫的乐园"
  SWAMP:
    title: "&2沼泽"
    subtitle: "&a水草丛生，青蛙栖息"
  MANGROVE_SWAMP:
    title: "&4红树林沼泽"
    subtitle: "&c盘根错节的湿地"
  SNOWY_PLAINS:
    title: "&f雪原"
    subtitle: "&7纯净的白色世界"
  ICE_SPIKES:
    title: "&b冰刺平原"
    subtitle: "&f晶莹剔透的寒地奇观"
  SNOWY_SLOPES:
    title: "&f雪坡"
    subtitle: "&7小心雪崩喵！"
  GROVE:
    title: "&f林间空地"
    subtitle: "&7安静的雪林环绕"
  FROZEN_PEAKS:
    title: "&b冰封山峰"
    subtitle: "&f高耸入云，寒气逼人"
  JAGGED_PEAKS:
    title: "&f锯齿山峰"
    subtitle: "&7地形陡峭，步步惊心"
  STONY_PEAKS:
    title: "&8石质山峰"
    subtitle: "&7寸草不生的寒石壁"
  MEADOW:
    title: "&a山地草甸"
    subtitle: "&2花草掩映，宁静如画"
  CHERRY_GROVE:
    title: "&d樱花林"
    subtitle: "&5粉色的梦境之地"
  BEACH:
    title: "&6海滩"
    subtitle: "&e海风轻抚的细沙岸"
  SNOWY_BEACH:
    title: "&f雪滩"
    subtitle: "&7被寒风吹拂的海岸"
  STONY_SHORE:
    title: "&8石岸"
    subtitle: "&7沉稳的灰色边界"
  RIVER:
    title: "&b河流"
    subtitle: "&9水流潺潺"
  FROZEN_RIVER:
    title: "&f冰河"
    subtitle: "&7表面结冰的寒水"
  OCEAN:
    title: "&1海洋"
    subtitle: "&9浩瀚的蓝色世界"
  DEEP_OCEAN:
    title: "&1深海"
    subtitle: "&3深邃未知的深处"
  LUKEWARM_OCEAN:
    title: "&3温暖海洋"
    subtitle: "&b舒适的水域"
  DEEP_LUKEWARM_OCEAN:
    title: "&3深温暖海"
    subtitle: "&b宜居的海底世界"
  WARM_OCEAN:
    title: "&3温暖海洋"
    subtitle: "&b海水温暖，热带鱼群在你身边穿梭"
  SAVANNA_PLATEAU:
    title: "&6热带高原"
    subtitle: "&e广阔又干燥的高地"
  COLD_OCEAN:
    title: "&3寒冷海洋"
    subtitle: "&b清冷的海水"
  DEEP_COLD_OCEAN:
    title: "&3深寒冷海"
    subtitle: "&b寒流涌动"
  FROZEN_OCEAN:
    title: "&f冰洋"
    subtitle: "&7极寒之地"
  DEEP_FROZEN_OCEAN:
    title: "&f深冰洋"
    subtitle: "&7寒气彻骨"
  DRIPSTONE_CAVES:
    title: "&8溶洞"
    subtitle: "&7滴水石锥构筑的地下世界"
  LUSH_CAVES:
    title: "&a繁茂洞穴"
    subtitle: "&2绿色地下花园"
  DEEP_DARK:
    title: "&8深暗之域"
    subtitle: "&0噤声，别惊扰了祂……"
  MUSHROOM_FIELDS:
    title: "&d蘑菇岛"
    subtitle: "&5和平又稀有的奇地"

  #地狱
  NETHER_WASTES:
    title: "&c地狱荒地"
    subtitle: "&4炽热、荒芜、充满危险"

  SOUL_SAND_VALLEY:
    title: "&b灵魂沙谷"
    subtitle: "&3灵魂在耳边低语，死寂之地"

  CRIMSON_FOREST:
    title: "&c绯红森林"
    subtitle: "&4红如血的森林，危险潜伏"

  WARPED_FOREST:
    title: "&3扭曲森林"
    subtitle: "&2寂静又奇异，是最安全的地狱地带"

  BASALT_DELTAS:
    title: "&8玄武岩三角洲"
    subtitle: "&7黑灰翻滚，岩浆喷发的灾地"

  #末地
  THE_END:
    title: "&5末地主岛"
    subtitle: "&d终结与开始的交汇之地"
  END_HIGHLANDS:
    title: "&5末地高地"
    subtitle: "&d浮空的岛屿上，植物依旧生长"

  END_MIDLANDS:
    title: "&5末地中地"
    subtitle: "&7高地与荒原之间的过渡之地"

  SMALL_END_ISLANDS:
    title: "&5末地浮岛"
    subtitle: "&8孤立的岛屿，通向未知"

  END_BARRENS:
    title: "&8末地荒原"
    subtitle: "&7边缘地带，空无一物"

#维度副标题，也就是第三行消息
#随机语录
quotes:
  #主世界
  normal:
    - "欢迎回到熟悉的世界。"
    - "一切从这里开始，也许也会在这里结束。"
  #地狱
  nether:
    - "地狱之火不会温暖你。"
    - "灵魂沙在低语。"
  #末地
  end:
    - "这是世界尽头的边界。"
    - "终末即启始。"
  #未知维度，或者是mod创建的维度
  unknown:
    - "你走入了被遗忘的角落。"
    - "这里不属于任何人……"

```


## 🙏 特别鸣谢

由「不穿胖次の小奶猫」精心编写，献给所有喜爱猫娘与整蛊精神的玩家。

官网地址：[https://cnmsb.xin](https://cnmsb.xin)

---

> ✨ 如果你喜欢这个插件，请在崩溃玩家前大喊一声“喵”！
