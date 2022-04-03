package Interview;

public class ContOddAndEvenDigitsInNumber {

    public static void main(String[] args) {
        int num=24689;
        int even_count=0;
        int odd_count=0;

        while(num>0){

            if (num%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
           num=num/10;

        }
        System.out.println("odd_count = " + odd_count);
        System.out.println("even_count = " + even_count);


    }
}
