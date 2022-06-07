package org.javaconceptoftheday.strings;
 public class ReverseASentenceWordByWord {
     public static void main(String[] args) {
         String str="Java Concept Of The Day";
         String output="";
         String[] arr=str.split("\\W");
         for(int i=arr.length-1;i>=0;i--){
            output+=arr[i]+" ";
         }
         System.out.println(output.trim());
     }

}
