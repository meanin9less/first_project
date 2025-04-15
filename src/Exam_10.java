public class Exam_10 {
    public static void main(String[] args) {
        //String s1, s2 = new string("abc");//  같은게있어도 따로 만듦 s1, s2은 다른 참조값
        //String s3, s4 = "abc"; // 자바의 스트링풀에 저장(스트링상수풀) ==> 같은게 있으면 또 만들지 않음, 같은 참조값을 부여 s3, s4은 같은 참조값
        // 한번 만든건 고칠 수 없음 문자열 객체는 불변객체
        // if(s3==s4) ==> true;
        // if(s1==s1) ==> false;
        // 참조값이 다름
        // if(s1.equals(s2)) ==> true equals => 참조값이 아닌 데이터 비교하는 메서드를 이용하라고 권장함.

        String s = " Java Programming ";
        System.out.println(s.length());
        System.out.println(s.charAt(4));
        System.out.println(s.substring(6));
        System.out.println(s.substring(5, 13));
        System.out.println(s.indexOf('P'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        String s1 ="Java";
        String s2 = " Programming";
        String s3 = s1.concat(s2);
        String s4 = s.trim();

        System.out.println(s4.equals(s3));

        String a1 = "Java";
        String a2 = "Java";
        String a3 = new String("Java");
        String a4 = new String("Java");

        if(a1==a2){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        if(a1==a3){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        if(a1.equals(a3)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


    }
}
