import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> solution(String myString) {
        List<String> list = new ArrayList<>();
        myString = myString.replaceAll(" ", "");
        
        for(String s: myString.split("x")) {
            if(s.length() == 0) continue;
            list.add(s);
        }
        
        Collections.sort(list);
        
        return list;
    }
}