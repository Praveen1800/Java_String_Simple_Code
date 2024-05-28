package String_Practics;

// Write a program in java Print the String in take user input
import java.util.Scanner;

public class String_String_print_input{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String  :");
        String a = sc.next();

        System.out.println("Enter the 2nd String :  ");
        String b = sc.next();

        String s = new String(a);
        String v = new String(b);

        System.out.println(s);
        System.out.println(v);

        System.out.println( " Add the through Concate OPeration = " + s + " " +  v);

    }
}
