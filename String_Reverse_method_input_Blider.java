package String_Practics;

import java.sql.SQLOutput;
import java.util.Scanner;
public class String_Reverse_method_input_Blider{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String :  ");
        String a = sc.nextLine();

        StringBuffer r = new StringBuffer(a);

        System.out.println(r.reverse());

    }
}
