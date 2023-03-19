import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(test(input));
    }

    private static double test (String str){
        double point = 0;
        switch (str) {
            case "A+":
                point = 4.3;
                break;
            case "A0":
                point = 4.0;
                break;
            case "A-":
                point = 3.7;
                break;
            case "B+":
                point = 3.3;
                break;
            case "B0":
                point = 3.0;
                break;
            case "B-":
                point = 2.7;
                break;
            case "C+":
                point = 2.3;
                break;
            case "C0":
                point = 2.0;
                break;
            case "C-":
                point = 1.7;
                break;
            case "D+":
                point = 1.3;
                break;
            case "D0":
                point = 1.0;
                break;
            case "D-":
                point = 0.7;
                break;
            case "F":
                point = 0.0;
                break;
        }
        return point;
    }
}