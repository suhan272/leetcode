class Solution {
    public int searchInsert(int[] nums, int target) {
        int res=nums.length;
        int l=nums.length;
           for(int i=0;i<l;i++){
            if(nums[i]==target){
                res=i;
                break;

            }else if(nums[i]>target){
                res=i;
                break;
            }
            
            }
        return res;
           }
      
        } 
    
