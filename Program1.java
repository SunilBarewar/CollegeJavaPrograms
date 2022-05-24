import java.io.*;
class Room{
    float length;
    float breadth;

    void getData(float length,float breadth){
        this.length = length;
        this.breadth = breadth;
    }
}
public class Program1{
    public static void main(String[] args) {
        float area;
        Room room1 = new Room();
        room1.getData(14f,10f);
        area = room1.length * room1.breadth;
        System.out.println("Area  =  " + area);
    }
}
           
            