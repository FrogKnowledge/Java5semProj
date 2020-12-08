package by.belstu.stankevich.repositories;

import org.springframework.data.repository.CrudRepository;

import by.belstu.stankevich.models.User;


public interface UserRepository extends CrudRepository<User, Integer> {

}