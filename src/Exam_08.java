import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam_08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("=======target number=========");
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        int[] target = new int[3];
        for(int i = 0; i<target.length; i++){
            target[i]=s.nextInt();
        }

        int count = 0;
        while (true){
            System.out.println("=======input number========");
            int[] input = {s.nextInt(), s.nextInt(), s.nextInt()};
            count++;
            int st = 0;
            int ball = 0;
            for(int i = 0; i < target.length; i++){
                for(int j = 0; j < target.length; j++){
                    if(target[i]==input[j]){
                        if(i==j){
                            st++;
                        }else {
                            ball++;
                        }
                    }
                }
            }
            if(st==0&&ball==0){
                System.out.println("out!");
                System.out.println("=======시도 횟수 : " + count + "회========");
                continue;
            }
            if(st!=3){
                System.out.println(st+"strike"+"\t"+(ball==0 ? "" : ball+"ball"));
                System.out.println("=======시도 횟수 : "+count+"회========");
                continue;
            }
            System.out.println(st+"strike!!!");
            System.out.println("=======시도 횟수 : "+count+"회========");
            break;
        }
    }
}
