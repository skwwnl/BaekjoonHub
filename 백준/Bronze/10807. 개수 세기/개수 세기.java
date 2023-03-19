import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        int[] totalArray = new int[num];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < num; i++) {
            totalArray[i] = Integer.parseInt(st.nextToken());
        }
        
        int comNum = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < num; i++) {
            if(totalArray[i]==comNum){
                count++;
            }
        }
        System.out.println(count);
    }
}