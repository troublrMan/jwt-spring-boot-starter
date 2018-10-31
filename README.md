# jwt-spring-boot-starter
> 自定义 spring jwt starter
## jwt(json web token)定义
>jwt是为了在网络应用环境间传递声明而执行的一种基于json的开放标准。该token被设计紧凑且安全的，特别适用于SSO场景。
jwt的声明一般被用来在身份提供者和服务提供者之间传递被认证的用户身份信息。

## jwt组成
JWT通常由三部分组成，头信息(header)、消息体(body)、签名(signature)
1.头部信息
>>  头信息指定了JWT使用的签名算法
header={alg=HS512}
>> 消息体包含了JWT的意图，exp为令牌过期时间(可以自定义时长)
body={sub=testUsername, exp=1510886546}
## starter是什么？
在springboot中，使用的最多的就是starter。starter可以理解为一个可拔插式的插件，例如，你想使用jdbc插件，那么可以使用spring-boot-starter-jdbc；如果想使用mongodb，可以使用spring-boot-starter-data-mongodb。 自定义starter
## 我的starter样式
