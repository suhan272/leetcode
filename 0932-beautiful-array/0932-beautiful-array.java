class Solution {
    public int[] beautifulArray(int n) {
        if(n==1)
    {
        return new int[]{1};

    }
    int []left = beautifulArray((n+1)/2);
    int []right = beautifulArray(n/2);
    int ans[] = new int[n];
        int index = 0;
        for(int val : left)
    {
        ans[index++] = 2 * val - 1;
    }
    for(int val : right)
    {
        ans[index++]=2 * val;
    }
    return ans;
    }
}
