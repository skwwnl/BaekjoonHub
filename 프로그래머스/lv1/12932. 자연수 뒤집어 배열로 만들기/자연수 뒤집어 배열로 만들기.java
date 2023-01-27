class Solution {
    public int[] solution(long num) {
        String str = "" + num;
        int[] answer = new int[str.length()];
        int count = 0;

        while(num>0){
            answer[count] = (int)(num % 10);
            num /= 10;
            count++;
        }
        return answer;
    }
}