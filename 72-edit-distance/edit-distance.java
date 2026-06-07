
   class Solution {
    public int minDistance(String word1, String word2) {

        int dp[][] = new int[word1.length()][word2.length()];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return distance(dp, word1.length() - 1,
                        word2.length() - 1,
                        word1, word2);
    }

    public int distance(int dp[][], int i, int j,
                        String a, String b) {

        if (i < 0) return j + 1;
        if (j < 0) return i + 1;

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (a.charAt(i) == b.charAt(j)) {
            return dp[i][j] =
                distance(dp, i - 1, j - 1, a, b);
        }

        int insert = distance(dp, i, j - 1, a, b);
        int delete = distance(dp, i - 1, j, a, b);
        int replace = distance(dp, i - 1, j - 1, a, b);

        return dp[i][j] =
            1 + Math.min(insert,
                    Math.min(delete, replace));
    }
   }
