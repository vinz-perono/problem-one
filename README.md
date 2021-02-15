# EBI TECHNICAL TEST

### Import project
Import the project on any IDE as existing maven project

### H2 In-memory database is used as POC for this test
* Refer to screenshot -> H2-Admin-Console.jpg

### Build project
Build the project using "mvn clean install" or whichever is prefered

### Deploy the project using Docker container
1 BUILD the image
	
	* docker image build -t problem-one-crud-operation .
	
2 RUN the image as container and published docker port 8080 to centos port 8080
	
	* docker container run --name ebi-tech-test -p 8080:8080 -d problem-one-crud-operation
	
	* Refer to screenshot -> Docker-Desktop-Image.jpg
	
3 CHECK the logs
	
	* docker container logs ebi-tech-test

### API's
Open the postman tool and hit the following urls to display the data in the json format.

* POST http://localhost:8080/ebi/person -> returns ID
* GET http://localhost:8080/ebi/allperson -> return List of Persons
* GET http://localhost:8080/ebi/person/{id} -> returns a specific Person based on ID
* DELETE http://localhost:8080/ebi/allperson -> deletes all Person record
* DELETE http://localhost:8080/ebi/person/{id} -> deletes a specific Person based on ID
* PUT http://localhost:8080/ebi/persons -> Update a person and returns the updated record


