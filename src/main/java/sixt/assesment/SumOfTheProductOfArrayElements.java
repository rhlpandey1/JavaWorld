package sixt.assesment;

public class SumOfTheProductOfArrayElements {

    static int magicValue(int n,int[] a,int[] b){
        int result=0;
        for(int i=0;i<n;i++){
            int mod=10^9+7;
            int prod=(a[i]*b[i])/2;
            result+=prod%mod;
        }
        return result;
    }
    public static void main(String[] args) {
        int n=2;
        int[] a={2,2};
        int[] b={1,2};
        System.out.println(magicValue(n,a,b));
    }
}
