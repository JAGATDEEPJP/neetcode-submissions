class Solution {
    public boolean isPalindrome(String s) {
        char[] strArr = s.toCharArray();
        int start = 0;
        int end = strArr.length - 1;
        while(start<end) {
            while(!validateAlphaNumeric(strArr[start])&& start < end)
                start++;
            while(!validateAlphaNumeric(strArr[end]) && start < end)
                end--;
            if(Character.toLowerCase(strArr[start]) != Character.toLowerCase(strArr[end]))
                return false;
            start++;
            end--;
        }
        return true;
    }

    boolean validateAlphaNumeric(char c) {
        // System.out.println(c);
        if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9'))
            return true;
        return false;
    }
}
