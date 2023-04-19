module com.example.todolist_section18javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.todolist_section18javafx to javafx.fxml;
    exports com.example.todolist_section18javafx;
}