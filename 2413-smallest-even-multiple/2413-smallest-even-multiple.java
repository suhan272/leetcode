class Solution {
    public int smallestEvenMultiple(int n) {
        int i=1;
        int res=0;
        while(i>0){
        if(i%2==0&&i%n==0){
            res=i;
            break;
        }
        i++;
        }
        return res;
    }
}