## Spring Boot JSON Web Token

### Workflow of JWT 

* During the first request the client sends a POST request with username and password. Upon successful authentication the server generates the JWT sends this JWT to the client. 

* This JWT can contain a payload of data. On all subsequent requests the client sends this JWT token in the header. 

* Using this token the server authenticates the user. So we don't need the client to send the user name and password to the server during each request for authentication, but only once after which the server issues a JWT to the client. 

* A JWT payload can contain things like user ID so that when the client again sends the JWT, you can be sure that it is issued by you, and you can see to whom it was issued.

### Structure of JWT 
* [`header.payload.signature`]

* An important point to remember about JWT is that the information in the payload of the JWT is visible to everyone. So we should not pass any sensitive information like passwords in the payload. 

* We can encrypt the payload data if we want to make it more secure. However we can be sure that no one can tamper and change the payload information. If this is done the server will recognize it.

### Create a JWT Token

* Creating a JWT token using JWT Online Token Generator [`http://jwtbuilder.jamiekurtz.com/`]

* JWT token using JWT Online Decoder [`https://jwt.io/`]

### JWT Configuration

* Generating JWT - Expose a POST API with mapping /authenticate. On passing correct username and password it will generate a JSON Web Token(JWT)

* Validating JWT - If user tries to access GET API with mapping /hello. It will allow access only if request has a valid JSON Web Token(JWT)
