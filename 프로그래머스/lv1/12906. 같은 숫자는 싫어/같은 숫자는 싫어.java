import java.util.*;

class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int cnt = 0;

        for(int i=0;i<arr.length-1;i++) {
            if(arr[i] != arr[i+1])
                arr[++cnt] = arr[i + 1];
        }

        answer = new int[cnt+1];
        answer = Arrays.copyOf(arr, cnt+1);
        
        return answer;
    }
}