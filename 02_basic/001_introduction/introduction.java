
public class introduction {
    public static void main(String[] args) {

        // ------------------------------------------------------------------
        // 001_introduction 예제의 목표는
        // 1. 변수 선언 및 초기화에 대한 실습. 
        // 2. 변수를 활용한 간단한 연산 및 출력 실습.
        // ------------------------------------------------------------------
        
        // * 다양한 자료형의 변수들의 선언 및 대입 연산자를 이용한 초기화
        String name;
        int tall, weight; // 컴마 연산자를 이용하여 여러 변수를 선언.
        int age = 21, face_age = age + 10; // 여럿 변수를 선언과 동시에 초기화.
        float bmi_value;

        // 대입 연산자 : 오른쪽에 있는 값이 왼쪽의 변수로 대입된다 ( ← )
        name = "김철수";
        tall = 173;
        weight = 70;

        // * 변수를 활용한 간단한 연산 - BMI 지수 구하기
        // 몸무게(kg) ÷ (신장(m) × 신장(m))
        bmi_value = (float)weight / (float)(tall * tall); // 실수(소수)로 계산하기 위해 (float)을 붙입니다.

        // * 변수들의 값을 출력
        System.out.println(name);
        System.out.println(age);
        System.out.println(face_age);
        System.out.println(tall);
        System.out.println(weight);
        System.out.println(bmi_value);

        return;
    }
}