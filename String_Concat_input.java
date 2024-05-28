package String_Practics;

//  Write a program in string using take user input concat method()
// concat = add karna
import java.util.Scanner;
public class String_Concat_input{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Name : ");
        String a = sc.nextLine();

        System.out.println("Enetr the 2nd Name : ");
        String b = sc.nextLine();

      //  System.out.println(a + b);

        // using concat string method
        System.out.println(a.concat(b));


    }
}
