package vmware;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    //write a method to check the anagram
    //write a method to check the count of the angrams in the given string.
    public static boolean checkAnagram(String str1,String str2){
        //check the length of the two strings, if length are not same then they can't be anagrams
        boolean flag=true;
        if(str1.length()!=str2.length())
            flag=false;
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        //sort the arrays
        /*Arrays.sort(ch1);
        Arrays.sort(ch2);*/
        Map<String,Integer> map=new TreeMap<>();




        //check if both are equal
        flag=Arrays.equals(ch1,ch2);

        return flag;
    }
    public static int getCountOfAnagrams(String str, String key){
        //get the substrings from the String
        int count=0;
        for(int i=0;i<=str.length();i++){
          for(int k = i+1;k<=str.length();k++){
              String sub=str.substring(i,k);
              if(checkAnagram(key,sub))
                  count++;
          }
        }
        return count;
    }
    public static int getCountOfAnagramsOpt(String str, String key){

        Map<String,Integer> map=new HashMap<>();
        //if map contains the anagram String then increase the counter by 1
        //else put 1


        //get the substrings from the String
        int count=0;
        String sub;
        for(int i=0;i<=str.length();i++){
            for(int k = i+1;k<=str.length();k++){
                sub=str.substring(i,k);
                if(sub.length()==key.length()){
                    if(checkAnagram(key,sub))
                        count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="aabaabaa";//aabaabaa
        String key="aaba";//aaba
        System.out.println(getCountOfAnagrams(str,key));
    }
}
