FROM openjdk:8

LABEL maintainer="sanskarram992@gmail.com" version="1.0" description="This is a sample user image"

WORKDIR /home/ubuntu/app

ENV MAVEN_VERSION=3.8.3
ENV MAVEN_HOME=/opt/maven
ENV PATH=$MAVEN_HOME/bin:$PATH

# Install dependencies and Maven
RUN apt-get update && apt-get install -y wget unzip && wget https://archive.apache.org/dist/maven/maven-3/3.8.3/binaries/apache-maven-3.8.3-bin.zip && \
unzip apache-maven-3.8.3-bin.zip -d /opt && rm apache-maven-3.8.3-bin.zip && mv /opt/apache-maven-3.8.3 $MAVEN_HOME

RUN mvn -version

COPY ./pom.xml ./pom.xml
COPY ./src ./src

RUN mvn clean package

EXPOSE 9083

RUN mv ./target/*.jar ./target/user.jar

CMD ["java", "-jar", "./target/user.jar"]