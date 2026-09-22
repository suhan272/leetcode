class Solution {
    public boolean isThree(int n) {
        boolean res=false;
        int c=1;
        for(int i=1;i<n;i++){
           if(n%i==0){
               c++;
}
        }
        if(c==3){
            res=true;
        }
        return res;
    }
}