import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++){
            int[] arr1=Arrays.copyOfRange(array, commands[i][0]-1,commands[i][1]);
            Arrays.sort(arr1);
            answer[i]=arr1[commands[i][2]-1];
            Arrays.fill(arr1, 0);
        }
        return answer;
    }
}