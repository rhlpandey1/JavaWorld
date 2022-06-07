package MorganStanely.HackerRank;

public class MinimumFlips {
    /*Input: S = “01011”
    Output: 3
    Explanation:
    Initial String – “00000”
    Flip the 2nd bit – “01111”
    Flip the 3rd bit – “01000”
    Flip the 4th bit – “01011”
    Total Flips = 3*/
    public static void main(String[] args) {
        String target="10101";
      //  String initial="00000";
        char curr='1';
        int count=0;
        for(int i=0;i<target.length();i++){
            if(target.charAt(i)==curr){
                count++;
                curr= (char) (48+(curr+1)%2);
            }
        }
        System.out.println(count);
    }
}
