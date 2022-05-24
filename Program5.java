import java.util.Scanner;

public class Program5{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = input.nextInt();
        int arr[] =new int[size];
        // taking input in array
        System.out.println("Enter the "+ size + " numbers : ");
        for(int i = 0; i < size;i++){
            arr[i]= input.nextInt();
        }
        // printing array elements
        System.out.println("Numbers are : ");
        for(int i = 0; i < size;i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        int sum = 0;
        for(int i = 0;i < size; i++){
            sum+= arr[i];
        }
        System.out.println("Average is "+sum /5f);
    }
}