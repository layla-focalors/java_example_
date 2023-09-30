
public class constant {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 005_constant 예제의 목표는
        // 심볼릭 상수 및 리터럴 상수 대해 이해하며, final 키워드 및 그 특성을 이해하고 실습.
        // ------------------------------------------------------------------
        
        // final 키워드를 이용한 심볼릭 상수의 선언 및 초기화 
        // final 키워드는 상수를 만드는 키워드이고, 딱 1번 초기화 가능하다.
        
        final int MAX_NUMBER = 100; // 100은 리터럴 상수이며 상수 또한 메모리에 할당.
        final int MIN_NUMBER; 
        MIN_NUMBER = 1; // 선언 이후 딱 1번 초기화 가능.
        
        // MAX_NUMBER = 10; // 변수의 선언과 동시에 초기화를 했으므로 값의 변경 불가 -> Error
        // MIN_NUMBER = 2; // 이미 초기화가 되었으므로 값의 변경 불가 -> Error

        System.out.println(MAX_NUMBER);
        System.out.println(MIN_NUMBER);
        return;
    }
}