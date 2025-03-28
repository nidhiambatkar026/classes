//area of Rectangle
import java.io.*;
class Rectangle{
    int length;
    int width;

    void getdata(int l, int w){
        length= l;
        width = w;
    }
    void area(){
        int a;
        a = length*width;
        System.out.println("Area of Rectangle: "+a);
    }
}
class rect {
    public static void main(String args[]){
        Rectangle R1 = new Rectangle();
        Rectangle R2 = new Rectangle();
        R1.getdata(10, 20);
        R2.getdata(70, 20);
        R1.area();
        R2.area();
    }
}