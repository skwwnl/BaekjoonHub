import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int[] chessNum = new int[]{1, 1, 2, 2, 2, 8};
        int[] chessOut = new int[6];

        for (int i = 0; i < chessNum.length; i++) {
//            int chessInput = Integer.parseInt(br.readLine());
            int chessInput = sc.nextInt();
            if(chessNum[i]>chessInput){
                chessOut[i] = chessNum[i] - chessInput;
            } else if (chessNum[i]<chessInput) {
                chessOut[i] = chessNum[i] - chessInput;
            } else
                chessOut[i] = 0;
        }

        String str = "";
        for (int i = 0; i < chessNum.length; i++) {
            str += chessOut[i] + " ";
        }

        System.out.println(str);
    }
}
