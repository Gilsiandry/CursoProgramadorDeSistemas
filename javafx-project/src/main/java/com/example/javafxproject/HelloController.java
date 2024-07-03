package com.example.javafxproject;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//ou importa tudo com * : (import javafx.scene.control.*;)


public class HelloController {
    @FXML
    private Label texto;
    @FXML
    private TextField nome;
    @FXML
    private TextField email;
    @FXML
    private PasswordField senha;
    @FXML
    private PasswordField confirmasenha;
    @FXML
    private CheckBox termos;
    @FXML
    private Button cadastrar;
    @FXML
    private Hyperlink fazerLogin;


    @FXML
    private void cliqueBotaoCadastrar() {

        if (termos.isSelected()) {

            String name = nome.getText();
            String mail = email.getText();
            String pass = senha.getText();
            String confPass = confirmasenha.getText();

            if (confereSenha(pass, confPass)==true) {

                salvarNoBanco (name, mail, pass);

                texto.setText("Cadastrado com sucesso!");
            }else {
                texto.setText("Senhas não conferem!");
            }
        } else {
            texto.setText("Termos de uso obrigatório");
        }
    }
    //metodo que confere senhas
    private boolean confereSenha(String senha, String confSenha) {
        if(senha.equals(confSenha)) {
            return true;
        }else {
            return false;
        }
    }

    // metodo que faz a troca de tela
    @FXML
    private void telaLogin() throws IOException {
        Stage stage = (Stage) email.getScene().getWindow();
        SceneSwitcher.switchScene(stage, "login-view.fxml");
    }

    private void salvarNoBanco (String name, String mail, String pass) {
        String url = "jdbc:mysql://localhost:3306/aplicacao";
        String user = "root";
        String pwd = "";

        String query = "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, user, pwd);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, name);
            preparedStatement.setString(2, mail);
            preparedStatement.setString(3, pass);

            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Usuário salvo com sucesso!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}