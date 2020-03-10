package connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.*;

    public class Connector{

        private Statement stm;

        private static Connector con; // khong lien quan den doi tuong khi sinh ra

        private Connector(){
            try {
                Class.forName("com.mysql.jdbc.Driver");

                // thuong thi luon la root
                String username = "root";
                // "" neu dung xampp "root" neu dung mamp
                String password = "root";
                String url = "jdbc:mysql://localhost:8889/Product";
                Connection conn = DriverManager.getConnection(url, username, password);
                stm = conn.createStatement();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        public static Connector getInstance(){
            if(con==null){ //neu no chua tao thi no se tao cai moi co roi thi tra ve cion
                con = new Connector();
            }
            return con;
        }

        public ResultSet getQuery(String sql) throws Exception{
            return stm.executeQuery(sql);
        }

        public Boolean excuteUpdate(String sql) throws Exception{
            if(stm.executeUpdate(sql) > 0){
                return true;
            }
            return false;
        }

    }

