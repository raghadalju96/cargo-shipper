package com.cargoshipper.cargoshipper.repository;

import com.cargoshipper.cargoshipper.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);
}
