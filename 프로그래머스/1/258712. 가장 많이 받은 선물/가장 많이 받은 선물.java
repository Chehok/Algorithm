import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Map<String, Integer>> receivedGift = new HashMap<>();
        Map<String, Integer> receivedCnt = new HashMap<>();
        Map<String, Integer> defaultMap = new HashMap<>();
        
        for(int i = 0; i < friends.length; i++) {
            receivedCnt.put(friends[i], 0);
            receivedGift.putIfAbsent(friends[i], new HashMap<>());
            Map<String, Integer> givedGift = receivedGift.get(friends[i]);
            
            for(int j = 0; j < friends.length; j++) {
                if(i == j) continue;
                givedGift.put(friends[j], 0);
            }
        }
        
        for(String s: gifts) {
            String[] temp = s.split(" ");
            String giver = temp[0];
            String receiver = temp[1];
            Map<String, Integer> givedGift = receivedGift.get(receiver);
            
            givedGift.put(giver, givedGift.getOrDefault(giver, 0) + 1);
            receivedCnt.put(receiver, receivedCnt.getOrDefault(receiver, 0) - 1);
            receivedCnt.put(giver, receivedCnt.getOrDefault(giver, 0) + 1);
        }
        
        for(String friend: friends) {
            int cnt = 0;
            Map<String, Integer> givedGift = receivedGift.get(friend);
            
            if(givedGift != null) {
                for(String giver: givedGift.keySet()) {
                    int received = givedGift.getOrDefault(giver, 0);
                     
                    int gived = receivedGift.getOrDefault(giver, defaultMap).getOrDefault(friend, 0);
                    
                    if(received < gived) {
                        cnt++;
                    } else if (received == gived) {
                        int receiverCnt = receivedCnt.get(friend);
                        int giverCnt = receivedCnt.get(giver);
                        if(receiverCnt > giverCnt) {
                            cnt++;
                        }
                    }
                }
            }
            answer = answer < cnt ? cnt : answer;
        }
        
        return answer;
    }
}