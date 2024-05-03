class Solution {
    public int solution(String my_string, String is_suffix) {
        if(my_string.charAt(my_string.length() - 1)
           == is_suffix.charAt(is_suffix.length() - 1)) {
            if(my_string.length() >= is_suffix.length()) {
                return compareStr(my_string, is_suffix);   
            }
        }
        
        return 0;
    }
    
    public int compareStr(String a, String b) {
        StringBuilder _a = new StringBuilder();
        StringBuilder _b = new StringBuilder();
        
        for(int i = a.length() - 1; 0 <= i; i--) _a.append(a.charAt(i));
        for(int i = b.length() - 1; 0 <= i; i--) _b.append(b.charAt(i));
        
        System.out.println(_a);
        System.out.println(_b);
        
        for(int i = 0; i < b.length(); i++) {
            if(_a.charAt(i) != _b.charAt(i)) return 0;
        }
        
        return 1;
    }
}