package classpackage;

public class Cat {
    String name;
    String breed;
    String color;
    int full = 5;
    String[] feed = {"츄르", "생선뼈", "사료"};
    Cat(String pName, String pBreed, String pColor){
        this.name = pName;
        this.breed = pBreed;
        this.color = pColor;
    }
    void catInfo (){
        System.out.println(this.name);
        System.out.println(this.breed);
        System.out.println(this.color);
        System.out.println("허기짐 : "+(this.full < 3 ? "배고픔" : this.full < 7 ? "보통" : "배부름"));
    }
    void eat (){
        if(full>10){
            System.out.println("고양이는 배가 불러 더이상 먹지 않는다.");
            return;
        }
        System.out.println("고양이는 "+"를 먹었다!");
        this.full++;
        if(full>10){
            System.out.println("고양이는 배가 꽉 찼다!");
        }
    }
    void scratch(){
        if(full<1){
            System.out.println("고양이는 배가 고파 움직일 수 없다.");
            return;
        }
        System.out.println("고양이는 무언가를 할퀴기 시작했다!");
        full--;
    }
    void meow(){
        System.out.println("니야야아아아옹~");
    }
}
