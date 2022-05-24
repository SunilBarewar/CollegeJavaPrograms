import java.io.*;
public class Program16{ 
    public static void main(String[] args) {
        FileOutputStream out;
        DataInputStream in = new DataInputStream(System.in);

        PrintStream p;

        try{
            int n = 0;
            out = new FileOutputStream("test.java");
            p = new PrintStream(out);
            System.out.println("Enter first no: ");
            n = Integer.parseInt(in.readLine());
            p.println(n);
            System.out.println("Enter second no: ");
            n = Integer.parseInt(in.readLine());
            p.println(n);
            p.close();
        }catch(Exception e){
            System.err.println("Error writting to file");
        }

    }
}