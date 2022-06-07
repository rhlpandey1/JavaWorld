package sony.round1;

public class ReverseSentence {
    public static void main(String[] args) {
        String str= "I Am Not String";
        //output:-> g ni rtS toNmAI
        char[] ch=str.toCharArray();
        char[] result=new char[str.length()];
        int n=str.length();
        for(int i=0;i<n;i++){
            if(ch[i]==' ')
                result[i]=ch[i];
        }
        int j=0;
        for(int i=n-1;i>=0;i--){
            if(ch[i]!=' '){
                if(result[j]==' '){
                    j++;
                }
                result[j]=ch[i];
                j++;
            }
        }
        System.out.println(new String(result));

    }
}
