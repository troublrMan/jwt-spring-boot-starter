# jwt-spring-boot-starter
> 自定义 spring jwt starter
## jwt(json web token)定义
>jwt是为了在网络应用环境间传递声明而执行的一种基于json的开放标准。该token被设计紧凑且安全的，特别适用于SSO场景。
jwt的声明一般被用来在身份提供者和服务提供者之间传递被认证的用户身份信息。

## jwt组成
JWT通常由三部分组成，头信息(header)、消息体(body)、签名(signature)
1.头部信息
> 头信息指定了JWT使用的签名算法
header={alg=HS512}
2.消息体
> 包含了JWT的意图，exp为令牌过期时间(可以自定义时长)
body={sub=testUsername, exp=1510886546}
## starter是什么？
在springboot中，使用的最多的就是starter。starter可以理解为一个可拔插式的插件，例如，你想使用jdbc插件，那么可以使用spring-boot-starter-jdbc；如果想使用mongodb，可以使用spring-boot-starter-data-mongodb。 自定义starter
## 我的starter样式
1.SpringBoot 在启动时会去依赖的starter包中寻找 resources/META-INF/spring.factories 文件，然后根据文件中配置的Jar包去扫描项目所依赖的Jar包，这类似于 Java 的 SPI 机制。
2.根据 spring.factories配置加载AutoConfigure类。
3.创建Spring boot项目添加依赖
```
<groupId>troubleMan</groupId>
<artifactId>jwt-spring-boot-starter</artifactId>
<version>1.0-SNAPSHOT</version>
<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-configuration-processor</artifactId>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-autoconfigure</artifactId>
    </dependency>
</dependencies>

```
4.JwtUtils
jwt的具体实现
5.JwtAutoConfiguration
jwt自动装配类（最重要的类，没有此类，spring boot不会自动扫描jar）

