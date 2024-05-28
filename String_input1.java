package String_Practics;

// Write a program in Take user input for String ;
import java.util.Scanner;
public class String_input1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name :  ");

        // Eke  Word print kareane ke liye next() ka use kiya jata hai
        String a = sc.next();

        System.out.println("Your Name is : " + a);


    }
}
