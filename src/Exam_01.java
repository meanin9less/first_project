import java.sql.SQLOutput;
import java.util.Scanner;

public class Exam_01 {

    public static void main(String[] args) {

        Exam ex1 = new Exam();
        ex1.testDisplay();
        Exam.titleDisplay(); // 스태틱 메서드는 객체를 만들지 않아도 할 수 있음
//        Exam.testDisplay(); // 인스턴스 메서드는 이런식으로 만들 수 없음
        Scanner s1 = new Scanner(System.in);
        int len = s1.nextInt();
        for(int i = 0 ;  i < len ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            };
            for(int j = 0 ; j < (len*2)-1-(i*2); j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        for(int i = 0; i < len; i++){
//            for(int j = 0; j < i; j++){
//                System.out.print(" ");
//            }
//            for(int j = len-i; j > 0 ; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


    }
}
