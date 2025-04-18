package classpackage;

public class Child extends Parent{
    String name;
    public Child(String n1, String n2){
        super(n1);
        this.name = n2;
        System.out.println("자식이름 : " + this.name);
    }
}
