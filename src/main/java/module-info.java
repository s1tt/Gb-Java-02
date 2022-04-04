module com.geekbrains.chat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.geekbrains.chat to javafx.fxml;
    exports com.geekbrains.chat;
}