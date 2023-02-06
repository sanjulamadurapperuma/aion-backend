# Class structure of backend component
## 1 - UserNotFoundException
   ### 1.1 - Operations
    UserNotFoundException(s : String)
## 2 - Employee
### 2.1 - Attributes
	id : Long
	name : String
	email : String
	jobTitle : String
	phoneNumber : String
	imageUrl : String
	code : String
### 2.2 - Operations
	Employee()
	Employee(id : Long, name : String, email : String, jobTitle : String, phoneNumber : String, imageUrl : String, code : String)
	getId() : Long
	setId(id : Long)
	getName() : String
	setName(name : String)
	getEmail() : String
	setEmail(email : String)
	getJobTitle() : String
	setJobTitle(jobTitle : String)
	getPhoneNumber() : String
	setPhoneNumber(phoneNumber : String)
	getImageUrl() : String
	setImageUrl(imageUrl : String)
	getCode() : String
	setCode(code : String)
	toString() : String
## 3 - EmployeeService
### 3.1 - Attributes
	deleteEmployeeById(id:Long):void
### 3.2 - Operations
	EmployeeService(employeeRepository : com.sanjula.angular.employee.manager.backend.repository.EmployeeRepository)
	addEmployee(employee : com.sanjula.angular.employee.manager.backend.model.Employee) : com.sanjula.angular.employee.manager.backend.model.Employee
	findAllEmployees() : java.util.List
	findEmployeeById(id : Long) : com.sanjula.angular.employee.manager.backend.model.Employee
	updateEmployee(employee : com.sanjula.angular.employee.manager.backend.model.Employee) : com.sanjula.angular.employee.manager.backend.model.Employee
	deleteEmployee(id : Long)
## 4 - EmployeeRepository
### 4.1 - Operations
	deleteEmployeeById(id : Long)
	findEmployeeById(id : Long) : java.util.Optional
## 5 - EmployeeController
### 5.1 - Attributes
	employeeService : com.sanjula.angular.employee.manager.backend.service.EmployeeService
### 5.2 - Operations
	EmployeeController(employeeService : com.sanjula.angular.employee.manager.backend.service.EmployeeService)
	getAllEmployees() : org.springframework.http.ResponseEntity
	getEmployeeById(PathVariable : @) : org.springframework.http.ResponseEntity
	addEmployee(RequestBody : @) : org.springframework.http.ResponseEntity
	updateEmployee(RequestBody : @) : org.springframework.http.ResponseEntity
	deleteEmployee(PathVariable : @) : org.springframework.http.ResponseEntity
## 6 - BackendApplication
## 6.1 - Operations:
	main(args : String[])
	corsFilter():CorsFilter