public class Exam_05 {
    public static void main(String[] args) {
        // stack 구조
        // stack 메모리 구조에 저장되는 것 지역변수, = > 만들어졌다가 소멸 만들어졌다가 소멸   객체 참조값은 여기
        // keep 구조
        // keep 메모리 구조 new로 만든 여러가지 모든 객체들, 실제 데이터가 저장되는 곳       실제 객체의 데이터는 여기

        // ex) int[] arr = new int[5]; arr은 참조값 = stack , 실제 배열 데이터 keep에 저장

        int[][] myArr = {
                {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}
        };
        int[][] myArr1 = {
                {3, 4, 5, 44, 215}, {642, 237, 48, 59, 3109}, {171, 612, 713, 414, 115}
        };

        System.out.println("myArr");
        for(int i = 0 ;  i < myArr.length; i++){
            for (int j = 0 ; j < myArr[i].length; j ++){
                System.out.print(myArr[i][j]+" ");
            }
            System.out.println("\t");
        }
        System.out.println("myArr1");
        for(int i = 0 ;  i < myArr1.length; i++){
            for (int j = 0 ; j < myArr1[i].length; j ++){
                System.out.print(myArr1[i][j]+" ");
            }
            System.out.println("\t");
        }
        for(int i = 0; i < myArr.length; i++){
            System.out.print(i+1+"행의 합 : ");
            for (int j = 0; j <myArr[i].length; j++){
                System.out.print(myArr[i][j] + myArr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("두 배열 더하기");
        int[][] sum = new int[myArr.length][myArr[0].length];
        for(int i = 0 ;  i < myArr.length; i++){
            for (int j = 0 ; j < myArr[i].length; j ++){
                sum[i][j] = myArr[i][j] + myArr1[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println("\t");
        }

    }
}
