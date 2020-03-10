package ss6thaychua;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Stage productStage;

    public static ObservableList<Product> cart = FXCollections.observableArrayList();

    public static void main(String[] args) {
        launch(args);
    }
    public static Parent listPage;
    private static Parent formPage;

    @Override
    public void start(Stage primaryStage) {
        productStage = primaryStage;
        try {
            if (listPage == null){
                listPage  = FXMLLoader.load(getClass().getResource("Listthaychua.fxml"));

            }
            Parent root = FXMLLoader.load(getClass().getResource("Listthaychua.fxml"));
            primaryStage.setTitle("Manage products");
            primaryStage.setScene(new Scene(root,600,400));
            primaryStage.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}