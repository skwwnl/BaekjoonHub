import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arrNUm = new int[sc.nextInt()];

        // int 배열에 값 입력
        for (int i = 0; i < arrNUm.length; i++) {
            arrNUm[i] = sc.nextInt();
        }

        // 오름 차순 정렬
        for (int i = 0; i < arrNUm.length-1; i++) {
            int temp = 0;
            for (int j = i+1; j < arrNUm.length; j++) {
                if(arrNUm[j]<arrNUm[i]){
                    temp = arrNUm[i];
                    arrNUm[i] = arrNUm[j];
                    arrNUm[j] = temp;
                }
            }
        }

        for (int i = 0; i < arrNUm.length; i++) {
            System.out.println(arrNUm[i]);
        }
    }
}