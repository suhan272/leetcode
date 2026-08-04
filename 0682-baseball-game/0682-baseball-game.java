class Solution {
    public int calPoints(String[] operations) {

        int[] res = new int[operations.length];
        int last = -1;

        for (String op : operations) {
            if (op.equals("C")) {
                last--;
            } else if (op.equals("D")) {
                int val = res[last] * 2;
                res[++last] = val;
            } else if (op.equals("+")) {
                int val = res[last] + res[last - 1];
                res[++last] = val;
            } else {
                res[++last] = Integer.parseInt(op);
            }
        }
        int sum = 0;
        for (int i = 0; i <= last; i++) {
            sum += res[i];
        }
        return sum;
    }
}