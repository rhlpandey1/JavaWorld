package MorganStanely.round2;

import java.util.Locale;

public class SortEvenPositionCharactersDesc {
    public static void swap(char[] ch,int  i,int j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
    public static void main(String[] args) {
        String str="Rahul";
        
        //Rahul
        //Rahul
        //o/p: Raluh


         //RaHul

        char[] ch=str.toCharArray();

        for(int i=0;i< ch.length-1;i++){
           for(int j=0;j<ch.length-i-1;j++){
               char temp = ch[j];
               if(j%2==0){

                   if(Character.isUpperCase(ch[j]))
                   {
                       String s1=String.valueOf(ch[j]).toLowerCase();
                       temp=s1.charAt(0);
                   }
                   if(temp<ch[j+2])
                       swap(ch,j,j+2);
               }
           }
        }


        System.out.println(new String(ch));
    }

}
