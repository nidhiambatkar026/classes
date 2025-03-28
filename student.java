//WAP to create a class student having data members name, RollNo and Percentage accept and display data for three students.
import java.io.*;
import java.util.Scanner;
class Stud{
    String name;
    int RollNo;
    float Percentage;

    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name of Student: ");
        name = sc.nextLine();
        System.out.println("Enter Roll No of Student: ");
        RollNo = sc.nextInt();
        System.out.println("Enter Percentage of Student: ");
        Percentage = sc.nextFloat();
    }

    void display(){
        System.out.println("Name of student: " + name);
        System.out.println("Roll No of Student: " + RollNo);
        System.out.println("Percentage of Student: " + Percentage);
    }
}
public class student {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        Stud s2 = new Stud();
        Stud s3 = new Stud();
        s1.accept();
        s2.accept();
        s3.accept();
        s1.display();
        s2.display();
        s3.display();
    }
}