
import java.util.*;

public class overflow {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 014_overflow 예제의 목표는 
        // 하나의 자료형의 최대값과 최소값을 넘어서는 연산을 수행하고, 그에 따른 값을 확인하여 오버플로우의 개념을 이해한다.
        // ------------------------------------------------------------------

        // 1. byte 자료형의 오버플로우 확인.

        // byte 변수의 값을 계속해서 누적합 함으로써 
        // byte 자료형이 가질 수 있는 값의 범위를 넘어설 경우 어떤 값을 갖는지 확인한다.
        System.out.println("byte --------------------------------------------------");
        
        byte overflow_exam_byte = 0; // byte 범위 : -128 ~ 127  
        
        // for문이라는 반복문을 이용하여 byte 값의 범위인 127 값이 초과되는 구간까지 누적합 진행
        for(int i=0;i<300;i++) { 
            overflow_exam_byte = (byte)(overflow_exam_byte + 1); //
            System.out.print(overflow_exam_byte + " | ");
        }
        
        // 2. 여러 자료형의 오버플로우 확인.

        // 각 자료형의 최솟값과 최댓값에서 1을 증가 혹은 감소시켜 오버플로우를 발생
        // short 2byte
        short short_min = -32768;
        short short_max = 32767; 
        // byte 1byte
        byte byte_min = -128;
        byte byte_max = 127;

        System.out.println("short_min : " + short_min);
        System.out.println("[overflow]short_min-1 : " + (short)(short_min-1));

        System.out.println("short_max : " + short_max);
        System.out.println("[overflow]short_max+1 : " + (short)(short_max+1));

        System.out.println("byte_min : " + (byte)byte_min);
        System.out.println("[overflow]byte_min-1 : " + (byte)(byte_min-1));

        System.out.println("byte_max : " + (byte)byte_max);
        System.out.println("[overflow]byte_max+1 : " + (byte)(byte_max+1));

        return;
    }
}



