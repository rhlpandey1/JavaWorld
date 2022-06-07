package org.javaconceptoftheday.basics;

public class LargestNumberLessThanGivenNumber {
    public static void main(String[] args) {
        int num=98512;
        int dig=5;
        //largest number less than 145 and doesn't contain 4 is 139
        int max=0;
        for(int i=0;i<num;i++){
            if(i>max && !String.valueOf(i).contains(String.valueOf(dig)))
                max=i;
        }

        System.out.println(max);
    }

}
