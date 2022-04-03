package Interview;

public class IntReverse {
    public static void main(String[] args) {

        int num=12345;
        int reverse=0;

        while(num!=0){
            reverse*=reverse+num%10;
            reverse=num/10;
        }
        System.out.println(reverse);
    }

}

