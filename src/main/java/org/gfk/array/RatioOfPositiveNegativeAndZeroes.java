package org.gfk.array;

public class RatioOfPositiveNegativeAndZeroes {
    public static void main(String[] args) {
        int a[] = {2, -1, 5, 6, 0, -3};
        float p=0,n=0,z = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0)
                z++;
            else if(a[i]<0)
                n++;
            else
                p++;
        }
        System.out.println("Ratio of Pos,Neg and zeroes are");
        System.out.printf("%1.4f",p/a.length);
        System.out.print(":");
        System.out.printf("%1.4f",n/a.length);
        System.out.print(":");
        System.out.printf("%1.4f",z/a.length);

    }
}
