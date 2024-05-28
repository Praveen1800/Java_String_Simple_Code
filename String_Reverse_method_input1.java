package String_Practics;

// write a Program in Reverse the String in Take User input
import java.util.Scanner;

public class String_Reverse_method_input1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String a = sc.nextLine();

        StringBuffer r = new StringBuffer(a);

        System.out.println(r.reverse());

    }
}
