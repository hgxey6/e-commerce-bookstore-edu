package com.bookstore.repository;

import com.bookstore.domain.StoreUser;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<StoreUser, Long> {

    StoreUser findByUsername(String username);
}
