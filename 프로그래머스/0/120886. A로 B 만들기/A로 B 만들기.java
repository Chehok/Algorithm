class Solution {
    public int solution(String before, String after) {
        char[] _before = new char[26];
        char[] _after = new char[26];
        
        for(int i = 0; i < before.length(); i++) {
            _before[before.charAt(i) - 'a']++;
            _after[after.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < 26; i++) {
            if(_before[i] != _after[i]) return 0;
        }
        
        return 1;
    }
}