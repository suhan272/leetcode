class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
     
        int max = releaseTimes[0];
        char ans = keysPressed.charAt(0);
        for (int i = 1; i < releaseTimes.length; i++) {
            int time= releaseTimes[i] - releaseTimes[i - 1];
            if (time > max||(time == max&& keysPressed.charAt(i) > ans)) {
                max = time;
                ans = keysPressed.charAt(i);
            }
        }
        return ans;
    }
}
