class Solution {
    public int minInsertions(String s) {
    int ans = 0;
    int cls = 0;

    for (char c : s.toCharArray()) {
        if (c == '(') {
            if (ans % 2 != 0) {
                ans--;
                cls++;
            }
            ans += 2;
        } else {
            ans--;

            if (ans < 0) {
                cls++;
                ans = 1;
            }
        }
    }

    return cls + ans;
}

}