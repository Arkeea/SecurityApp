package ru.arkeea.SecurityApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.arkeea.SecurityApp.models.Person;

import java.util.Optional;

public interface PeopleRepository extends JpaRepository<Person, Integer> {
    Optional<Person> findByUsername(String username);

}
