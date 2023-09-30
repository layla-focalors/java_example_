import java.util.Scanner;

public class dowhile {
    public static void main(String[] args) {
        
        int odd_sum = 0, input_number = 0;
        try (Scanner sc = new Scanner(System.in)) {
            do { // 일단 반복 내용을 실행하고, 
                odd_sum += input_number;
                System.out.print("홀수 입력 (짝수나 0 입력 시 종료) >> ");
                input_number = sc.nextInt();
            } while(input_number%2==1); // 조건을 검사한다.
        }

        System.out.println("odd_sum의 값은 " + odd_sum);
        return;
    }
}


