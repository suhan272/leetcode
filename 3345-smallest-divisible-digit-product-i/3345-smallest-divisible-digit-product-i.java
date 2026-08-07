class Solution {
    public int smallestNumber(int n, int t) {
        int res=0;
        for(int i=n;i<=100;i++){
            int prodt=1;
            int temp=i;

            while(temp>0){
               int  digit=temp%10;
                prodt=prodt*digit;
                temp=temp/10;
            }
            if(prodt%t==0){
                res=i;
                break;
            }
        }return res;
    }
}