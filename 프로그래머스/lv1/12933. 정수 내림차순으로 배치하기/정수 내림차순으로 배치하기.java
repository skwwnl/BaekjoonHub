import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = Long.toString(n);

        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++)
            arr[i] = str.charAt(i) - '0';

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        String str2 = Arrays.toString(arr);
        str2 = str2.substring(1, str2.length() - 1).replace(", ", "");
        answer = Long.parseLong(str2);
//        System.out.println(Integer.parseInt(str2));
        return answer;
    }
}