package ies.tc.crudapp.repositories;

import java.util.List;

import ies.tc.crudapp.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	List<User> findByName(String name);
}
//crudrepository<user,long> -> atua sobre entidades do tipo user e cada user é identificado por um long