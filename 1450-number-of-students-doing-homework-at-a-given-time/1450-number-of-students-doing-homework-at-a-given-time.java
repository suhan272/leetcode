class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int res=0;
        int c=1;
        for(int i=0;i<startTime.length;i++){
            for(int j=i;j==i;j++){
            if(startTime[i]<=queryTime&&endTime[j]>=queryTime){
                res=c;
                c++;
            }

            }
        }return res;
    }
}