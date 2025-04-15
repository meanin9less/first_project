import java.util.Scanner;

public class Exam_09answer {
    public static void main(String[] args) {
        int[] correct = new int[3];
        int[] answer = new int[3];
        Scanner input = new Scanner(System.in);

        int count = 0;
        while(true){
            int num = (int)(Math.random()*9)+1;
            boolean flag = false;
            for(int i = 0; i < count; i++){
                if(correct[i]==num){
                    flag = true;
                    break;
                }
            }
            if(flag){
                continue;
            }
            correct[count++] = num;
            if(count==3){
                break;
            }
        }

        int answerCount = 0;

        while (true){
            int strike = 0;
            int ball = 0;
            System.out.println("정답시도");
            for(int i=0; i<answer.length; i++){
                answer[i] = input.nextInt();
            }
            answerCount++;
            boolean flag = false;
            for(int i=0; i<correct.length; i++){
                for(int j=0; j < answer.length; j++){
                    if(correct[i]==answer[j]){
                        flag = true;
                        if(i==j){
                            strike++;
                        }else {
                            ball++;
                        }
                        break;
                    }
                }
            }
            if(!flag){
                System.out.println("Out!");
            }else {
                System.out.println((strike==0 ? "" : strike+"스트라이크") + (ball == 0 ? "" : ball+"볼"));
            }
            if(strike == 3){
                break;
            }
        }
        System.out.println(answerCount+"번 만에 정답을 맞췄습니다.");
    }
}
