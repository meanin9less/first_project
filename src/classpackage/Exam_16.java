package classpackage;

public class Exam_16 {
    //extends, implements
    // extends는 isA관계일때만 상속, implements는 interface상속할때
    // has-A관계   소유의 관계

    // 컴파일타임 다형성 : 컴파일하면서 달라짐 (오버로딩)
    // 런타임 다형성 : 컴파일할땐 모르고 실행하면서 달라짐 (오버라이딩)

    // 업캐스팅을 하면 부모의 변수나 함수만 접근 할 수 있음, 오버라이딩 된건 적용됨.
    public static void main(String[] args) {
        SubKitten kitten = new SubKitten();
        kitten.printDetail();
        Child child = new Child("홍길순", "홍길동");

        Exam_16.printAnimalSound(new SuperCat());
        Exam_16.printAnimalSound(new Pig());
    }
    public static void printAnimalSound(Animal animal){
        animal.animalSound();
    }
}