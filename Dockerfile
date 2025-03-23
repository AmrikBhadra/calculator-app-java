# pull base image
FROM openjdk:17-jdk-alpine

# create a folder in base image where app code will be stored inside container
WORKDIR /app

# copy the source code of project from host to the container's working dir
COPY src/Main.java /app/Main.java

# compile the java file
RUN javac Main.java

# run the application 
CMD ["java", "Main"]