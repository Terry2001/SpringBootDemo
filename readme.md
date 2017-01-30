# 演示 Spring Boot 的各项功能

* eurekaServer  实现一个服务注册中心
* eurekaClient  实现一个服务，将自己注册到服务中心
* eurekaConsumer 实现一个消费者，使用服务中心的服务
* configServer  实现一个配置中心
* configRepo  保存配置中心的各个配置文件
* configClient  在程序中获取配置中心的配置
* configServerWithEureka  实现一个配置中心并把自己注册到服务中心
* configClientWithEureka  通过 Eureka 获取配置中心地址，然后获取配置
* configClientWithEurekaAndMybatis  通过 Eureka 获取配置中心地址，然后获取 MyBatis 的配置
