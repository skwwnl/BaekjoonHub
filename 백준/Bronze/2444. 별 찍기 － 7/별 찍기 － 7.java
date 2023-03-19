import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i <num ; i++) {
            for (int j = num - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < 1 + i*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < num-1 ; i++) {
            for (int j = 0; j < i + 1 ; j++) {
                System.out.print(" ");
            }
            for (int j = num*2 -1 ; j > 2+ i*2; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
