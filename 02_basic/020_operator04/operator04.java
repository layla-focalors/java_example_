
import java.util.*;

public class operator04 {
    public static void main(String[] args) {

        // ------------------------------------------------------------------
        // 021_operator04 예제의 목표는 
        // 비교 연산을 통해 발생하는 boolean 타입을 출력해보고 실습.
        // ------------------------------------------------------------------

        // 1. 비교 연산1
        System.out.printf("[10 == 10.0f] => %b \n", 10 == 10.0f); // true, 10이 int -> float로 자동 형 변환
        System.out.printf("['0' == 0] => %b \n", '0' == 0); // false,  '0'이 char -> int로 자동 형 변환
        System.out.printf("['A' == 65] => %b \n", 'A' == 65); // true, 'A'가 char -> int로 자동 형 변환
        System.out.printf("['A' > 'B'] => %b \n", 'A' > 'B'); // false, 'A', 'B'가 char -> int로 자동 형 변환
        System.out.printf("['A'+1 != 'B'] => %b \n", 'A'+1 != 'B'); // false, 'A', 'B'가 char -> int로 자동 형 변환
        // Comparing identical expressions -> IDE 曰 : 뻔한걸 왜 확인하려는건지 모르겠다

        System.out.printf("--------------------------------------------------------\n");

        // 2. 비교 연산2
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f; 
        
        System.out.printf("[10.0 == 10.0f] => %b\n", 10.0 == 10.0f); // true, 정수 부는 상관 X
        System.out.printf("[0.1 == 0.1f] => %b\n", 0.1 == 0.1f); 
        // false, 정밀도 차이와 근사값 저장으로 인하여 자동 형 변환하더라도 정확하게 동일하지 않다.
        System.out.printf("[f = %19.17f]\n", f); // 정밀도 이상의 범위에서는 정확한 값이 저장되지 않음.
        System.out.printf("[d = %19.17f]\n", d);
        System.out.printf("[d2 = %19.17f]\n", d2);
        System.out.printf("[d==f] => %b\n", d==f); 
        // false, f가 double형으로 자동 형 변환하면서 float의 정밀도 이상의 범위의 값이 표현되면서 
        // double형 범위에서 정확히 0.1 값인 d와 0.10000000149011612 값인 f는 서로 다름.
        System.out.printf("[d==d2] => %b\n", d==d2); // false 
        System.out.printf("[d2==f] => %b\n", d2==f); // true
        System.out.printf("[(float)d==f] => %b\n", (float)d==f); // true

        return;

    }
}



