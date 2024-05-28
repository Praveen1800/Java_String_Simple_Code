package String_Practics;

// Write a program in java Reverse String in using for loop
public class String_Reverse_Foorloop_ulta{
    public static void main(String[] args){
        int i,l;
        String a = "Ankit";
        String b = "";

        l = a.length();

        for( i=l-1; i>=0; i-- ){
            b = b + a.charAt(i);
        }
        System.out.println(b);

    }
}
