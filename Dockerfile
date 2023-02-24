FROM amazoncorretto:17
MAINTAINER catalinabenegas
COPY target/Portfolio.jar Portfolio.jar
ENTRYPOINT ["java","-jar","/Portfolio.jar"]