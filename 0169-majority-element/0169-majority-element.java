class Solution {

    public int majorityElement(int[] nums) {
        return divide(nums, 0, nums.length - 1);
    }

    int divide(int[] nums, int left, int right) {

   
        if (left == right)
            return nums[left];

        int mid = left + (right - left) / 2;

        int leftM = divide(nums, left, mid);
        int rightM = divide(nums, mid + 1, right);
        if (leftM == rightM)
            return leftM;
        int leftCount = count(nums, leftM, left, right);
        int rightCount = count(nums, rightM, left, right);
        if (leftCount > rightCount)
            return leftM;
        else
            return rightM;
    }
    int count(int[] nums, int target, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++) {
            if (nums[i] == target)
                count++;
        }
        return count;
    }
}
