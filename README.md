# springcloud-combat
springcloud combat learning sample.  

1. 高可用注册中心.  
  jar包启动顺序:  
  java -jar eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=peer1  
  java -jar eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=peer2  
  java -jar service-hello-1.0-SNAPSHOT.jar  
  访问:  
  http://peer1:1111/  
  http://peer1:1112/   
  
2. Ribbon负载均衡.
  jar包启动顺序:  
  java -jar eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=peer1  
  java -jar eureka-server-1.0-SNAPSHOT.jar --spring.profiles.active=peer2  
  java -jar service-hello-1.0-SNAPSHOT.jar  
  java -jar ribbon-consumer-1.0-SNAPSHOT.jar  
  访问：  
  http://localhost:9000/ribbon-consumer  
  注解：@LoadBalanced
  this.restTemplate.getForEntity使用.  

