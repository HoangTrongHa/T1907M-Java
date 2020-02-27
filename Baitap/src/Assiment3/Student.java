package Assiment3;

public class Student {
    int id;
    String name;
    int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String Method(){
        System.out.println("Thong Tin sinh vien\n"+getName()+"\n"+getId()+"\n"+getAge());
        return toString();
    }
    class Employee{
        int id;
        String Name;
        long Salary;

        public Employee(int id, String name, long salary) {
            this.id = id;
            Name = name;
            Salary = salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public long getSalary() {
            return Salary;
        }

        public void setSalary(long salary) {
            Salary = salary;
        }
        public void information(){
            System.out.println(getId()+getName()+getSalary());

        }
    }
class PersonModel{

    }
}
