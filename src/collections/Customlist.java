package collections;
import java.util.List;
import java.util.ArrayList;



class Student{
    int id;
    String name;
    String course;
     public Student(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
   @Override
    public String toString() {
        return id + " " + name + " " + course;

    }
}

public class Customlist {
    public static void main(String[] args) {
        Student s1=new Student(123,"aman","java");
        Student s2=new Student(143,"naman","java1");
        Student s3=new Student(153,"amani","java2");
        List<Student> studentlist =new ArrayList<>();
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);
        System.out.println(studentlist);
    }
}
