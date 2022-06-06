package com.geekbrains.chat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ChatController {

    @FXML
    private TextArea messageArea;
    @FXML
    private TextField messageField;

    @FXML
    private void checkButtonClick(ActionEvent actionEvent) {
        final String userMessage = messageField.getText();
        if (userMessage.isEmpty()) {
            return;
        }
        messageArea.appendText(userMessage + "\n");
        messageField.clear();
        messageField.requestFocus();
    }
}