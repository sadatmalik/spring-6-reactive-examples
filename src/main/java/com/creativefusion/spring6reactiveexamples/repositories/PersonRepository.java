package com.creativefusion.spring6reactiveexamples.repositories;

import com.creativefusion.spring6reactiveexamples.domain.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author sm@creativefusion.net
 */
public interface PersonRepository {

    Mono<Person> getById(Integer id);

    Flux<Person> findAll();
}
