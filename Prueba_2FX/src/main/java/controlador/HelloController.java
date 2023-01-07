package controlador;

import exceptions.ElementoNoExiste;
import exceptions.OnlineStoreException;
import exceptions.OpcionNoValida;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import modelo.*;

//import java.awt.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

    /*************************************************************
     * Cosas de Articulo
     *************************************************************/
    @FXML
    private TextField idArtTextField;
    @FXML
    private TextField descripcionTextField;
    @FXML
    private TextField timePrepArticuloTextField;
    @FXML
    private TextField gastoEnvioArtTextField;
    @FXML
    private TextField pvpArtTextField;
    @FXML
    private ScrollPane listadoArticulos;

    /*************************************************************
     * Cosas de Cliente
     *************************************************************/
    @FXML
    private TextField NIFclienteTextField;
    @FXML
    private TextField NombreCliTextField;
    @FXML
    private TextField domicilioCliTextField;
    @FXML
    private TextField emailCliTextField;
    @FXML
    private TextField tipoCliTextField;
    @FXML
    private ScrollPane listadoClientes;
    @FXML
    private ScrollPane listadoClientesEst;
    @FXML
    private ScrollPane listadoClientesPremium;
    @FXML
    private TextField NIFcliPedTextField;
    @FXML
    private TextField idArtPedTextField;
    @FXML
    private TextField cantidadArtPedTextField;


    /*************************************************************
     * Cosas de Pedido
     *************************************************************/

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
        ArrayList<HashMap<String, String>> datosArticulos = getArticulos();
        mostrarCosas(datosArticulos, listadoArticulos);
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
        ArrayList<HashMap<String, String>> datosClientes = getClientes("");
        mostrarCosas(datosClientes, listadoClientes);
    }
    public void onListEstClick(MouseEvent event) {
        primaryMenuScreen();
        listarCliEstScreen.setVisible(true);
        clienteArrow.setVisible(true);
        ArrayList<HashMap<String, String>> datosClientes = getClientes("Estándar");
        mostrarCosas(datosClientes, listadoClientesEst);
    }
    public void onListPremClick(MouseEvent event) {
        primaryMenuScreen();
        listarCliPremScreen.setVisible(true);
        clienteArrow.setVisible(true);
        ArrayList<HashMap<String, String>> datosClientes = getClientes("Premium");
        mostrarCosas(datosClientes, listadoClientesPremium);
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
        resetTexts();
    }
    public void resetTexts(){
        idArtTextField.setText("");
        descripcionTextField.setText("");
        pvpArtTextField.setText("");
        gastoEnvioArtTextField.setText("");
        timePrepArticuloTextField.setText("");
        NIFclienteTextField.setText("");
        NombreCliTextField.setText("");
        emailCliTextField.setText("");
        tipoCliTextField.setText("");
        domicilioCliTextField.setText("");
    }
    public void AddArticuloDef(MouseEvent mouseEvent) {
        if(articuloExiste(idArtTextField.getText()) || idArtTextField.getText().equals("") ||
                descripcionTextField.getText().equals("") || pvpArtTextField.getText().equals("") ||
                gastoEnvioArtTextField.getText().equals("") || timePrepArticuloTextField.getText().equals("")){

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Advertencia");
            alert.setHeaderText("Articulo no guardado");
            alert.setContentText("El artículo no se ha guardado debido a que el ID ya pertenece a otro artículo o alguno de los campos está incompleto");
            alert.show();
        }
        else{
            addArticulo(idArtTextField.getText(),
                    descripcionTextField.getText(),
                    Float.parseFloat(pvpArtTextField.getText()),
                    Float.parseFloat(gastoEnvioArtTextField.getText()),
                    Integer.parseInt(timePrepArticuloTextField.getText())
            );
            primaryMenuScreen();
        }
    }
    public void AddClienteDef(MouseEvent mouseEvent){
        if(clienteExiste(NIFclienteTextField.getText()) || NIFclienteTextField.getText().equals("") ||
                NombreCliTextField.getText().equals("") || domicilioCliTextField.getText().equals("") ||
                emailCliTextField.getText().equals("") || tipoCliTextField.getText().equals("")){

            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Advertencia");
            alert.setHeaderText("Cliente no guardado");
            alert.setContentText("El cliente no se ha guardado debido a que el NIF ya pertenece a otro cliente o alguno de los campos está incompleto");
            alert.show();
        }
        else{
            try {
                addCliente(NombreCliTextField.getText(),
                        domicilioCliTextField.getText(),
                        NIFclienteTextField.getText(),
                        emailCliTextField.getText(),
                        tipoCliTextField.getText());
                primaryMenuScreen();
            }
            catch(Exception e){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alerta("Advertencia", "Cliente no guardado", "El liente no se ha guardado debido a que el tipo de cliente no es una opción válida");
            }
        }
    }

    public void addPedidoDef(MouseEvent mouseEvent){
        if(NIFcliPedTextField.getText().equals("") || idArtPedTextField.getText().equals("") || cantidadArtPedTextField.getText().equals(""))
            alerta("Advertencia", "Información insuficiente", "Uno o más campos están vacíos, por favor rellene todos antes de proceder");
        else if(!clienteExiste(NIFcliPedTextField.getText())) {
            alerta("Advertencia","El cliente no existe", "Modifíque o agréguelo antes de proceder con el pedido");
        }
        else {
            try {
                addPedido(NIFcliPedTextField.getText(), idArtPedTextField.getText(), Integer.parseInt(cantidadArtPedTextField.getText()), LocalDateTime.now());
            }
            catch (Exception e) {
                alerta("Advertencia", "El articulo no existe", "Cree el articulo desde el menú principal o corrígalo antes de proceder con el pedido");
            }
        }
    }

    private void mostrarCosas(ArrayList<HashMap<String, String>> datos, ScrollPane panel){
        VBox visualizador = new VBox();

        for (HashMap<String, String> elemento : datos) {
            Set<String> campos = elemento.keySet();
            Text texto = new Text("===============================\n");
            for (String campo : campos) {
                String valor = elemento.get(campo);
                String nuevaLinea = new String(campo + ": " + valor + "\n");
                texto.setText(texto.getText() + nuevaLinea);
            }
            texto.setText(texto.getText() + "===============================");
            visualizador.getChildren().add(texto);
        }
        panel.setContent(visualizador);
    }

    private void alerta(String title, String header, String content){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.show();
    }


    /***********************************************************************
    **  Antiguo Controlador
    ************************************************************************/
    private Datos datos = new Datos();



    public void addCliente(String nombre, String domicilio, String nif, String email, String tipoCliente) throws OpcionNoValida {
        Cliente cliente;
        switch (tipoCliente) {
            case "Estandar":
            case "Estándar":
            case "estandar":
            case "estándar":
                cliente = new Estandar(nombre, domicilio, nif, email);
                break;
            case "Premium":
            case "premium":
                cliente = new Premium(nombre, domicilio, nif, email);
                break;
            default:
                throw new OpcionNoValida();
        }
        datos.addCliente(cliente);
    }

    public ArrayList getClientes(String filtro) {

        ArrayList<Cliente> clientes = datos.getClientes(filtro);
        ArrayList<Map<String, String>> datosClientes = new ArrayList<>();

        for (Cliente cliente: clientes) {
            datosClientes.add(cliente.getDatosCliente());
        }

        return datosClientes;
    }

    public void addArticulo(String id, String descripcion, float pvp, float gastosEnvio, int tiempoPreparacion) {
        Articulo articulo = new Articulo(id, descripcion, pvp, gastosEnvio, tiempoPreparacion);
        datos.addArticulo(articulo);
    }

    public ArrayList getArticulos() {

        ArrayList<Articulo> articulos = datos.getArticulos();
        ArrayList<Map<String, String>> datosArticulos = new ArrayList<>();

        for (Articulo articulo: articulos) {
            datosArticulos.add(articulo.getDatosArticulo());
        }

        return datosArticulos;
    }

    public void addPedido(String nif, String id, int unidades, LocalDateTime fechaHora) throws ElementoNoExiste {
        Cliente cliente = datos.getClienteByNif(nif);
        Articulo articulo = datos.getArticuloById(id);
        Pedido pedido = new Pedido(cliente, articulo, unidades, fechaHora);
        datos.addPedido(pedido);
    }

    public ArrayList getPedidos(String filtro, boolean enviado) {

        ArrayList<Pedido> pedidos = datos.getPedidos(filtro, enviado);
        ArrayList<Map<String, String>> datosPedidos = new ArrayList<>();

        for (Pedido pedido: pedidos) {
            datosPedidos.add(pedido.getDatosPedido());
        }

        return datosPedidos;
    }

    public void deletePedido(int num) throws ElementoNoExiste {
        datos.deletePedido(num);
    }

    public boolean clienteExiste(String nif) {
        return datos.compruebaExistenciaCliente(nif);
    }

    public boolean articuloExiste(String id) {
        return datos.compruebaExistenciaArticulo(id);
    }



}