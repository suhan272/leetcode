class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int small=nums[0];
        int large=nums[n-1];
        int max=1;
        for(int i=2;i<=large;i++){
            int c=1;
            if(small%i==0&&large%i==0){
                c=i;
            }
            if(c>max){
                max=c;
            }
        }return max;
    }
}