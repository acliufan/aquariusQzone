# 使用指南

1. ## 使用说明

   ## 该项目在\resources\META-INF\applicationContext.xml中配置数据库连接参数后，在idea环境下，即可正常运行。

2. ## 功能描述

   这是一个基于`Spring+Spring Data Jpa/Hibernate`框架并使用`websocket`技术的用户间即使通讯的`demo`，即可以在此框架上继续开发系统也可在`websocket`上继续扩充即时通讯功能。

   级联查询、事务均已实现

3. ## 日志文件描述

   ### `upperDebug.txt`

   此文件夹带日期：高于debugger的事件历史记录
   后缀不为日期名：为当天高于debugger的事件历史记录

   ### `error.txt`

   此文件夹带日期：error的事件历史记录
   后缀不为日期名：为当天error事件历史记录