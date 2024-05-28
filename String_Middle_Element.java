package String_Practics;

// Java get middle character
public class String_Middle_Element {
    public static void main(String[] args) {

        String a = "Ankit kumar Ojha";
        int len = a.length();
        int c = len / 2;

        char ch[]=a.toCharArray();

        System.out.println("Middle : " + ch[c]);

    }
}
