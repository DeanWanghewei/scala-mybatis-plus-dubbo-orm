# 测试用Scala写spring-boot应用。并且orm 框架使用的是mybatis-plus. 并且使用dubbo RPC调用测试
## 项目目的
- 使用Scala写spring-boot 应用。
- orm 层使用mybatis-plus. 并且尝试使用mybatis-plus 代理的方法。
- 使用dubbo 测试 scala Bean 的RPC调用的序列化与反序列化
## 项目方案
1. 使用微服务的方式创建了二个spring-boot服务，并且之间的关系在dubbo 的角色中 一个是provider，一个是consumer。
2. 使用zookeeper 作为dubbo 的注册中心。
3. 使用mybatis-plus 作为orm 框架，目的是为了使用mybatis-plus 的灵活性以及提前封装的一些特性
4. 使用druid 作为数据库连接池。
## 项目结论
1. 使用Scala作为mybatis 的实体类时，必须要继承 `java.io.Serializable` 序列化。
2. 基础数据类型要转换成 Java的基础数据类型。
3. dubbo 使用集合（如 list.Map 等）需要转成Java的集合类来作为入参或者返参。