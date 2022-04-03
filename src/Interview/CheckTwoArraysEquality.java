package Interview;

import java.util.Arrays;

public class CheckTwoArraysEquality {
    public static void main(String[] args) {

        int[] num1={1,2,3,4,5};
        int[]num2={1,2,3,4,5};
       boolean status= Arrays.equals(num1,num2);
       if(status==true){
           System.out.println("Arrays are equal");
       }
       else{
           System.out.println("Arrays not equal");
       }
        System.out.println(".........................");

    }

}
