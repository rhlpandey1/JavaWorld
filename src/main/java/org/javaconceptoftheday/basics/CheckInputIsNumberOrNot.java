package org.javaconceptoftheday.basics;

public class CheckInputIsNumberOrNot {

    static boolean numberOrNot(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String input="123";
        boolean flag=true;
        for(int i=0;i<input.length();i++){
            if(!Character.isDigit(input.charAt(i))){
                flag=false;
                break;
            }
        }
        System.out.println("Input is Number ?"+flag);
        System.out.println(numberOrNot(input));
    }
}
