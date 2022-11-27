package com.example.deligabor_javafxrestclientdolgozat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class MovieController {

    @FXML
    private Button InsertButton;
    @FXML
    private Button UpdateButton;
    @FXML
    private Button DeleteButton;
    @FXML
    private TableView<Movie> moviesTable;
    @FXML
    private TableColumn<Movie,String> filmekCol;
    @FXML
    private TableColumn<Movie,Integer> ertekelesCol;
    @FXML
    private TableColumn<Movie,Integer> evjaratCol;
    @FXML
    private TableColumn<Movie,String> dijakCol;

    @FXML
    private void initialize(){
        filmekCol.setCellValueFactory(new PropertyValueFactory<>("filmek"));
        ertekelesCol.setCellValueFactory(new PropertyValueFactory<>("ertekelesek"));
        evjaratCol.setCellValueFactory(new PropertyValueFactory<>("evjarat"));
        dijakCol.setCellValueFactory(new PropertyValueFactory<>("dijak"));
        try {
            RequestHandler.get(App.BASE_URL);
        } catch (IOException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Hiba");
            alert.setHeaderText("Hiba történt a adatok lekérdezése után!");
            alert.setContentText(e.getMessage());

        }

    }

    @FXML
    public void InsertClick(ActionEvent actionEvent) {
    }

    @FXML
    public void UpdateClick(ActionEvent actionEvent) {
    }

    @FXML
    public void DeleteClick(ActionEvent actionEvent) {
    }
}