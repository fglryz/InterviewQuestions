package Interview;

import java.util.Arrays;

public class ArrayReverse2 {
    public static void main(String[] args) {

        int []array={1,2,3,4,5};
        int[] reverse=new int[5];
          int j=0;
        for (int i = array.length-1; i >=0 ; i--) {

            reverse[j++]=array[i];
            }
        System.out.println(Arrays.toString(reverse));
        }


    }




