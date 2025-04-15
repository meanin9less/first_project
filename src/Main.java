import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// 클래스앞에 퍼블릭이면 클래스랑 파일이름이 같아야함, 퍼블릭으로 정의된 클래스는 파일안에 반드시 하나여야함
// 클래스 앞에 들어올건 많음, 퍼블릭은 반드시 하나,
// 자바의 모든 소스파일의 확장자 .java
// 패키지 : 같은 성격의 클래스의 묶음
// 패키지명 소문자, 클래스명 대문자로 시작,
// public : 공용
// statc : 함수가 정적 메서드다 라고 명시
// void = 함수가 리턴값이 없는 함수다 라는 뜻 , 함수의 리턴 형태, 자료형 리턴 없으면 void 정수면 int, 문자면 string
public class Main { // 자바는 하나이상의 클래스로 구성되어있다. 파일하나에 클래스하나 (리액트에서 하나의 파일에 컴포넌트 하나 쓰는것 처럼)
public static void main(String[] args) {//  public static void main(String[] args) : 함수의 프로토타입 , 함수의 요약
//main : 메서드(함수) 매개변수 args는 string[] (문자열)이다 라고 명시 // main 프로그램 시작시 가장 먼저 호출되는 메서드
//System.out.println("Hello and welcome!"); // System은 클래스임(자바에 내장된 기본 라이브러리) 클래스 안에 소속된 out이라는 객체안의 println이라는 메서드 호출
//final int SPEED = 10;
//int count = 10;
//
//count = 11;
//System.out.print("상수 SPEED 값은 ");
//System.out.println(SPEED);
//System.out.print("상수 SPEED 값은 ");
//System.out.println(count);
//
//final double PI = 3.14;
//System.out.print("\"반지름 3인 \n원의 \t\\ 넓이\" ");
//System.out.println(3 * 3 * PI);

// 'A' char / "A" String  => 첫글자 대문자 === class임 즉 객체...
//String str = "A";
//이스케이프 문자 키보드에 없는 키를 표현
//  \b : 백스페이스

//int x = 10;
//double y = 3.0;
//System.out.println(x/y);
//System.out.println(x/(int)y);
//System.out.println((int)(x/y));
//System.out.println(x++);
//System.out.println(++x);
//System.out.println(x--);
//System.out.println(--x);
////형변환 자동형변환(암시적 형 변환)
//// 캐스팅 형 변환(명시적 형 변환)
//// 객체의 자료형은 객체를 만든 클래스 이름
//Scanner input = new Scanner(System.in);
//System.out.println("당신의 이름을 입력하세요.");
//String name = input.nextLine();
//System.out.println("당신의 이름 : " + name);
//
//Scanner s1 = new Scanner(System.in);
//System.out.println("정수 값 입력하기");
//int n = s1.nextInt();
//System.out.println(n);
//System.out.println("실수 값 입력하기");
//double db = s1.nextInt();
//System.out.println(db);
//System.out.println("당신의 아이큐");
//System.out.println(n+db);


    int count = 0;
    System.out.println("숫자를 입력하세요.");
    Scanner s1 = new Scanner(System.in);
    int max = s1.nextInt() ;
    int min = max ;
    for( int i = 0; i < 9 ; i ++){
        int input = s1.nextInt();
        if(input>max){
            max = input;
        }
        if(input<min){
            min = input;
        }
    }

//    while(count<10){
//        int input = s1.nextInt();
//        if(count == 0){
//            max = input;
//        }
//        if(count == 1 && max > input){
//            min = input;
//        }
//        if(input > max){
//            max = input;
//        }
//        if(input < min){
//            min = input;
//        }
//        count++;
//    }
    System.out.println("최대 값 : " + max);
    System.out.println("최소 값 : " + min);




}
}