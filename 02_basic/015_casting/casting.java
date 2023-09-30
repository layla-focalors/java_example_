
import java.util.*;

public class casting {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 016_casting_1 예제의 목표는 
        // 변수를 강제로 형 변환했을 때, 비트 단위로 살펴보고, 값의 손실이 발생하는지 확인하며,
        // 자료형의 변환 방향에 따라 손실 여부 또한 확인한다.
        // ------------------------------------------------------------------

        // 1. byte 표현 범위를 넘어서는 int -> byte
        int before_1 = 257;
        System.out.println(Integer.toBinaryString(before_1));
        System.out.println(Integer.toBinaryString((byte)before_1)); // 하위 8개 비트만 남기 때문에.
        System.out.println("--------------------------------------------------------------");

        // 2. 음의 부호가 있는 byte -> int
        byte before_2 = -2;
        System.out.println((byte)before_2);
        System.out.println((int)before_2);
        System.out.println("--------------------------------------------------------------");

        // 3. float -> double
        float before_3 = 1.1111f;
        System.out.println((float)before_3); // 범위가 작은 실수 타입인 float에서 
        System.out.println((double)before_3); // 범위가 큰 실수 타입인 double로 변경하므로 문제 X
        System.out.println("--------------------------------------------------------------");
        
        // 4. double -> float
        double before_4 = 1.111111111111111111111;
        System.out.println(before_4); // 범위가 큰 실수 타입인 double에서
        System.out.println((float)before_4); // 범위가 작은 실수 타입인 float로 변환하면서 넓은 범위 부분은 버려지면서 반올림 발생
        System.out.println("--------------------------------------------------------------");

        // 5. 넓은 범위인 double형이고, float의 범위를 넘어서는 큰 값의 실수 -> 실수(float)
        double before_5 = 1.0e100; // float의 최대값을 넘어 버리는 값을 저장하고
        System.out.println(before_5);
        System.out.println((float)before_5); // float로 형 변환하면 무한대 -> 형 변환을 해도 float의 범위를 넘어서기 때문에
        System.out.println("--------------------------------------------------------------");

        // 6. 넓은 범위인 double형이고, float의 범위를 넘어서는 작은 값의 실수 -> 실수(float)
        double before_6 = 1.0e-50; // float의 최대값을 넘어 버리는 값을 저장하고
        System.out.println(before_6);
        System.out.println((float)before_6); // float로 형 변환하면 0.0 -> 형 변환을 해도 float의 범위를 넘어서기 때문에
        System.out.println("--------------------------------------------------------------");

        // 7. 정수 -> 실수(float, double)
        int before_7 = 10000000;
        System.out.println(before_7);
        // 어떤 실수형이라도 정수형보다는 늘 값의 표현 범위가 넓기 때문에 손실 발생 X
        System.out.println((float)before_7);
        System.out.println((double)before_7);
        System.out.println("--------------------------------------------------------------");

        // 8. 실수(float) -> 정수
        float before_8 = 100.12345f;
        System.out.println(before_8);
        System.out.println((int)before_8); 
        // 어떤 실수형이라도 정수형보다는 늘 값의 표현 범위가 넓기 때문에 손실 발생 -> 소수점 아래가 손실
        System.out.println("--------------------------------------------------------------");

        // 9. 실수(double) -> 정수
        double before_9 = 100.123456789012;
        System.out.println(before_9);
        System.out.println((int)before_9);
        // 어떤 실수형이라도 정수형보다는 늘 값의 표현 범위가 넓기 때문에 손실 발생 -> 소수점 아래가 손실
        System.out.println("--------------------------------------------------------------");

        return;
    }
}



