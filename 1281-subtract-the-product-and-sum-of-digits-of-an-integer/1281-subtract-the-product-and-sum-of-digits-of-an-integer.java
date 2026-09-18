class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        while(n>0){
            int tem=n%10;
            sum=sum+tem;
            pro=pro*tem;
            n=n/10;
        }
        int res=pro-sum;
        return res;
    }
}