package classpackage;

import java.util.Scanner;

public class Exam_11 {
    //interface > 껍질만 제공; 안에 모든 것이 추상메서드
    // interface를 상속받을때는 implements 로 받아야함 extends x
    // class에 생성자가 없으면 default 생성자가 생김
    // 기본생성자 = 매개변수가 없는 생성자가 아님
    // 컴파일러가 자동으로 생성해주는 생성자
    // 외부에서 전달받지 않는 . void 생성자
    // 데이터중심 attribute , 기능중심 control class
    public static void main(String[] args) {
//        Exam_12.myMethod1();
//        Exam_12 myObj = new Exam_12();
//        myObj.myMethod2();
        Scanner s = new Scanner(System.in);
        System.out.println("\t\t고양이 키우기");
        for (int i = 0; i < 3; i++){
            System.out.println();
        }
        System.out.println("시작하려면 아무키나 누르세요");
        String start = s.next();
        System.out.println("고양이의 이름? ");
        String inputName = s.next();
        System.out.println(inputName+"의 품종은? ");
        String inputBreed = s.next();
        System.out.println(inputName+"의 털은 무슨 색? : ");
        String inputColor = s.next();
        System.out.println("고양이를 빚어내는 중..");
        Cat c1 = new Cat(inputName, inputBreed, inputColor);

        while (true){
            boolean exit = false;
            System.out.println("===========");
            c1.catInfo();
            System.out.println("===========");
            System.out.println("무엇을 할까?");
            System.out.print("1. 밥먹기?\t");
            System.out.print("2. 할퀴기?\t");
            System.out.print("3. 노래하기?\t");
            System.out.print("4. 그만하기?\t");
            System.out.println();
            int act = s.nextInt();
            switch (act){
                case 1:
                    System.out.println("뭐 먹을까?");
                    c1.eat();
                break;
                case 2:
                    c1.scratch();
                    break;
                case 3:
                    c1.meow();
                    break;
                case 4:
                    System.out.println("정말로 그만? Y | N");
                    if(s.next().trim().equals("Y")){
                        exit = true;
                    }
                    break;
            }
            if(exit){
                System.out.println("잘가..");
                break;
            }
        }
    }
}
