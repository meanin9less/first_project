package classpackage;

public class Exam_14 {
    String name;
    String country;
    int age;

    public Exam_14() {
        this("홍길순");
    }

    public Exam_14(String pName) {
        this(pName, 20);
    }

    public Exam_14(String pName, int pAge) {
        this(pName, pAge, "대한민국");
    }

    public Exam_14(String pName, int pAge, String pCountry) {
        this.name = pName;
        this.age = pAge;
        this.country = pCountry;
    }

    void printInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("국적 : " + this.country);
        System.out.println("나이 : " + this.age);
    }
}
