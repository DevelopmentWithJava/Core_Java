package COLLECTION_FRAMEWORKS;

import java.util.ArrayList;
import java.util.List;

class Student {

    private String name;
    private double gpa;

    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}

public class COMPARATOR_USING_JAVA_8_OBJECT {
    public static void main(String[] args) {

        List<Student> studentList1  = new ArrayList<>();
        studentList1.add(new Student("Zohaib",3.9));
        studentList1.add(new Student("Anwar",4.5));
        studentList1.add(new Student("king",7.5));
        studentList1.add(new Student("Khan",9.8));

  studentList1.sort(null);  // yaha pe null nhi hai de skte hai q ki natural ordering jisse yaha kxc nhi hai
  System.out.println(studentList1);
   If we want on the basis of the name then we use the compareTo() method
       studentList1.sort((a , b) -> (b.getGpa().compareTo(a.getGpa()));

        studentList1.sort((a , b) -> (int) (b.getGpa() - a.getGpa()));
        for (Student i : studentList1) {
            System.out.println(i.getGpa() + " " + i.getName());
        }



 
