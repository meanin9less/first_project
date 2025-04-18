package classpackage;

public class SubKitten extends SuperCat {
    String name;
    public void printInfo(){
        System.out.println("아기고양이입니다.");
    }
    public void printDetail(){
        super.printInfo();
        this.printInfo();
        super.name = "SuperCat";
        this.name = "SubKitten";
    }
}