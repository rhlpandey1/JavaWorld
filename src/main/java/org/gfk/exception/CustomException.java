package org.gfk.exception;

public class CustomException extends Exception{
    public CustomException() {
    }

    public CustomException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        String str="Hello";
        try{
            if(!str.equalsIgnoreCase("Hi")){
                CustomException customException=new CustomException("String mismatch");
                throw customException;
            }
        }catch (CustomException ce){
            ce.printStackTrace();
        }

    }
}
