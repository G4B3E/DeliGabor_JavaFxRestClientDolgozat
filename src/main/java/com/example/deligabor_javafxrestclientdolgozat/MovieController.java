package com.example.deligabor_javafxrestclientdolgozat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
    public void InsertClick(ActionEvent actionEvent) {
    }

    @FXML
    public void UpdateClick(ActionEvent actionEvent) {
    }

    @FXML
    public void DeleteClick(ActionEvent actionEvent) {
    }
}