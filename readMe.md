# 技术积累项目


## 项目结构
- base-基础：java基础、线程池、
  - [java并发的艺术读书笔记（未完成）](src/main/java/com/huyuhui/leanproduct/base/concurrencyProgramming/java并发编程的艺术读书笔记.md)
- businessAnalysis-业务分析：认证功能（0）、权限设计（0）、聊天（0）
- database-数据库：mysql（0）、mongodb（0）、事务（0）
- framework-框架知识：spring、mybatis、cloud
  - [Spring工厂模式（未看完）](src/main/java/com/huyuhui/leanproduct/framework/out/spring/readME.md)
  - [MVC三层架构使用类分层做数据隔离](src/main/java/com/huyuhui/leanproduct/framework/own/mvcClass/readMe.md)
- middleware-中间件：MQ、redis
  - [redis锁设计](src/main/java/com/huyuhui/leanproduct/middleware/redis/readMe.md)
- project-开源项目：crmeb
  - [crmeb项目学习](src/main/java/com/huyuhui/leanproduct/project/crmeb/readMe.md)
- tool-工具：forest
  - [forest工具尝试（未完成）](src/main/java/com/huyuhui/leanproduct/tool/forest/readMe.md)

## 近期文章
- [Spring工厂模式（未看完）](src/main/java/com/huyuhui/leanproduct/framework/out/spring/readME.md)
- [MVC三层架构使用类分层做数据隔离](src/main/java/com/huyuhui/leanproduct/framework/own/mvcClass/readMe.md)


## 心得

从项目出发去关注真正常用、重要的技术底层

确定了需要就静下心来慢慢做，不过也不要忽视了总体的视角

重要的不是积累了多少，而是结合实际对每一个点实际掌握

永远只以项目中出现问题的地方为出发点去积累技术

ai只是帮助，要转化成自己的才有用



https://www.bilibili.com/list/watchlater?oid=113742410948516&bvid=BV1iz6GYKEPt&spm_id_from=333.1387.top_right_bar_window_view_later.content.click


研究技术需要找对方向，不然效率很低，需要检视自己在一个方向的研究所花的时间和成果的比例

## 工作问题
### 项目能力不足
**项目复杂，之前设计的又不是很好，所以熟悉起来慢还不敢改**

我是前面集中弄明白要需求、老的流程、新流程的实现方案，然后再做可维护性的修改，比如枚举、画流程图、idea书签，我觉得已经很高效了，但在第一次进项目的时候还是需要很长时间的适应，我觉得也归咎于我的项目能力少了

比如财务、税务尽调入库的字段控制，这里做的就很差，我从代码上都看不出这些字段有哪些，还要看入参才能知道哪些字段入库了哪些没有
就像是把1+1=2拆成了1+0.5+0.5=2一样

### 对我来说，工作是什么？
我之前一直在想，现在工作做的不满意，同事混，老给我背锅，我就想换工作，但是换什么样的公司、工作环境是让我满意的？

要升职，就要了解上层做的事，在往上就是要了解公司、了解产品、了解行业，

所以，对我来说，每天都要花8小时又逃不掉的工作，到底意味着什么？之前想到这个就不想工作了，因为我想花时间去提升自己，而不是做枯燥无聊的工作

但在这份枯燥无聊之后，其实就是行业知识和重大决策

我觉得我应该选择和我目标相同的工作，让工作成为我的助力

**工作对我来说，应该是能让我快速了解这个世界规则的途径之一**

我的目的就是这个，所以可以根据这个目的选择工作，不满足的就放弃选择

就像之前觉得想的做生意，也是一条路

## 技术问题
mq的使用

我总是不敢用mq，最怕的就是消息的丢失，在报告生成流程里，用异步发送mq消息通知生成报告比定时任务轮询报告状态肯定更好

但是我很怕会错过，比如