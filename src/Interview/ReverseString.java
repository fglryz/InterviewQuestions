package Interview;

public class ReverseString {
    public static void main(String[] args) {

        String sentence="ABCD";
        String rev=" ";
        for (int i = sentence.length()-1; i >=0; i--) {
            rev+=sentence.charAt(i);


        }
        System.out.println(rev);
    }
}
