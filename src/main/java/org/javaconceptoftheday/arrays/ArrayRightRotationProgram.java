package org.javaconceptoftheday.arrays;

import java.util.Arrays;

public class ArrayRightRotationProgram {
    public static void main(String[] args) {
        int[] inputArray={1,2,3,4,5,6,7};
        System.out.println("Input Array Before Rotation :");

        System.out.println(Arrays.toString(inputArray));

        int temp;

        for (int i = 0; i < 2; i++)
        {
            temp = inputArray[inputArray.length-1];

            for (int j = inputArray.length-1; j >0 ; j--)
            {
                inputArray[j] = inputArray[j-1];
            }

            inputArray[0] = temp;
        }

        System.out.println("Input Array After Right Rotation By "+2+" Positions :");

        System.out.println(Arrays.toString(inputArray));


    }
}
