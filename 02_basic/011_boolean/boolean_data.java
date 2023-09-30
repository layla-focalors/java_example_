
import java.util.*;

public class boolean_data {
    public static void main(String[] args) {

        // ------------------------------------------------------------------
        // 011_boolean 예제의 목표는
        // boolean 자료형에 대해 이해하고 실습한다.
        // ------------------------------------------------------------------

        // true와 false는 예약어로 그 자체로 값이다
        // true와 false는 문자열이 아닌 그 자체로 값을 뜻함.
        
        // boolean 변수에 true 혹은 false 값을 저장하고 출력.
        boolean true_bool_val = true;
        boolean false_bool_val = false;
        
        System.out.println(true_bool_val);
        System.out.println(false_bool_val);

        // door_status에 true 혹은 false 값을 대입하고
        boolean door_status = true;
        
        // if문 이라는 제어문을 이용하여 값을 비교하고, 
        // door_status 변수 속 값에 따라 출력.
        if(door_status == true) { 
            System.out.println("문이 열렸습니다.");
        } 
        if(door_status == false) {
            System.out.println("문이 닫혔습니다.");
        }

        return;
    }
}



