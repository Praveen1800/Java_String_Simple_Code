package String_Practics;

// Write a program in Take user input for String ;
import java.util.Scanner;

public class String_input{
    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Name : ");

        // Eke se jada Word print kareane ke liye nextLine ka use kiya jata hai
        String a  = sc.nextLine();

        System.out.println(" Your name is :" + a);

    }
}
