FROM amazoncorretto:17
MAINTAINER catalinabenegas
COPY Portfolio.jar Portfolio.jar
ENTRYPOINT ["java","-jar","/Portfolio.jar"]