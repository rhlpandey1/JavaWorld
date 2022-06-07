package org.gfk.strings;

public class GenerateRandomString {
    static String generateRandom(int length){
        String regex="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i <length; i++) {
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                    = (int)(regex.length()
                    * Math.random());

            // add Character one by one in end of sb
            sb.append(regex
                    .charAt(index));
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(generateRandom(5));
    }
}
