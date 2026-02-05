// Largest element in an Array

import java.util.Arrays;

public class Day2 {
    public static void main(String[] args) {
        int[] LargestElement = {4 , 5 ,2 ,7,3 ,7, 3,9,0  ,3};

        Arrays.sort(LargestElement);
        System.out.println("Largest Element");

        System.out.println(Arrays.toString(LargestElement));
        System.out.println(LargestElement.length);
        System.out.println(LargestElement[9]);

    }
}