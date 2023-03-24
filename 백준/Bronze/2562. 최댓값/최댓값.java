import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            arr.add(sc.nextInt());
        }

        int maxNum = 0;
        int findNum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i) > maxNum) {
                maxNum = arr.get(i);
                findNum = i+1;
            }
        }

        System.out.println(maxNum + "\n" + findNum);
    }
}
