class Solution {
    public int minRotations(String s) {
        int total=0;
        int current=0;
        for(int i=0;i<s.length();i++){
            int target=s.charAt(i)-'0';
            int diff=Math.abs(current-target);
            int rotation=Math.min(diff,10-diff);
            total+=rotation;
            current=target;
        }
        return total;
    }
}