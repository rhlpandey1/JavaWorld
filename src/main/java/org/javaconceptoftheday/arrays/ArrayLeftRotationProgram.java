package org.javaconceptoftheday.arrays;

import java.util.Arrays;

public class ArrayLeftRotationProgram {
    public static void main(String[] args) {
        int[] inputArray={1,2,3,4,5,6,7};
        System.out.println("Input Array Before Rotation :");

        System.out.println(Arrays.toString(inputArray));

        int temp;

        for (int i = 0; i < 2; i++)
        {
            temp = inputArray[0];

            for (int j = 0; j < inputArray.length-1; j++)
            {
                inputArray[j] = inputArray[j+1];
            }

            inputArray[inputArray.length - 1] = temp;
        }

        System.out.println("Input Array After Left Rotation By "+2+" Positions :");

        System.out.println(Arrays.toString(inputArray));


    }
}
