
public class precision {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 004_precision 예제의 목표는
        // 실수 값을 저장하고 출력하는 실습을 진행하며, 정밀도가 어떤 역할을 하는지 파악한다.
        // ------------------------------------------------------------------

        // 실수형 변수 선언 및 초기화
        float float_sum = 0.0f;

        // for 구문이라는 제어문을 통해서 
        for(int loop=0; loop<100; loop++) { // 0부터 100 미만인 99번까지 총 100번 반복하는데
            float_sum = float_sum + 0.1f; // 0.1을 100번 더한다 ( = 0.1의 100번 누적합)
        }
        System.out.println(float_sum);

        // 정밀도의 역할을 파악한다.
        float float_precision = 12.123456789f; 
        System.out.println(float_precision); // float의 정밀도는 6자리 ~ 7자리

        double double_precision = 12.12345678987654321d;
        System.out.println(double_precision); // double의 정밀도는 15자리 ~ 16자리

        return;
    }
}