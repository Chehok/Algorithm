import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, HashSet<String>> reportInfo = new HashMap<>();
        int[] result = new int[id_list.length];
        
        for(String r: report) {
            String reporter = r.split(" ")[0];
            String reported = r.split(" ")[1];
            reportInfo.putIfAbsent(reported, new HashSet<String>(){{
                add(reporter);
            }});
            reportInfo.get(reported).add(reporter);
        }
        
        for(String reported: reportInfo.keySet()) {
            if(reportInfo.get(reported).size() < k) continue;
            
            for(String s: reportInfo.get(reported)) {
                for(int i = 0; i < id_list.length; i++) {
                    if(id_list[i].equals(s)) {
                        result[i]++;
                        continue;
                    }
                }
            }
        }
        
        return result;
    } 
}