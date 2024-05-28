package String_Practics;

 //  Write a program in java using equal method
/* equal method ke through kisi vi tarika se object banane par woh kewal contain dekhe ga
*    usko variable se matalab nahi raha ta hai */
public class String_Equals_method{
    public static void main(String[] args){

        String a = " Tiger";
        String b = new String(" Lion");

        if(a.equals(b)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

    }
}
