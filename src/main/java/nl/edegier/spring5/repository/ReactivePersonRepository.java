package nl.edegier.spring5.repository;

import nl.edegier.spring5.model.Person;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by Erwin on 15/11/2017.
 */
public interface ReactivePersonRepository extends ReactiveCrudRepository<Person, String> {

    Flux<Person> findByLastname(Mono<String> lastname);

}