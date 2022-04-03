package Interview;

public class PolindromeString {
    public static void main(String[] args) {
        String word="madam";
        String reversed="";

        for(int i=word.length()-1;i>=0;i--){
            reversed+= word.charAt(i);


        }
        boolean ispalindrome=word.equalsIgnoreCase(reversed);
        System.out.println("ispalindrome = " + ispalindrome);;
    }
}
