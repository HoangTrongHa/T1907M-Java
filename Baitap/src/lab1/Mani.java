
package lab1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Mani extends Application {
    public static void main(String[] args) {

        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Form.fxml"));
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("Lan sau cho bai de thoi");
        primaryStage.setScene(new Scene(root, 600, 600));
        primaryStage.show();
    }
}