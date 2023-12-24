# learning-spring-boot

## Spring Boot Quick Start

# 1 Initialized maven application and imported to IDE. Created couple of rest controllers.

# 2 Included devtools dependency to automatically reload application while making changes during application run and tested

# 3 Added actuator dependency and exposed all endpoints using application.properties file

# 4 Spring security dependency added to secure endpoints

# 5 Tested spring properties by changing server port and application context


## Spring Core

# 1 Constructor injection configured for Car interface

# 2 Configured setter injection on the controller using car as dependency

# 3 Checked field injection as well which is no more recommended due to difficulty in writing unit test (@Autowired)

# 4 Configured @Qualifier to specify bean to inject and also checked @Primary annotation to specify bean priority to inject(Qualifier > Primary)

# 5 @Lazy annotation specified to initialize bean only if required(spring.main.lazy-initialization=true for global to set all beans lazy)

# 6 Bean scopes checked and modified(default singelton, @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE))
There are five types of spring bean scopes:

singleton - only one instance of the spring bean will be created for the spring container. This is the default spring bean scope. While using this scope, make sure bean doesn’t have shared instance variables otherwise it might lead to data inconsistency issues.
prototype – A new instance will be created every time the bean is requested from the spring container.
request – This is same as prototype scope, however it’s meant to be used for web applications. A new instance of the bean will be created for each HTTP request.
session – A new bean will be created for each HTTP session by the container.
global-session – This is used to create global session beans for Portlet applications.

# 7 Bean lifecycle methods( @PostConstruct, @PreDestroy)

# 8 In case of prototype beans(They are @lazy by default. @PreDestroy not called on them)

# 9 @Configuration and @Bean used to configure the beans maybe for 3rd party integrations such as s3.


