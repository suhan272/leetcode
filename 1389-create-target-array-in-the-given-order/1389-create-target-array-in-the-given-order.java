class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        int tar[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i;j>index[i];j--){
               tar[j] = tar[j - 1];
                   
                
             
            } tar[index[i]]=nums[i]; 
        }
return tar;

    }
}