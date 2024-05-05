FROM maven:3.8.3-openjdk-17

COPY src /home/app/src
COPY pom.xml /home/app

WORKDIR /home/app

RUN mvn clean package
WORKDIR /home/app/target
CMD ["java", "-Xms512m", "-Xmx1024m", "-jar", "LoadBalancerTester-0.0.1-SNAPSHOT.jar"]