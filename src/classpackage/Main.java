package classpackage;

import java.util.Scanner;

public class Main {
    static User[] users = new User[3];
    static User currentUser;
    static Scanner s = new Scanner(System.in);

    public static void intro(){
        while (true){
            System.out.println("1. 로그인");
            System.out.println("2. 종료");
            int onOff = s.nextInt();
            if(onOff!=1){
                if(onOff==2){
                    System.out.println("종료되었습니다.");
                    break;
                }else {
                    System.out.println("잘못 입력 하였습니다.");
                    continue;
                }
            }
            User currentUser = login();
            if(currentUser==null){
                continue;
            }
            start(currentUser);
        }
    }

    public static User login(){
        System.out.print("ID : ");
        String inputId = s.next();
        boolean isCollectId = false;
        boolean isCollectPw = false;
        for (int i = 0; i<users.length; i++){
            if(users[i].getId().equals(inputId)){
                isCollectId =true;
                System.out.print("PW : ");
                String inputPw = s.next();
                if(users[i].getPw().equals(inputPw)){
                    isCollectPw = true;
                    currentUser = users[i];
                    break;
                }
                break;
            }
        }
        if(!isCollectId){
            System.out.println("아이디를 잘못입력하였습니다.");
            return null;
        }
        if(!isCollectPw){
            System.out.println("비밀번호를 잘못입력하였습니다.");
            return null;
        }
        System.out.println("로그인 성공");
        return currentUser;
    }

    public static void start(User currentUser){
        while (true){
            boolean logout = false;

            printMenu();

            int selectedMenu = s.nextInt();
            switch (selectedMenu){
                case 1:
                    System.out.print("찾을 이름 : ");
                    String inputName = s.next();
                    searchContact(inputName);
                    break;
                case 2:
                    searchAllContact();
                    break;
                case 3:
                    System.out.println("PW : ");
                    String inputPw = s.next();
                    if(!currentUser.getPw().trim().equals(inputPw.trim())){
                        System.out.println("비밀번호를 잘 못 입력하였습니다.");
                        break;
                    }
                    System.out.println("전화번호 : ");
                    String inputContact = s.next();
                    System.out.println("주소 : ");
                    String inputAddress = s.next();
                    updateUserInfo(currentUser.getId(), inputContact, inputAddress);
                    break;
                case 4:
                    System.out.println("로그아웃");
                    logout = true;
                    break;
                default:
                    System.out.println("잘 못 입력하였습니다.");
                    break;
            }
            if(logout){
                break;
            }
        }
    }

    public static void printMenu(){
        System.out.println("<< 주소록 관리 >>");
        System.out.println("1. 주소록 검색");
        System.out.println("2. 전체 주소록 검색");
        System.out.println("3. 내정보 변경");
        System.out.println("4. 로그아웃");
    }

    public static void searchContact(String inputName){
        boolean isFind = false;
        for(int i = 0; i<users.length; i++){
            if(users[i].getName().trim().equals(inputName.trim())){
                System.out.println(users[i].getName()+"님의 전화번호 : "+users[i].getContact());
                System.out.println(users[i].getName()+"님의 주소 : "+users[i].getAddress());
                isFind = true;
            }
        }
        if(!isFind){
            System.out.println("이름을 찾을 수 없습니다.");
        }
    }

    public static void searchAllContact(){
        System.out.println("<<모든 연락처>>");
        for(int i = 0; i < users.length; i++){
            System.out.println(users[i].getName()+"님의 전화번호 : "+users[i].getContact());
            System.out.println(users[i].getName()+"님의 주소 : "+users[i].getAddress());
        }
        System.out.println("===================");
    }

    public static void updateUserInfo(String currentUser1Id, String inputContact, String inputAddress){
        for(int i = 0; i<users.length; i++){
            if(users[i].getId().trim().equals(currentUser1Id.trim())){
                users[i].setContact(inputContact);
                users[i].setAddress(inputAddress);
                break;
            }
        }
    }

    public static void main(String[] args) {
        users[0] = new User("aaa", "111", "김준홍1", "슬럼1", "1111");
        users[1] = new User("bbb", "222", "김준홍2", "슬럼2", "2222");
        users[2] = new User("ccc", "333", "김준홍3", "슬럼3", "3333");
        intro();
    }
}