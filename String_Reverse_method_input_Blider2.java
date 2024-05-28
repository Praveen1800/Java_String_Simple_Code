package String_Practics;

import java.util.Scanner;

public class String_Reverse_method_input_Blider2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  First String : ");
        String a = sc.next();

        System.out.println("Enter the  Second String : ");
        String b = sc.next();

        StringBuilder r = new StringBuilder(a);
        StringBuilder v = new StringBuilder(b);

        System.out.println( " First Reverse String : " + r.reverse());
        System.out.println(" Second Reverse String : " + r.reverse());

    }
}
