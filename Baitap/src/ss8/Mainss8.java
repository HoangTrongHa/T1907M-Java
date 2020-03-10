package ss8;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Mainss8 extends Application {
    public static Stage studentStage;
    public static Parent listPage;
    public static Parent formPage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        studentStage = primaryStage;
            try {
                Parent root = FXMLLoader.load(getClass().getResource("List.fxml"));
                if (listPage == null) {
                    listPage = FXMLLoader.load(getClass().getResource("List.fxml"));
                }
                primaryStage.setTitle("Danh sach ");
                primaryStage.setScene(new Scene(listPage, 600, 400));
                primaryStage.show();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    public static void main(String[] args) {
launch(args);
    }
}