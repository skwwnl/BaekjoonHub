import java.util.Arrays;

class Solution {
    public String solution(String str) {
        String answer = "";
        
        char[] cha = str.toCharArray();
        int[] arr = new int[str.length()];

        for(int i=0; i<str.length();i++){
            arr[i] = (int)cha[i];
        }
        Arrays.sort(arr);
        for(int i=str.length()-1;i>=0;i--)
            answer += (char)arr[i];
        
        return answer;
    }
}