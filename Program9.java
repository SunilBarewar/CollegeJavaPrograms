

class SingleInheritance{
    int length,breadth;

    SingleInheritance(int length,int breadth){
        this.length  = length;
        this.breadth = breadth;
    }

    int area(){
        return length * breadth;
    }

}

class Room extends SingleInheritance{
    int height = 0;
    Room(int length,int breadth,int height){
        super(length, breadth);
        this.height = height;
    }

    int volume(){
        return (super.length * super.breadth * height);
    }
}

public class Program9{
    public static void main(String[] args) {
        Room obj = new Room(14, 12, 10);
        int area = obj.area();
        int volume = obj.volume();
        System.out.println("Area = " + area);
        System.out.println("Volume = " + volume);
       
    }
}