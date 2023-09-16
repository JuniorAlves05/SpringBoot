package br.com.junior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.junior.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long >{	
}
