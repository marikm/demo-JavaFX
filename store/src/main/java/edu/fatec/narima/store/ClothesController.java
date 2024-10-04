package edu.fatec.narima.store;

import javafx.application.Application;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

import static javafx.geometry.Pos.TOP_LEFT;


public class ClothesController extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        try {
            final GridPane mainPanel;
            mainPanel = new GridPane();
            mainPanel.setAlignment(TOP_LEFT);
            mainPanel.setStyle("-fx-background-color: #ADD8E6;");
            mainPanel.setGridLinesVisible(true);


            final HBox labelDock = new HBox();
            final Label labelTitle = new Label();
            labelTitle.setText("Roupas cadastradas");
            labelDock.getChildren().add(labelTitle);

            final HBox buttons = new HBox(50);
            final Button btnRegister = new Button("Cadastrar");
            final Button btnEdit = new Button("Editar");
            final Button btnDisable = new Button("Desativar");
            buttons.getChildren().addAll(btnRegister, btnEdit, btnDisable);

            TableView<String> tableView = new TableView<>();
            List<String> list = new ArrayList<>();
            list.add("Blusa");
            list.add("Calça");
            list.add("Vestido");

            ObservableList<String> clothes = FXCollections.observableArrayList(list);
            TableColumn<String, String> col1 = new TableColumn<>("Roupas");
            tableView.getColumns().add(col1);

            col1.setCellValueFactory(data -> new SimpleStringProperty(data.getValue()));
            tableView.setItems(clothes);
            VBox grid = new VBox(tableView);


            mainPanel.setVgap(20);
            mainPanel.add(labelDock, 1,0);
            mainPanel.add(buttons,1,2);
            mainPanel.add(grid,1,3);

            Scene scene = new Scene(mainPanel, 800,800);
            stage.setTitle("Loja");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }
        catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }

    public static void main(String[] args) {
        launch();
    }

}
