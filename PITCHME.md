### Serverless applications, 
### Function-as-a-Service <span style="color:gray">(FaaS)</span>

<span style="color:gray">Lab</span>

---
### MVC
![MVC](assets/2.png?raw=true)

+++
### MVC and FaaS
![MVC - Serverless](assets/3.png?raw=true)

---
### Cloud Computing
<span style="color:gray">Service models</span>
![Cloud computing service models - Serverless](assets/1.png?raw=true)

---
### Serverless Providers

- [AWS Lambda](https://aws.amazon.com/lambda/)
- IBM’s [OpenWhisk incubating project at the ASF](https://github.com/openwhisk/openwhisk), 
- [Kubeless](https://github.com/kubeless/kubeless), 
- [Funktion from Fabric8](https://github.com/funktionio/funktion), 
- [Fission from Platform9](https://github.com/fission/fission), 
- [GalacticFog](http://www.galacticfog.com), 
- [IronFunctions](https://github.com/iron-io/functions), 
- [FAAS-for-docker](https://github.com/alexellis/faas)...

---
### Java Util Function
```
public interface Function<T, R> {
    R apply(T t);
}

public interface Consumer<T> {
    void accept(T t);
}

public interface Supplier<T> {
    T get();
}
```
+++
### Spring Cloud Function

- Spring Cloud Function is a project with the following high-level goals:

- Promote the implementation of business logic via functions.

- Decouple the development lifecycle of business logic from any specific runtime target so that the same code can run as a web endpoint, a stream processor, or a task.

- Support a uniform programming model across serverless providers, as well as the ability to run standalone (locally or in a PaaS).

- Enable Spring Boot features (auto-configuration, dependency injection, metrics) on serverless providers.

+++
### Spring Cloud Function
<span style="color:gray">Example</span>

```
@Component("uppercaseFunction")
public class UppercaseFunction implements Function<UppercaseRequest, UppercaseResponse> {

	private final UppercaseService uppercaseService;

	public UppercaseFunction(final UppercaseService uppercaseService) {
		this.uppercaseService = uppercaseService;
	}

	@Override
	public UppercaseResponse apply(final UppercaseRequest uppercaseRequest) {
		final UppercaseResponse result = new UppercaseResponse();

		result.setResult(uppercaseService.uppercase(uppercaseRequest.getInput()));

		return result;
	}
}
```
