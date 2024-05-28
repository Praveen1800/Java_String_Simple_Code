package String_Practics;

// Java get middle character

import java.util.Scanner;

public class String_Midle_element_input{
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.print("Enter word: ");
        String sc=input.nextLine();
        int len=sc.length();
        int c=len/2;
        char ch[]=sc.toCharArray();
        System.out.println("Middle Character is: "+ch[c]);

    }
}
