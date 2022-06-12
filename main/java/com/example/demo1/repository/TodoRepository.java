package com.example.demo1.repository;

import com.example.demo1.model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository  <Todo, Long>{

}
