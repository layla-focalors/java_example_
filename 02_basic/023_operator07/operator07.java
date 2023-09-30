
import java.util.*;

public class operator07 {
    public static void main(String[] args) {

        // ------------------------------------------------------------------
        // 024_operator07 예제의 목표는 
        // 비트 연산 및 쉬프트 연산을 실행해본다.
        // ------------------------------------------------------------------
        
        // 비트 단위의 OR, AND, XOR 예제
        printBitCalcProcess(58962, 13589);
        System.out.printf("----------------------------------------------------------------------\n");

        // 비트 전환(반전) 예제 ( 1의 보수, 2의 보수 구하기)
        int target_number = 10; // 2의 보수로 -10 값이 나와야 한다.
        System.out.printf("[origin     ]: [%s][%d]\n",printBitOfNumber(target_number), target_number);
        System.out.printf("[1complement]: [%s][%d]\n",printBitOfNumber(~target_number), ~target_number);
        System.out.printf("[1bit       ]: [%s][%d]\n",printBitOfNumber(1), 1);
        System.out.printf("[2complement]: [%s][%d]\n",printBitOfNumber(~target_number+1), ~target_number+1);
        System.out.printf("----------------------------------------------------------------------\n");
  
        // 쉬프트 연산 예제
        int n1=8;
        System.out.printf("[origin]: [%s][%d]\n",printBitOfNumber(n1), n1);
        System.out.printf("[n1<<1 ]: [%s][%d]\n",printBitOfNumber(n1<<1), n1<<1);
        System.out.printf("[n1<<2 ]: [%s][%d]\n",printBitOfNumber(n1<<2), n1<<2);
        System.out.printf("[n1<<3 ]: [%s][%d]\n",printBitOfNumber(n1<<3), n1<<3);
        System.out.printf("----------------------------------------------------------------------\n");

        System.out.printf("[origin]: [%s][%d]\n",printBitOfNumber(n1), n1);
        System.out.printf("[n1>>1 ]: [%s][%d]\n",printBitOfNumber(n1>>1), n1>>1);
        System.out.printf("[n1>>2 ]: [%s][%d]\n",printBitOfNumber(n1>>2), n1>>2);
        System.out.printf("[n1>>3 ]: [%s][%d]\n",printBitOfNumber(n1>>3), n1>>3);
        System.out.printf("----------------------------------------------------------------------\n");

        int n2=-8;
        System.out.printf("[origin]: [%s][%d]\n",printBitOfNumber(n2), n2);
        System.out.printf("[n2>>1 ]: [%s][%d]\n",printBitOfNumber(n2>>1), n2>>1);
        System.out.printf("[n2>>2 ]: [%s][%d]\n",printBitOfNumber(n2>>2), n2>>2);
        System.out.printf("[n2>>3 ]: [%s][%d]\n",printBitOfNumber(n2>>3), n2>>3);
        System.out.printf("----------------------------------------------------------------------\n");
        return;
    }
    static String printBitOfNumber(int number) {
        return String.format("%32s", Integer.toBinaryString(number)).replace(" ", "0");
    }
    static void printBitCalcProcess(int number1, int number2) {
        System.out.println("[BEGIN]---");
        
        // 두 수를 비트 단위로 출력
        System.out.printf("NUMBER1 - %s(%05d)\n", String.format("%32s", Integer.toBinaryString(number1)).replace(" ", "0"), number1);
        System.out.printf("NUMBER2 - %s(%05d)\n", String.format("%32s", Integer.toBinaryString(number2)).replace(" ", "0"), number2);
        System.out.printf("----------------------------------------------------------------------\n");

        // 비트 단위의 OR, AND, XOR 연산을 수행하고 출력
        System.out.printf(" OR     - %s(%05d)\n", String.format("%32s", Integer.toBinaryString(number1|number2)).replace(" ", "0"), number1|number2);
        System.out.printf("AND     - %s(%05d)\n", String.format("%32s", Integer.toBinaryString(number1&number2)).replace(" ", "0"), number1&number2);
        System.out.printf("XOR     - %s(%05d)\n", String.format("%32s", Integer.toBinaryString(number1^number2)).replace(" ", "0"), number1^number2);
        System.out.println("[END]-----");
        return;
    }
    
}



