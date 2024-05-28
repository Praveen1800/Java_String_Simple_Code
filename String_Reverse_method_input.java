package String_Practics;

// write a Program in Reverse the String in Take User input
import java.util.Scanner;

public class String_Reverse_method_input{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :");
        String a = sc.next();

        // using String Pre Define Method

        StringBuilder r = new StringBuilder(a);

        System.out.println(r.reverse());

    }
}
