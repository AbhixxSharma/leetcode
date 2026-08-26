class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
       
    String str = "";

    for (int i = 0; i < s.length(); i++) {

        int cnt = 0;

        for (int j = i; j < s.length(); j++) {

            if (s.charAt(j) == '1') {
                cnt++;
            }

            if (cnt == k) {

                String current = s.substring(i, j + 1);

                if (str.equals("")
                        || current.length() < str.length()
                        || (current.length() == str.length()
                        && current.compareTo(str) < 0)) {

                    str = current;
                }
            }

            if (cnt > k) {
                break;
            }
        }
    }

    return str;
}
}