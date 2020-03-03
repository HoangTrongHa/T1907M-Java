package lab1;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connec {
    public static void main(String[] args) {
        try {
//            step 2 khai bao driver
            Class.forName("com.mysql.jdbc.Driver");
//            tao url
            String url ="jdbc:mysql://localhost:8889/t1907m";
            String userName="root";
            String password="root";
//            Step4 ket noi db
            Connection conn = DriverManager.getConnection(url,userName,password);
            System.out.println("ket thoi thanh cong ");
            Statement str =conn.createStatement();
            String sql_="Select * From students";
            ResultSet rs = str.executeQuery(sql_);
            while(rs.next()){
                String line = rs.getInt("id")+"-"+rs.getString("name");
                System.out.println(line);
                InputStream stream =new InputStream() {
                    @Override
                    public int read() throws IOException {
                        return 0;
                    }
                }; }
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
