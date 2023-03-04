package com.vit.todo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.vit.todo.domain.Todo;

@Repository
public interface TodoRepository extends PagingAndSortingRepository<Todo, Long>{

}
