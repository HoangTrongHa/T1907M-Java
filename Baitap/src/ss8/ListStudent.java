package ss8;

import connector.Connector;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ListView;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class ListStudent implements Initializable {
    public ListView <Student> ls = new ListView<>();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            String sql_text = "SELECT * FROM student";
            Connector connector = Connector.getInstance();
            ResultSet rs = connector.getQuery(sql_text);

            ObservableList<Student> as = FXCollections.observableArrayList();
            while (rs.next()){
                as.add(new Student(rs.getInt("id"),rs.getString("Name"),
                        rs.getInt("Tuoi"),rs.getInt("Mark")));
            }
            ls.setItems(as);
        }catch (Exception e){

        }
    }
    public void form(ActionEvent actionEvent) {
        try {
            Parent form = FXMLLoader.load(getClass().getResource("form.fxml"));
            Mainss8.studentStage.getScene().setRoot(form);
            // mainStage la 1 bien static trong lop Main
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
