
import java.util.*;

public class unicode {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 012_unicode 예제의 목표는
        // unicode를 출력해보고, 정수와 유니코드의 맵핑을 이해.
        // ------------------------------------------------------------------

        // for문이라는 제어문(반복문)을 통해 char의 범위 값인 
        // 0 ~ 65536 을 char형으로 직접 출력하여 확인.
        for(int i=0; i<65536; i++) {
            System.out.print(((char)i));
            System.out.print(" | "); // 구분을 위한 구분자 출력
        }
        return;
    }
}



