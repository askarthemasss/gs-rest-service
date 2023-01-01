# gs-rest-service
Building a RESTful Web Service - spring.io
url: https://spring.io/guides/gs/rest-service/

### Points to Note:


 * In Spring’s approach to building RESTful web services, HTTP requests are handled by a controller.
 * These components are identified by the @RestController annotation

 * GreetingController handles GET requests for /greeting by returning a new instance of the Greeting class

 * The @GetMapping annotation ensures that HTTP GET requests to /greeting are mapped to the greeting() method.

 * There are companion annotations for other HTTP verbs (e.g. @PostMapping for POST).
 * There is also a @RequestMapping annotation that they all derive from, and can serve as a synonym (e.g. @RequestMapping(method=GET)).
 
 
 *  @RequestParam binds the value of the query string parameter name into the name parameter of the greeting() method.
 *  If the name parameter is absent in the request, the defaultValue of World is used.
 

 * A key difference between a traditional MVC controller and the RESTful web service controller shown earlier is the way that the HTTP response body is created.
 * Rather than relying on a view technology to perform server-side rendering of the greeting data to HTML, this RESTful web service controller populates and returns a Greeting object.
 * The object data will be written directly to the HTTP response as JSON.
