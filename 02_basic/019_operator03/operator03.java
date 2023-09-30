
import java.util.*;

public class operator03 {
    public static void main(String[] args) {

        // ------------------------------------------------------------------
        // 020_operator03 예제의 목표는 
        // 산술 연산자들을 이해하고, 산술 연산과 변수와 자료형 간의 주요 문법들을 복습한다.
        // ------------------------------------------------------------------

        // 1. 기초 산술 연산
        int n1 = 100;
        int n2 = 15;

        System.out.printf("%d + %d = %d\n",n1, n2, n1+n2);
        System.out.printf("%d - %d = %d\n",n1, n2, n1-n2);
        System.out.printf("%d x %d = %d\n",n1, n2, n1*n2);
        System.out.printf("%d / %d = %d\n",n1, n2, n1/n2); // 정수 / 정수는 정수로 소수점 이하는 버려진다.
        System.out.printf("%d / %d = %f\n",n1, n2, n1/(float)n2); // n1은 정수에서 float으로 자동 형 변환 발생.
        System.out.printf("%d %% %d = %d\n",n1, n2, n1%n2);

        // 2. int 오버플로우로 인한 long 변환
        int n3 = 100_000_000;
        int n4 = 30;

        System.out.println(n3*n4); // 오버플로우 발생
        System.out.println((long)n3*n4); 
        // n3를 long 형으로 강제 형 변환하면 n4는 자동 형 변환 발생으로 오버플로우 없이 출력 

        // 3. char 문자형 연산과 형 변환
        char ch = 'A';
        char result_ch = (char)(ch + 32); 
        System.out.println("result_ch : " + result_ch);
        System.out.println((char)ch + (char)32); 
        // 각각을 char로 강제 형 변환하여 연산을 진행해도 int형으로 자동 형 변환 한다는 증거 : 값이 97로 정수로 뜨기 때문에

        // char result_ch = (char)ch + (char)32; 안 되는 이유는? 
        // char result_ch = ch + 32; 안 되는 이유는?
        // 정수형으로의 승격(integral) -> 013번 예시 참고

        char auto_calc_ch = 'A' + 32; 
        // 32번~40번 라인 예시와 달리 42번 라인이 가능한 이유  
        // 리터럴들의 연산이므로 컴파일러가 미리 그냥 계산해서 결과를 만들어버리고 형 변환 까지해서 런 타임에서는 그저 대입 연산만 진행.
        System.out.println("auto_calc_ch : " + auto_calc_ch);

        // 4. byte 형 연산과 형 변환
        byte ba = 10, bb = 20;
        byte bc = 10 + 20; // 컴파일 타임에 이미 모두 계산되고, 형 변환까지 적용하여 대입.
        
        //byte bd = 250 + 250; 
        // 오류 발생. 컴파일 타임에 모두 계산한다고 하더라도 그 계산 결과가 byte의 범위보다 크기 때문에.
        
        //byte be = (byte)ba + (byte)bb; 
        // 오류 발생. 변수의 덧셈 연산으로 컴파일 타임에 계산되지 않으므로, 각각 byte로 변환해도 덧셈 시 integer promotion 발생
        
        // byte bf = ba + bb; 
        // 오류 발생. 정수형으로 승격(integer promotion)된 우측항 값을 byte 자료형 변수에 대입하면서 오류 발생
        System.out.println(bc);

        // 5. float를 이용한 산술 연산 및 반올림
        // 소수점 아래 3가지 까지 구하기
        float pi = 3.141592f;
        float shortPi = (int) (pi * 1000) / 1000f; // 3141 / 1000.0; -> 결국엔 float 형으로 형 변환
        System.out.println(shortPi);

        // 수동 반올림 
        double dpi = 3.141592;
        double shortdPi = (int) (dpi * 1000 + 0.5) / 1000.0; // 3142 / 1000.0;
        System.out.println(shortdPi);

        // 자동 반올림
        shortdPi = Math.round(dpi*1000) / 1000.0;
        System.out.println(shortdPi);

        // 6. 나머지 연산
        // random 값을 얻기 위해서 Math.random() 사용.
        System.out.println(Math.random()); // double형으로 리턴 확인.
        System.out.println((int)(Math.random() * 10_000)); // 0 ~ 9999 사이의 값
        
        System.out.println(((int)(Math.random() * 10_000))%10);
        System.out.println(((int)(Math.random() * 10_000))%10);
        System.out.println(((int)(Math.random() * 10_000))%10);
        System.out.println(((int)(Math.random() * 10_000))%10);
        System.out.println(((int)(Math.random() * 10_000))%10);
        System.out.println(((int)(Math.random() * 10_000))%10);
        System.out.println(((int)(Math.random() * 10_000))%10);
        System.out.println(((int)(Math.random() * 10_000))%10);

        System.out.println(-10%4);
        System.out.println(-10%2);
        System.out.println(10%-3); // 부호는 왼쪽 피연산자에 따른다.
        System.out.println(10%2.0); // 의미X
        System.out.println(10%0); // Error
        
        return;

    }
}



