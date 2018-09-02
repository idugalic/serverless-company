### Serverless applications, 
### Function-as-a-Service <span style="color:gray">(FaaS)</span>

<span style="color:gray">Lab</span>

[https://github.com/idugalic/serverless-company](https://github.com/idugalic/serverless-company)

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
- [OpenFaaS](https://github.com/alexellis/faas) - for Docker Swarm and Kubernetes

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

https://github.com/idugalic/serverless-company/blob/master/serverless-company-functions/src/main/java/com/idugalic/function/functions/UppercaseFunction.java

---

### References and further reading

- https://github.com/anaibol/awesome-serverless
- [Evolution of Business Logic from Monoliths through Microservices, to Functions](https://read.acloud.guru/evolution-of-business-logic-from-monoliths-through-microservices-to-functions-ff464b95a44d)
- [Deploy your microservice (Amazon Web Services S3, API Gateway and Lambda)](https://www.youtube.com/watch?list=PLVe-2wcL84b8c09AKImmAISiEI6vPefON&v=6ZzGx79Nz4o)
- http://docs.aws.amazon.com/lambda/latest/dg/welcome.html
- https://github.com/kbastani/event-stream-processing-microservices
- http://openwhisk.org/
- https://github.com/krook
- [Functions as a Service (FaaS) with Docker swarm](http://blog.alexellis.io/functions-as-a-service)
- https://medium.com/@pfernandom/serverless-for-private-clouds-or-managing-the-server-for-a-serverless-app-f9321e45a910
- https://www.ibm.com/blogs/bluemix/2017/02/microservices-multi-compute-approach-using-cloud-foundry-openwhisk/

---
### Thank you

 - Ivan Dugalic
 - [http://idugalic.pro/](http://idugalic.pro/)
 - [https://twitter.com/idugalic](https://twitter.com/idugalic)
 - [https://github.com/idugalic](https://github.com/idugalic)
