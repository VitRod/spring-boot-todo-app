package com.vit.todo;

import java.util.Arrays;
import java.util.Collection;

import com.vit.todo.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vit.todo.domain.Todo;

@SpringBootApplication
public class SpringBootTodoApplication implements CommandLineRunner {

	@Autowired
	public TodoRepository todoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTodoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Collection<Todo> todos = Arrays.asList(new Todo("Read a Book", "Yes"), new Todo("Learn Skating", "No"), new Todo("Go for a Run", "No"), new Todo("Prepare Supper", "Yes"));
		todos.forEach(todoRepository::save);

	}
}
