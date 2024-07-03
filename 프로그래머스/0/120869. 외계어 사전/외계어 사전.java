class Solution {
    public int solution(String[] spell, String[] dic) {
        
        for(int i = 0; i < dic.length; i++) {
            for(int j = 0; j < spell.length; j++) {
                dic[i] = dic[i].replaceFirst(spell[j], "-");
            }
        }
        
        for(String s: dic) {
            if(s.length() == spell.length) {
                if(s.replaceAll("-", "").length() == 0) return 1;
            }
        }
        
        return 2;
    }
}