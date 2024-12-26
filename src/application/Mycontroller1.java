package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Mycontroller1 {

    @FXML
    void toopen(ActionEvent event) {
        try {
            // Charger l'interface depuis le fichier FXML
            Parent root = FXMLLoader.load(getClass().getResource("interfacedeux.fxml"));

            // Récupérer le Stage à partir de l'événement
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Changer la scène
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
