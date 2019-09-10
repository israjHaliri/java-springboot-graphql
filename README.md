## Needed /Tech stacks
    + java 8
    + mavem 3+

## To build follow this checklist:
    + mvn clean install
    + mvn spring-boot:run
    + open http://localhost:8080/graphiql and put one of :
    + mutation{
          createUser(name: ""){
              name
              id
          }
    + query{
          users {
              name
              id
          }
      }
