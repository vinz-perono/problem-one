From openjdk:11
copy ./target/problem-one-crud-operation-0.0.1-SNAPSHOT.jar problem-one-crud-operation-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","problem-one-crud-operation-0.0.1-SNAPSHOT.jar"]