class Solution {
    public int[] countBits(int n) {
        int res[]=new int[n+1];
 
        for(int i=0;i<=n;i++){
          int num=i;
           int c=0;
    while (num>= 1) {
    int temp = num% 2;

    if (temp == 1) {
        c++;
    }

    num =  num / 2;
}
  res[i]=c;
        }
       return res;
    }
}