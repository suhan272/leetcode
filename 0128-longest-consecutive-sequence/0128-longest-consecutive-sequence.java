class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0) {
    return 0;
}
   
        int max=1;
         int c=1;
        for(int i=1;i<nums.length;i++){
                
                 if(nums[i-1]==nums[i]){
                    continue;
                 }
           else if(nums[i]==nums[i-1]+1){
                c++;
            }
            else{
            c=1;
            }
            max=Math.max(c,max);
        }
        return max;
    }
}