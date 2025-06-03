package com.bahaa.BurgerTracker.mvc.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bahaa.BurgerTracker.mvc.models.Burger;
@Repository
public interface BurgerRepository extends CrudRepository<Burger, Long> {
    List<Burger> findAll();


}
 