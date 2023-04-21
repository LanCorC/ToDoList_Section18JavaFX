package com.example.todolist_section18javafx;

import com.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.chart.ValueAxis;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class HelloController {
    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;

    @FXML
    private TextArea itemDetailsTextArea;
    @FXML
    private Label deadlineLabel;

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

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observableValue, TodoItem todoItem, TodoItem t1) {
                if(t1 != null) {
                    TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(item.getDetails());
                }
            }
        });

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();
    }

    @FXML
    public void handleClickListView() {
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadline().toString());

//        System.out.println("The selected item is " + item);
//        StringBuilder sb = new StringBuilder(item.getDetails());
//        sb.append("\n\n\n\n");
//        sb.append("Due: ");
//        sb.append(item.getDeadline().toString());
//        itemDetailsTextArea.setText(sb.toString());

    }




}