
public class suffix {
    public static void main(String[] args) {

        // ------------------------------------------------------------------
        // 006_suffix 예제의 목표는
        // 리터럴 상수의 타입을 표현하는 접미사에 대한 이해 및 실습.
        // + 대입 연산자의 왼쪽과 오른쪽 타입은 서로 동일해야 한다.
        // ------------------------------------------------------------------

        // 선언된 변수의 타입에 맞춰 리터럴 상수의 타입 또한 접미사를 통해 맞춰서 대입
        // 중요) 대입 연산자를 기준으로 왼쪽과 오른쪽의 타입은 서로 동일해야 한다.
        final float PI = 3.14f; 
        final int everest = 8849; 
        long long_number = 12301230021l;
        short my_money = 10_000; 
        
        System.out.println(PI);
        System.out.println(everest);
        System.out.println(long_number);
        System.out.println(my_money);

        return;
    }
}