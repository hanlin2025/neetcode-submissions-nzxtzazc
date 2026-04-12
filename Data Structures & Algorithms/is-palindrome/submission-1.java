class Solution {
    public boolean isPalindrome(String s) {
        /*
            TODO:
            1. case-insensitive
            2. ignores all non-alphanumeric -> symbol and space
        */
        s = s.trim();
        char[] sChar = s.toCharArray();
        if (sChar.length == 0) {
            return true;
        }
        int r = sChar.length - 1;
        for (int l = 0; l < sChar.length; l++) {
            if (l >= r) {
                return true;
            }
            Character left = sChar[l];
            Character right = sChar[r];
            if (!Character.isLetterOrDigit(left)) {
                continue;
            } else if (!Character.isLetterOrDigit(right)) {
                r--;
                l--;
                continue;
            }
            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                break;
            }
            r--;
        }

        return false;
    }
}
