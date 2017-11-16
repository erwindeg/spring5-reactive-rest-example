package nl.edegier.spring5.rest;

import nl.edegier.spring5.model.Person;
import nl.edegier.spring5.repository.ReactivePersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by Erwin on 15/11/2017.
 */
@RestController("person")
public class PersonController {
    @Autowired
    private ReactivePersonRepository personRepository;

    @GetMapping()
    Flux<Person> getPersons() {
        return this.personRepository.findAll();
    }

    @PostMapping
    Mono<ResponseEntity<Person>> savePerson(@RequestBody Person person) {
        return this.personRepository.save(person)
                .map(result -> new ResponseEntity<>(result, HttpStatus.CREATED));
    }

}
