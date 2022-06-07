package sixt.round1;

public class BinaryToDecimal {
    public static void main(String[] args) {
        long bin=1111;
        int count=0;
        long temp=bin;
        while(bin!=0){
            count++;
            bin/=10;
        }
        System.out.println(count);
        System.out.println(temp);
        long sum=0;
        int i=0;
        while(i<count){
            long rem=temp%10;
            sum+=rem*Math.pow(2,i);
            temp/=10;
            i++;
        }
        System.out.println(sum);

        //String input
        String binary="1011";
        System.out.println(Integer.parseInt(binary,2));

    }
}
