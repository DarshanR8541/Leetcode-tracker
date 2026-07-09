// Last updated: 7/9/2026, 9:21:25 AM
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        String[] rows = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }
        int row = 0;
        boolean down = true;
        for (char ch : s.toCharArray()) {
            rows[row] += ch;
            if (row == 0) {
                down = true;
            } else if (row == numRows - 1) {
                down = false;
            }
            if (down) {
                row++;
            } else {
                row--;
            }
        }
        String ans = "";
        for (String str : rows) {
            ans += str;
        }
        return ans;
    }
}