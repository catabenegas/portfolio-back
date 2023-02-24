FROM amazoncorretto:17-alpine-jdk
MAINTAINER catalinabenegas
COPY Portfolio.jar Portfolio.jar
ENTRYPOINT ["java","-jar","/Portfolio.jar"]