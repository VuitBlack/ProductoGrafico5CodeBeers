package com.example.prueba_2fx;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class HelloController {
    @FXML
    private ImageView articuloArrow;
    @FXML
    private ImageView clienteArrow;
    @FXML
    private ImageView pedidoArrow;
    @FXML
    private AnchorPane gestionArticulosScreen;
    @FXML
    private AnchorPane gestionClientesScreen;
    @FXML
    private AnchorPane gestionPedidosScreen;
    @FXML
    private AnchorPane addArticuloScreen;
    @FXML
    private AnchorPane listarArticulosScreen;
    @FXML
    private AnchorPane addClienteScreen;
    @FXML
    private AnchorPane listarCliScreen;
    @FXML
    private AnchorPane listarCliEstScreen;
    @FXML
    private AnchorPane listarCliPremScreen;
    @FXML
    private AnchorPane addPedidoScreen;
    @FXML
    private AnchorPane deletePedidoScreen;
    @FXML
    private AnchorPane listarPedPendEnvScreen;
    @FXML
    private AnchorPane listarPedEnvScreen;


    public void onArticuloButtonClick(MouseEvent event) {
        primaryMenuScreen();
        gestionArticulosScreen.setVisible(true);
        articuloArrow.setVisible(true);
    }
    public void onClienteButtonClick(MouseEvent event) {
        primaryMenuScreen();
        gestionClientesScreen.setVisible(true);
        clienteArrow.setVisible(true);
    }
    public void onPedidoButtonClick(MouseEvent event) {
        primaryMenuScreen();
        gestionPedidosScreen.setVisible(true);
        pedidoArrow.setVisible(true);
    }
    public void onExitButtonClick(MouseEvent event) {
        Platform.exit();
        System.exit(0);
    }
    public void onMenuButtonClick(MouseEvent event){
        primaryMenuScreen();
    }
    public void onAnadirArticuloClick(MouseEvent event) {
        primaryMenuScreen();
        addArticuloScreen.setVisible(true);
        articuloArrow.setVisible(true);
    }
    public void onListarArticuloClick(MouseEvent event) {
        primaryMenuScreen();
        listarArticulosScreen.setVisible(true);
        articuloArrow.setVisible(true);
    }
    public void onAddCliClick(MouseEvent event) {
        primaryMenuScreen();
        addClienteScreen.setVisible(true);
        clienteArrow.setVisible(true);
    }
    public void onListCliClick(MouseEvent event) {
        primaryMenuScreen();
        listarCliScreen.setVisible(true);
        clienteArrow.setVisible(true);
    }
    public void onListEstClick(MouseEvent event) {
        primaryMenuScreen();
        listarCliEstScreen.setVisible(true);
        clienteArrow.setVisible(true);
    }
    public void onListPremClick(MouseEvent event) {
        primaryMenuScreen();
        listarCliPremScreen.setVisible(true);
        clienteArrow.setVisible(true);
    }
    public void onAddPedClick(MouseEvent event){
        primaryMenuScreen();
        addPedidoScreen.setVisible(true);
        pedidoArrow.setVisible(true);
    }
    public void onDeletePedClick(MouseEvent event){
        primaryMenuScreen();
        deletePedidoScreen.setVisible(true);
        pedidoArrow.setVisible(true);
    }
    public void onListPPEnvClick(MouseEvent event){
        primaryMenuScreen();
        listarPedPendEnvScreen.setVisible(true);
        pedidoArrow.setVisible(true);
    }
    public void onListPedEnvClic(MouseEvent event){
        primaryMenuScreen();
        listarPedEnvScreen.setVisible(true);
        pedidoArrow.setVisible(true);
    }

    public void primaryMenuScreen(){
        gestionArticulosScreen.setVisible(false);
        articuloArrow.setVisible(false);
        addArticuloScreen.setVisible(false);
        listarArticulosScreen.setVisible(false);
        gestionClientesScreen.setVisible(false);
        clienteArrow.setVisible(false);
        addClienteScreen.setVisible(false);
        listarCliScreen.setVisible(false);
        listarCliEstScreen.setVisible(false);
        listarCliPremScreen.setVisible(false);
        gestionPedidosScreen.setVisible(false);
        pedidoArrow.setVisible(false);
        addPedidoScreen.setVisible(false);
        deletePedidoScreen.setVisible(false);
        listarPedPendEnvScreen.setVisible(false);
        listarPedEnvScreen.setVisible(false);
    }
}