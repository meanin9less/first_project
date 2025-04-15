import java.util.Scanner;

public class Exam_07answer {
    public static void main(String[] args) {
        int[][] arr = new int[4][4];
        int rows = arr.length;
        int cols = arr[0].length;

        Scanner input = new Scanner(System.in);
        for (int i=0; i<rows-1; i++){
            for(int j = 0; j < cols-1; j++){
                arr[i][j] = input.nextInt();
            }
        }

        for(int i=0; i<rows-1; i++){
            for(int j=0; j<cols-1; j++){
                arr[i][cols-1] += arr[i][j];
                arr[rows-1][j] += arr[i][j];
                arr[rows-1][cols-1] += arr[i][j];
            }
        }

        for(int i=0; i<rows-1; i++){
        System.out.print(i + "행 합계 : " + arr[i][cols-1]+" ");
        }
        System.out.println();



        for(int i=0; i<cols-1; i++){
            System.out.print(i + "열 합계 : " + arr[rows-1][i]+" ");
        }
        System.out.println();
        System.out.println("전체 합계 : " + arr[rows-1][cols-1]);

    }
}
