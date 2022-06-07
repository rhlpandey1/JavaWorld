package informatica;

public class StarPattern {
    public static void main(String[] args) {

        //String str="1234125dhdaf";

        //dv[]


        //first row one star
        //    *   //i=0
        //   *  *
        //  *  *   *
        //second row 2 star

        //first loop one //second loop two // third loop 3
        for(int i=0;i<4;i++){

            for(int j=4;j>i;j--){
                System.out.print("*");
                System.out.print("\t");

            }
            System.out.println();
        }
    }
}
