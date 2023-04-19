package com.example.todolist_section18javafx;

import com.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class HelloController {
    private List<TodoItem> todoItems;

    public void initialize() {
        TodoItem item1 = new TodoItem("Mail birthday card",
                "Buy a 30th Birthday card for John",
                LocalDate.of(2023, Month.APRIL, 25));
        TodoItem item2 = new TodoItem("Doctor's Appointment",
                "See Dr. Smith at 123 Main Street.",
                LocalDate.of(2023, Month.MAY, 25));
        TodoItem item3 = new TodoItem("Finish design proposal for client",
                "I promised Mike I'd email website mockups by mm yy dd",
                LocalDate.of(2023, Month.JUNE, 22));
        TodoItem item4 = new TodoItem("Pickup Doug at the train station",
                "Doug's arriving on March 23 on the 0500 Train",
                LocalDate.of(2023, Month.MARCH, 25));
        TodoItem item5 = new TodoItem("Pick up dry cleaning",
                "Clothes should be ready by wednesday mm yy dd",
                LocalDate.of(2023, Month.APRIL, 19));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);
    }




}