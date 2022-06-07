package org.sdetqa;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
        /*Random random=new Random();
        int num=random.nextInt(123456789);
        System.out.println(num);*/

       /* System.out.println(Math.random());
        int max = 10;
        int min = 1;
        int range = max - min + 1;

        // generate random numbers within 1 to 10
        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * range) + min;
            // Output is different everytime this code is executed
            System.out.println(rand);
        }*/
        //using apache lang
        System.out.println(RandomStringUtils.randomNumeric(5));

    }
}
