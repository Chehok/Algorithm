import java.util.Arrays;
import java.util.ArrayList;
import java.util.PriorityQueue;

class Solution {
    public int solution(String[][] book_time) {
        int[][] bookTime = new int[book_time.length][2];
        
        for(int i = 0; i < book_time.length; i++) {
            bookTime[i][0] = intClock(book_time[i][0]);
            bookTime[i][1] = intClock(book_time[i][1]);
        }
        
        Arrays.sort(bookTime, (o1, o2) -> {
            if(Integer.compare(o1[0], o2[0]) == 0) {
                return Integer.compare(o1[1], o2[1]);
            } else {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        
        PriorityQueue<int[]> q = new PriorityQueue<>((o1, o2) -> Integer.compare(o1[1], o2[1]));
        
        for(int[] i: bookTime) {
            if(q.size() > 0) {
                if(q.peek()[1] + 10 <= i[0]) {
                    q.poll();
                }
            }
            q.add(i);
        }
        
        return q.size();
    }
    
    private int intClock(String time) {
        String[] arr = time.split(":");
        return Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3));
    }
}