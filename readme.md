步骤  | 操作
  --- | ---
 安装redis  | https://github.com/MSOpenTech/redis/releases
 运行环境  | jdk1.7 + MySQL5.5
 运行建库脚本 | [sys_user.sql](https://github.com/vivtoum/cloud-auth/blob/master/sys_user.sql)
 登录账号密码| vedyou@qq.com  123456
 
 
>服务注册(基于eureka)
>
>项目名称:service-registry-server
>
>**端口号:8761**
>
>启动类:cn.com.springcloudtest.cloud.service.registry.ServiceRegistryServerApplication

>网关服务(基于zuul)
>
>项目名称:api-gateway-server
>
>**端口号:8080**
>
>启动类:cn.com.springcloudtest.cloud.api.gateway.ApiGatewayServerApplication

>认证服务(基于oauth2及spring security)
>
>项目名称:uaa-server
>
>**端口号:7769**
>
>启动类:cn.com.springcloudtest.cloud.uaa.UaaServerApplication