class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != '#') {
                st.push(ch);
            } else if (!st.isEmpty()) {
                st.pop();
            }
        }
        String a = st.toString();
        st.clear();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (ch != '#') {
                st.push(ch);
            } else if (!st.isEmpty()) {
                st.pop();
            }
        }
        String b = st.toString();

        return a.equals(b);
    }
}