package ss6thaychua;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class form {
    public TextField txtName = new TextField();
    public TextArea txtDesc = new TextArea();
    public TextField txtPrice = new TextField();
    public TextField txtQty = new TextField();

    public void submit(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            // Step 3:
            String url = "jdbc:mysql://localhost:8889/Product";
            String username = "root";// thuong thi luon la root
            String password = "root"; // "" neu dung xampp "danhsachsanphamroot" neu dung mamp
            //Step 4
            Connection conn = DriverManager.getConnection(url,username,password);
            String name = txtName.getText();
            String desc = txtDesc.getText();
            double price = Double.parseDouble(txtPrice.getText());
            int qty = Integer.parseInt(txtQty.getText());
            String sql_text = "INSERT INTO products(name,description,Money,quantity) VALUES(?,?,?,?)";
            System.out.println(sql_text);
            PreparedStatement prStm = conn.prepareStatement(sql_text);
            prStm.setString(1,name);
            prStm.setString(2,desc);
            prStm.setDouble(3,price);
            prStm.setInt(4,qty);
            if(!prStm.execute()){
//                Parent form = FXMLLoader.load(getClass().getResource("Listthaychua.fxml"));
                Main.productStage.getScene().setRoot(Main.listPage);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}