# spring-aop POC

Simple application that shows usage of Spring AOP. 
It simulates seamless usage of external modules within the application.

Application consists of: 
- ApplicationStarter - application entry point, sets up application context and invokes EmployeeService's "save" method for simulation purposes
- ApplicationConfiguration - application configuration class
- EmployeeService - simulates saving employee behaviour 
- EmployeeEntity - represents employee
- EmployeeProcessingAspect - aspect that intercepts "save" operation invoked on EmployeeService
- EmployeeProcessors - modules/plugins that are responsible for "processing" EmployeeEntity object. 
