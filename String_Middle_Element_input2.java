package String_Practics;

// Java get middle character
import java.util.Scanner;
public class String_Middle_Element_input2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name : ");
        String a = sc. nextLine();

        //int length = a.length();

        int c = a.length()/2;

        char ch[] = a.toCharArray();

        System.out.println(ch[c]);


    }
}
