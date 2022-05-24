
class Rectangle{
    int length;
    int breadth;

    Rectangle(){
        length = breadth = 0;
    }
    Rectangle(int length,int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void rectArea(){
        int area = length * breadth;
        System.out.println("Area of rectangle = " + area);
    }
}

public class Program7{
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(10,20);

        rect1.rectArea();
        rect2.rectArea();
    }
}