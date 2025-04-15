import java.util.Scanner;

public class Exam_04 {
    public static void main(String[] args) {

        //int 배열이면 인덱스 하나당 4바이트 //double이면 인덱스 하나당 8바이트;

        //  int[] myArr = new int [5];
        //  int[] myArr = {1, 2, 3, 4, 5};
        //  int[] myArr = new int {11, 2, 3, 4, 5}
        // 다 같은 선언
        // 배열 선언
        // 전체 배열 표현 = 중괄호{}
        // String 객체 배열 {문자열 객체의 참조값 1, 문자열 객체의 참조값 2, 문자열 객체의 참조값 3}
        // 자바에서 모든 객체는 참조값으로 다뤄짐
        String[] myArr = new String[3];

        Scanner s = new Scanner(System.in);

        for(int i = 0 ; i < myArr.length; i++){
            myArr[i] = s.next();
        }
        for (int i = 0; i < myArr.length; i++){
            System.out.print(myArr[i]+"\t");
        }
        double[] gradeArr = {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7};
        double sum = 0.0;
        for(int i = 0 ; i < gradeArr.length; i++){
            sum += gradeArr[i];
        }
        System.out.println(sum/gradeArr.length);



    }
}
