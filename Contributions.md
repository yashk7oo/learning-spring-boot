# learning-spring-boot

## Spring Boot Quick Start

# 1 Initialized maven application and imported to IDE. Created couple of rest controllers.

# 2 Included devtools dependent to automatically reload application while making changes during application run and tested

# 3 Added actuator dependency and exposed all endpoints using application.properties file

# 4 Spring security dependency added to secure endpoints

# 5 Tested spring properties by changing server port and application context

## Spring Core

# 1 Constructor injection configured for Car interface

# 2 Configured setter injection on the controller using car as dependency

# 3 Checked field injection as well which is no more recommended due to difficulty in writing unit test

# 4 Configured @Qualifier to specify bean to inject and also checker @Primary annotation to specify bean priority to inject(Qualifier > Primary)

# 5 @Lazy annotation specified to initialize bean only if required(spring.main.lazy-initialization=true for global to set all beans lazy)

# 6 Bean scopes checked and modified(default singelton, @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE))

# 7 Bean lifecycle methods( @PostConstruct, @PreDestroy)

# 8 In case of prototype beans(They are @lazy by default. @PreDestroy no called on them)

# 9 @Configuration and @Bean used to configure the beans maybe for 3rd party integrations such as s3.


