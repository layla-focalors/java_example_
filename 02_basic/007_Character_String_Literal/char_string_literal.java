
public class char_string_literal {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 007_Character_String_Literal 예제의 목표는
        // 리터럴 상수 중 문자 리터럴과 문자열 리터럴에 대해 이해하고 실습한다.
        // ------------------------------------------------------------------
        
        // 다양한 문자 변수 선언
        char ch = 'A';
        char ch_16 = 0x0041; // A의 16진수 값
        // char ch_null = ''; // 문자로 빈 문자는 존재할 수 없다. -> Error
        char ch_space = ' '; // 공백은 빈 문자가 아니다.

        // 다양한 문자열 변수 선언
        String str = "ABCDE";
        String str_origin = new String("ABCDE"); // String은 참조형 자료형으로 new 연산자를 통해 초기화 할 수 있다.
        String str_ch = "A";
        String str_null = "";
        String str_space = " ";
        
        // 문자열과 문자의 호환
        // String single_quote = 'b'; // Error, 문자열을 저장하는 String 자료형에 문자를 저장할 수 없다.(작은따옴표)
        // char big_quote = "b";  // Error, 문자를 저장하는 char 자료형에 문자열을 저장할 수 없다.(큰따옴표)

        // 출력
        System.out.println("ch : " + ch);
        System.out.println("ch_16 : " + ch_16);
        System.out.println("ch_space : " + ch_space);
        System.out.println("str : " + str);
        System.out.println("str_origin : " + str_origin);
        System.out.println("str_ch : " + str_ch);
        System.out.println("str_null : " + str_null);
        System.out.println("str_space : " + str_space);

        // 문자 리터럴과 문자열 리터럴의 + 연산
        char ch_operand = '1'; // 31
        String str_operand = "Hi ";

        System.out.println(ch_operand + ch_operand); // 31 + 31 => 62 으로 정수형으로 변환하여 계산 됨.
        System.out.println((char)(ch_operand + ch_operand));// 문자도 정수형이므로 int로 변환되어 정수의 덧셈이 이루어짐
        System.out.println(str_operand + str_operand); // 문자열에서의 + 연산은 문자열 결합이 이루어짐

        // + 연산은 피연산자가 "모두 숫자"일 경우 "덧셈" 연산을, 
        // + 연산은 피연산자가 "하나라도 문자열"일 경우 "문자열 결합" 연산을.
        return;
    }
}
