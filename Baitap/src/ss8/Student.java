package ss8;

public class Student {
    int id;
    String name;
    int age;
    int mark;

    public Student() {
    }

    public Student(int id, String name, int age, int mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mark = mark;
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

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String toString(){
        return getId()+"-"+getName()+"-"+getAge()+"-"+getMark();

    }
}
