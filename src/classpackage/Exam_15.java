package classpackage;

public class Exam_15 {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.breed = "똥개";
        obj.color = "흰색";
        System.out.println(obj.breed);
        System.out.println(obj.color);
        obj.bowwwow();
        obj.age = 10;
        System.out.println(obj.age);
        obj.run();
        obj.name = "흰둥이";
        System.out.println(obj.name);
        obj.sleep();
    }
}
