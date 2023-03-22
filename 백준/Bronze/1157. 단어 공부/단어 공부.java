import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String str = br.readLine();

        for (int i = 0; i < str.length(); i++) {

            if(65 <= str.charAt(i) && 90 >= str.charAt(i)){
                arr[str.charAt(i) - 65]++;
            } else
                arr[str.charAt(i) - 97]++;
        }

        int maxChar = 0;
        char ch = '?';

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxChar) {
                maxChar = arr[i];
                ch = (char)(i+65);
            }
            else if(arr[i] == maxChar){
                ch = '?';
            }
        }
        System.out.println(ch);
    }
}