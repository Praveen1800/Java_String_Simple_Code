package String_Practics;

// write a Program in Reverse the String
public class String_Reverse{
    public static void main(String[] args){

        int i , l;
        String a = "Ankit kumar Ojha ";
        String b = "";
        l = a.length();

        System.out.println(a);

        for( i=l-1; i>=0; i--){
            b = b+a.charAt(i);
        }

        System.out.println( " Reverse String = " + b);

    }
}
