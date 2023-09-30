
import java.util.*;

public class operator05 {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 022_operator05 예제의 목표는 
        // 문자열에 대해서 비교 연산을 실습해보고, 이어서 문자열의 내용을 비교하는 연산을 실습한다.
        // ------------------------------------------------------------------

        // 1. 서로 다른 방법으로 문자열 참조 변수 생성.
        String str1 = "java"; // str1이 문자열 상수("java")를 가르킴 -> "java"는 String Constatnt Pool에 저장
        String str2 = new String("java"); // str2는 String 인스턴스를 가리킴 -> new String("java")는 Heap 영역에 저장
        

        // 2. 문자열에서의 == 비교 연산자는 참조 값이 같은지 다른지를 비교
        System.out.printf("[\"java\" == \"java\"] => %b \n", "java" == "java"); // true
        System.out.printf("[str1 == \"java\"] => %b \n", str1 == "java"); // true
        
        System.out.printf("[str2 == \"java\"] => %b \n", str2 == "java"); // false
        System.out.printf("[str1 == str2] => %b \n", str1 == str2); // false
        // 20~21 : java 라는 문자열이 존재하는 위치 자체가 다르니, "java"과 new String("java")는 서로 다르다.

        // 3. equals 메서드를 이용한 문자열의 내용 비교
        System.out.printf("[str1.equals(\"java\")] => %b \n", str1.equals("java"));
        System.out.printf("[str1.equals(str2)] => %b \n", str1.equals(str2));
        System.out.printf("[str2.equals(\"java\")] => %b \n", str2.equals("java"));
        System.out.printf("[str2.equals(\"JAVA\")] => %b \n", str2.equals("JAVA"));
        System.out.printf("[str2.equalsIgnoreCase(\"JAVA\")] => %b \n", str2.equalsIgnoreCase("java"));

        // 4. 문자열 상수에서도 String 객체의 메서드를 사용할 수 있도록 컴파일 시 처리.
        System.out.println("[\"java\".equals(\"java\")] => " + "java".equals("java") ); 

        return;
    }
}



