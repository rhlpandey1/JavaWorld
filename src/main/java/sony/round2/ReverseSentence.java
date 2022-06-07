package sony.round2;

public class ReverseSentence {
    public static void main(String[] args) {
        String str= "I Am Not String";
        //output:-> g ni rtS toNmAI
        char[] ch=str.toCharArray();
        //take another character array of same length
        char[] result=new char[str.length()];
        int n=str.length();
        //store all the spaces in the second array
        for(int i=0;i<n;i++){
            if(ch[i]==' ')
                result[i]=' ';
        }
        //initialize one counter
        int j=0;
        //loop from end to start since we need to reverse the String
        for(int i=n-1;i>=0;i--){
            //if character of original array is non-space but the second array is a letter then increment by 1
            if(ch[i]!=' '){
                if(result[j]==' '){
                    j++;
                }
                //store the next element of first array into the second array
                result[j]=ch[i];
                //increase the counter
                j++;
            }
        }
        System.out.println(new String(result));

    }
}
