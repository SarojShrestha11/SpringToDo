package com.example.demo1.bootstrap;

import com.example.demo1.model.Todo;
import com.example.demo1.model.TodoStatus;
import com.example.demo1.repository.TodoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TodoLoader implements CommandLineRunner {
    public final TodoRepository todoRepository;

    public TodoLoader(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        loadTodos();
    }
    private void loadTodos() {
        if (todoRepository.count() == 0){
            todoRepository.save(Todo.builder().title("Go to College")
                    .description("Learn about new Project and Practise.")
                    .todoStatus(TodoStatus.NOT_COMPLETED)
                    .build());
            todoRepository.save(Todo.builder().title("Wake up")
                    .description("Be ready to go to College.")
                    .todoStatus(TodoStatus.NOT_COMPLETED)
                    .build());
            System.out.println("Sample of Todo Loaded.");
        }
    }
}
