//WAP to accept information of two books and display the book having highest price
import java.io.*;
import java.util.Scanner;
class Book{
    String book_name;
    float price;

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Name: ");
        book_name = sc.nextLine();
        System.out.println("Enter the Price of the Book: ");
        price = sc.nextFloat();
    }
    void display(){
        System.out.println("Book Name: "+book_name);
        System.out.println("Book Price: "+price);
    }
}
public class bookPrice {
    public static void main(String[] args) {
        Book B1 = new Book();
        Book B2 = new Book();
        B1.accept();
        B2.accept();
        if(B1.price > B2.price){
            B1.display();
        }
        else{
            B2.display();
        }  
    }
}