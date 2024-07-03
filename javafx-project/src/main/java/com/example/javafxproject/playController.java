package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class playController {

    @FXML
    private Label labelnomeMusica;

    @FXML
    private TextField texto;

    @FXML
    private ComboBox<String> genero;

    @FXML
    private ComboBox<String> artista;

    @FXML
    private ComboBox<String> nomeMusica;

    @FXML
    private Button botaoplay;

    @FXML
    private Button botaopause;

    @FXML
    private Button botapassar;

    @FXML
    private Button botaovoltar;
}
