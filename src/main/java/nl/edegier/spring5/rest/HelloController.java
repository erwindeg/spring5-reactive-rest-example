package nl.edegier.spring5.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created by Erwin on 15/11/2017.
 */
@RestController
public class HelloController {

    @GetMapping("hello")
    Mono<String> hello(){
        return Mono.just("Hello World");
    }


}
