public class Exam_03 {
    public static int sum(int a, int b) {
        return a+b;
    }
    public static double sum(int a, int b, double c) {
        return a+b+c;
    }
    public static double sum(double a, double b) {
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 5));
        System.out.println(sum(10, 5, 5));
        System.out.println(sum(10.0, 50.5));
    }
}
