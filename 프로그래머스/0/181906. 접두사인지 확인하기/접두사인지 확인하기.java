class Solution {
    public int solution(String my_string, String is_prefix) {
        if(my_string.charAt(0) == is_prefix.charAt(0)) {
            if(my_string.length() > is_prefix.length()) {
                return compareStr(my_string, is_prefix);
            }
        }
        return 0;
    }
    
    public int compareStr(String a, String b) {
        for(int i = 0; i < b.length(); i++) {
            if(a.charAt(i) != b.charAt(i))
                return 0;
        }
        return 1;
    }
}