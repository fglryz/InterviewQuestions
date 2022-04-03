package Interview;

public class ReverseArray {
    public static void main(String[] args) {
String str="ABCD";
String rev="";

char[] a=str.toCharArray();
        for (int i = a.length - 1; i >= 0; i--) {
            rev+=a[i];
            
        }
        System.out.println(rev);
    
    
    
    
    
    }
}
