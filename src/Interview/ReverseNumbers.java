package Interview;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();

        int rev =0;

        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;

        }
        System.out.println(rev);
scanner.close();

        System.out.println("-----------------------");

        int n=1234;
        String reversed=" ";
        String n1="1234";
        String[] s =new String[n1.length()];
        String[] word=n1.split("");

        for (int i = word.length - 1; i >= 0; i--) {

            reversed+=word[i]+" ";

        }
        System.out.println(reversed);






        }

    }


