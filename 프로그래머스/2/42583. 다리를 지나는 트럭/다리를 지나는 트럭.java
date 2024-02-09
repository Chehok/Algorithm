import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<int[]> bridge = new LinkedList<>(); // time, weight
        int nowWeight = 0;
        int time = 0;
        
        int idx = 0;
        while(idx != truck_weights.length || nowWeight != 0) {
            time++;
            if(!bridge.isEmpty() && bridge.peek()[0] + bridge_length - time <= 0)
                nowWeight -= bridge.poll()[1];
            
            if(bridge.size() < bridge_length) {
                if(idx < truck_weights.length && truck_weights[idx] + nowWeight <= weight) {
                    bridge.add(new int[] {time, truck_weights[idx]});
                    nowWeight += truck_weights[idx++];
                }
            }
        }
        return time;
    }
}