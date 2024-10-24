package org.example.manejoeventos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class Controlador implements Initializable {

    @FXML
    private TextArea textArea;

    @FXML
    private Button btnPress1;
    @FXML
    private Button btnPress2;
    @FXML
    private Button btnPress3;
    @FXML
    private Button btnClear;
    @FXML
    private ComboBox<String> comboValues;
    @FXML
    private ChoiceBox<String> choiceBox;
    @FXML
    private ListView<String> listView;

    ObservableList<String> list_combo = FXCollections.observableArrayList("Estudiante", "Profesor",
            "Profesor Invitado", "Administrador");

    List<String> list_choice = Arrays.asList("España", "Italia", "Portugal", "Francia");

    List<String> list_view = Arrays.asList("Gato", "Perro", "Pájaro");


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboValues.getItems().addAll(list_combo);
        choiceBox.getItems().addAll(list_choice);
        listView.getItems().addAll(list_view);
    }

    @FXML
    public void press1() {
        textArea.setText("You pressed the 1st button");
    }

    @FXML
    public void press2() {
        textArea.setText("You pressed the 2nd button");
    }

    @FXML
    public void press3() {
        textArea.setText("You pressed the 3rd button");
    }

    @FXML
    public void comboBoxToTextArea() {
        textArea.setText(comboValues.getValue());
    }

    @FXML
    public void choiceBoxToTextArea() {
        textArea.setText(choiceBox.getValue());
    }

    @FXML
    public void listViewToTextArea() {
        textArea.setText(listView.getSelectionModel().getSelectedItem());
    }

    @FXML
    public void clearAll() {
        textArea.clear();
        comboValues.setValue("");
        choiceBox.setValue("");
        listView.getSelectionModel().clearSelection();
    }
}