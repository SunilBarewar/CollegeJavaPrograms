import java.io.*;

/*
    Write a program that accept marks of 5 subject, calculate 
    total,percentage and display the grade according to their percentage.
 */

 class Marksheet{
     private int total = 0;
     private float percent;
     private int marks[] = new int[5];
     Marksheet(int []marks){
         this.marks = marks;
     }
     int totalMarks(){
         for(int i = 0; i <marks.length;i++){
             total += marks[i];
         }
         return total;
     }
    float percentage(){
        percent = total / 5.0f;
        return percent;
    }
    void grade(){
        if(percent >= 75){
            System.out.println("Grade = A");
        }else if(percent >= 60){
            System.out.println("Grade = B");
        }else {
            System.out.println("Grade = C");
        }
     }
 }
 public class Program3{
     public static void main(String[] args) {
         Marksheet obj = new Marksheet(new int[]{60,70,65,75,50});
         System.out.println("Total = " +obj.totalMarks());
         System.out.println("Percentage = " + obj.percentage());
         obj.grade();
     }
 }