//    https://leetcode.com/problems/richest-customer-wealth/
class Solution1 {
    public int maximumWealth(int[][] accounts) {
        int s=0, max=0;

        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[i].length; j++){
                s= s+ accounts[i][j];
            }
            if(i==0){
                max=s;
                s=0;
            }
            else if(i>0){
                if(max<s){
                    max=s;
                    s=0;
                }else{
                    s=0;
                }
            }
        }

        return max;
    }
}
