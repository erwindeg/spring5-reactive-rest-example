package nl.edegier.spring5.rest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

/**
 * Created by Erwin on 16/11/2017.
 */
@Configuration
public class RouterFunctionFactory {
    @Bean
    RouterFunction<ServerResponse> createRouter() {
        return RouterFunctions.route(
                RequestPredicates.GET("/hello-function"),
                request -> ServerResponse.ok().body(BodyInserters.fromObject("Hello Function")));
    }
}