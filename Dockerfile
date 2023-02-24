FROM amazoncorretto:17
MAINTAINER catalinabenegas
COPY Portfolio.jar portfolio-backend.jar
ENTRYPOINT ["java","-jar","/Portfolio.jar"]