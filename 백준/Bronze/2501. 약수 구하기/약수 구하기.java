import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K = sc.nextInt();

        ArrayList<Integer> saveList = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(N); i++) {
            if(N%i==0){
                saveList.add(i);
                if(N/i!=i)
                    saveList.add(N/i); // 중복 값 저장 안 함
            }
        }
        saveList.sort(Comparator.naturalOrder());
        if(saveList.size()<K)
            System.out.println(0);
        else
            System.out.println(saveList.get(K-1));
    }
}