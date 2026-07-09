// Last updated: 7/9/2026, 9:19:37 AM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        for (char c : ransomNote.toCharArray()) {

            int index = magazine.indexOf(c);

            if (index == -1) {
                return false;
            }

            magazine = magazine.substring(0, index)
                    + magazine.substring(index + 1);
        }

        return true;
    }
}