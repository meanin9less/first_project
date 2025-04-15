import java.util.Scanner;

public class Exam_06 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("행 열 수를 입력");
        int[][] index = new int[s.nextInt()][s.nextInt()];

        for (int i = 0; i < index.length - 1; i++) {
            for (int j = 0; j < index[i].length - 1; j++) {
                index[i][j] = s.nextInt();
                index[i][index[i].length - 1] += index[i][j];
                index[index.length - 1][j] += index[i][j];
                index[index.length - 1][index[i].length - 1] += index[i][j];
            }
        }

        for (int i = 0; i < index.length; i++) {
            for (int j = 0; j < index[i].length; j++) {
                System.out.print(index[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
