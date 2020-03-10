package ss8;

import connector.Connector;
import ss7.DataAccessObjectConcreate;

import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentDataAccessObject implements DataAccessObjectConcreate {
    public StudentDataAccessObject() {
    }
    private static StudentDataAccessObject instance;

    public static StudentDataAccessObject getInstance(){
        if(instance == null)
            instance = new StudentDataAccessObject();
        return  instance;
    }
    @Override
    public ArrayList list() {
        try {
            Connector conn = Connector.getInstance();
            ResultSet resultSet = conn.getQuery("Select * From student");
            ArrayList<Student> ls =new ArrayList<>();
            while (resultSet.next()){
                ls.add(new Student(resultSet.getInt("id"),resultSet.getString("name"),
                       resultSet.getInt("Age"),resultSet.getInt("Mark")));
            }
            return null;
        }catch (Exception e){
        }

        return null;
    }
    public Student getOne(int id){
        try{
            Connector conn = Connector.getInstance();
            ResultSet rs = conn.getQuery("SELECT * FROM student WHERE id = "+id);
            while (rs.next()){
                return new Student(rs.getInt("id"),rs.getString("name"),
                        rs.getInt("Age"),rs.getInt("Mark"));
            }
        }catch (Exception e){
        }
        return null;
    }


    @Override
    public Boolean create(Object o) {
        return null;
    }

    @Override
    public Boolean update(Object o) {
        return null;
    }

    @Override
    public Boolean delete(Object o) {
        return null;
    }
}
