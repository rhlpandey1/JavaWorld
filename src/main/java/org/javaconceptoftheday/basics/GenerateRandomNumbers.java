package org.javaconceptoftheday.basics;

import java.util.Random;

public class GenerateRandomNumbers {
    public static void printRandomUsingRandomClass(int n){
        Random random = new Random();

        //Generating random integers using Random class

        for(int i = 0; i < n; i++)
        {
            System.out.println("Random Integers : "+random.nextInt());
        }

        System.out.println("-----------------------------");

        //Generating random doubles using Random class

        for(int i = 0; i < n; i++)
        {
            System.out.println("Random Doubles : "+random.nextDouble());
        }

        System.out.println("-----------------------------");

        //Generating random booleans using Random class

        for(int i = 0; i < n; i++)
        {
            System.out.println("Random booleans : "+random.nextBoolean());
        }
    }
    public static void generateRandomUsingMath(int n){
        for(int i = 0; i < n; i++)
        {
            System.out.println("Random Doubles : "+Math.random());
        }
    }
    public static void main(String[] args) {
       printRandomUsingRandomClass(5);
       generateRandomUsingMath(5);
    }
}
