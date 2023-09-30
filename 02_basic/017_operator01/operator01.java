
import java.util.*;

public class operator01 {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 018_operator01 예제의 목표는 
        // 단항 연산자인 증감 연산자를 학습하고, 특성을 정확히 파악.
        // ------------------------------------------------------------------
        int num1 = 0;
        ++num1; // 전위형 증가
        System.out.println(num1);

        int num2 = 0;
        num2++; // 후위형 증가
        System.out.println(num2);

        System.out.println("++num1 : " + ++num1); // 우선 순위에 의해 바로 1증가
        System.out.println("num1 : " + num1);

        System.out.println("num2 : " + num2++); // 후위 증가 특성으로 인해 참조 후에 1증가.
        System.out.println("num2 : " + num2);

        // 최종적으로 출력되는 x의 값을 예측해 봄으로써 단항 연산의 전위/후위 증감 연산에 대한 이해 여부 확인
        int x = 5;
        x = x++ - ++x; 
        System.out.println(x);

        return;
    }
}



