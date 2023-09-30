public class method {
    // main 메서드에 static 키워드가 있는 경우, static이 없는 다른 메서드를 main에서 실행할 수 없다!
    public static void main(String[] args) {
        sub1();
        System.out.println(sub2());
        sub3(100, 0);
        System.out.println(sub4(200, 100));
        return;
    }
    // 매개변수 X , 반환 X
    public static void sub1(){
        System.out.println("no return method");
    }
    // 매개변수 X , 반환 O
    public static boolean sub2(){
        System.out.println("res");
        return true;
    }
    // 매개변수 O , 반환 X
    public static void sub3(int a, int b){
        System.out.println(a + b);
    }
    // 매개변수 O , 반환 O
    public static int sub4(int a, int b){
        return a + b;
    }
}
    