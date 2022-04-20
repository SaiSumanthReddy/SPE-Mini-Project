FROM openjdk:8
MAINTAINER sumanthreddy084 Sai.Sumanth@iiitb.ac.in
COPY ./target/Calculator-0.1-ALPHA-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Calculator-0.1-ALPHA-jar-with-dependencies.jar"]
