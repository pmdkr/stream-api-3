package JavaFeature.Version17.patternMatching;

public class PatternDemo1 {

    public static void main(String[] args) {
        System.out.println("pattern matching feat introduced in java 17");

        Object obj = "Hello";


        //before java 17
        if (obj instanceof String) {
            String str = (String) obj;
            System.out.println(str.length());
        }


        //after java 17
        if (obj instanceof String str) {
            System.out.println(str.length());
        }
    }
}
