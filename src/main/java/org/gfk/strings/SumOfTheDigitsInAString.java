package org.gfk.strings

public class SumOfTheDigitsInAString {
    public static void main(String[] args) throws Exception {
      //count the sum of numbers in a string
        String str="a1b2c3def";
        char[] ch=str.toCharArray();
        int sum=0;
      // Java7
        for(int i=0;i< ch.length;i++){
            if(Character.isDigit(ch[i])){
                int j=ch[i]-'0';
                sum+=j;
            }

        }
      //Java8
        sum=str.chars().filter(Character::isDigit).map(Character::getNumericValue)
                        .sum();
        System.out.println(sum);
    }
 
}
