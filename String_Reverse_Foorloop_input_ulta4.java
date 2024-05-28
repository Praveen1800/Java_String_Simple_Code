package String_Practics;


// Write a program in java Reverse String in using for loop take user input
import java.util.Scanner;


public class String_Reverse_Foorloop_input_ulta4{
    public static void main(String[] args){

        int i ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String a = sc.nextLine();

        System.out.println();
        String b = sc.nextLine();

        int l = a.length();

        for( i=l-1; i>=0; i--){
            b = b + a.charAt(i);
        }
        System.out.println(b);

    }
}
