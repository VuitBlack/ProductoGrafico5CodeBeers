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

    public void onArticuloButtonClick(MouseEvent event) {
        gestionArticulosScreen.setVisible(true);
        articuloArrow.setVisible(true);
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

    }
    public void onClienteButtonClick(MouseEvent event) {
        gestionClientesScreen.setVisible(true);
        clienteArrow.setVisible(true);
        addClienteScreen.setVisible(false);
        listarCliScreen.setVisible(false);
        listarCliEstScreen.setVisible(false);
        listarCliPremScreen.setVisible(false);
        gestionArticulosScreen.setVisible(false);
        articuloArrow.setVisible(false);
        addArticuloScreen.setVisible(false);
        listarArticulosScreen.setVisible(false);
        gestionPedidosScreen.setVisible(false);
        pedidoArrow.setVisible(false);
    }

    public void onPedidoButtonClick(MouseEvent event) {
        gestionPedidosScreen.setVisible(true);
        pedidoArrow.setVisible(true);

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
    }

    public void onExitButtonClick(MouseEvent event) {
        Platform.exit();
        System.exit(0);
    }

    public void onAnadirArticuloClick(MouseEvent event) {
        addArticuloScreen.setVisible(true);
        articuloArrow.setVisible(true);
        gestionArticulosScreen.setVisible(false);
        gestionClientesScreen.setVisible(false);
        addClienteScreen.setVisible(false);
        listarCliScreen.setVisible(false);
        listarCliEstScreen.setVisible(false);
        listarCliPremScreen.setVisible(false);
        clienteArrow.setVisible(false);
        gestionPedidosScreen.setVisible(false);
        pedidoArrow.setVisible(false);

    }
    public void onListarArticuloClick(MouseEvent event) {
        listarArticulosScreen.setVisible(true);
        articuloArrow.setVisible(true);
        gestionArticulosScreen.setVisible(false);
        addArticuloScreen.setVisible(false);
        gestionClientesScreen.setVisible(false);
        clienteArrow.setVisible(false);
        gestionPedidosScreen.setVisible(false);
        pedidoArrow.setVisible(false);
        addClienteScreen.setVisible(false);
        listarCliScreen.setVisible(false);
        listarCliEstScreen.setVisible(false);
        listarCliPremScreen.setVisible(false);
    }
    public void onAddCliClick(MouseEvent event) {
        addClienteScreen.setVisible(true);
        clienteArrow.setVisible(true);
        gestionClientesScreen.setVisible(false);
        listarCliScreen.setVisible(false);
        listarCliEstScreen.setVisible(false);
        listarCliPremScreen.setVisible(false);
        gestionArticulosScreen.setVisible(false);
        articuloArrow.setVisible(false);
        addArticuloScreen.setVisible(false);
        listarArticulosScreen.setVisible(false);
        gestionPedidosScreen.setVisible(false);
        pedidoArrow.setVisible(false);
    }
    public void onListCliClick(MouseEvent event) {
        listarCliScreen.setVisible(true);
        clienteArrow.setVisible(true);
        addClienteScreen.setVisible(false);
        gestionClientesScreen.setVisible(false);
        listarCliEstScreen.setVisible(false);
        listarCliPremScreen.setVisible(false);
        gestionArticulosScreen.setVisible(false);
        articuloArrow.setVisible(false);
        addArticuloScreen.setVisible(false);
        listarArticulosScreen.setVisible(false);
        gestionPedidosScreen.setVisible(false);
        pedidoArrow.setVisible(false);
    }
    public void onListEstClick(MouseEvent event) {
        listarCliEstScreen.setVisible(true);
        clienteArrow.setVisible(true);
        addClienteScreen.setVisible(false);
        gestionClientesScreen.setVisible(false);
        listarCliScreen.setVisible(false);
        listarCliPremScreen.setVisible(false);
        gestionArticulosScreen.setVisible(false);
        articuloArrow.setVisible(false);
        addArticuloScreen.setVisible(false);
        listarArticulosScreen.setVisible(false);
        gestionPedidosScreen.setVisible(false);
        pedidoArrow.setVisible(false);

    }
    public void onListPremClick(MouseEvent event) {
        listarCliPremScreen.setVisible(true);
        clienteArrow.setVisible(true);
        addClienteScreen.setVisible(false);
        gestionClientesScreen.setVisible(false);
        listarCliScreen.setVisible(false);
        listarCliEstScreen.setVisible(false);
        gestionArticulosScreen.setVisible(false);
        articuloArrow.setVisible(false);
        addArticuloScreen.setVisible(false);
        listarArticulosScreen.setVisible(false);
        gestionPedidosScreen.setVisible(false);
        pedidoArrow.setVisible(false);
    }
}