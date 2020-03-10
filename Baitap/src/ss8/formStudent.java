package ss8;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import ss6thaychua.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class formStudent {
    public TextField txtName = new TextField();
    public TextArea txtAge = new TextArea();
    public TextField txtMark = new TextField();

    public void submit(ActionEvent actionEvent) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Step 3:
            String url = "jdbc:mysql://localhost:8889/Product";
            String username = "root";// thuong thi luon la root
            String password = "root"; // "" neu dung xampp "danhsachsanphamroot" neu dung mamp
            //Step 4
            Connection conn = DriverManager.getConnection(url,username,password);
            String name = txtName.getText();
            int Age = Integer.parseInt(txtAge.getText());
            int Mark = Integer.parseInt(txtMark.getText());
            String sql_text = "INSERT INTO student(name,age,mark) VALUES(?,?,?)";
            System.out.println(sql_text);
            PreparedStatement prStm = conn.prepareStatement(sql_text);
            prStm.setString(1,name);
            prStm.setInt(2,Age);
            prStm.setInt(3,Mark);
            if(!prStm.execute()){
//                Parent form = FXMLLoader.load(getClass().getResource("Listthaychua.fxml"));
                Main.productStage.getScene().setRoot(Main.listPage);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
