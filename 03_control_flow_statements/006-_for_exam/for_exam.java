import java.util.Scanner;

public class for_exam {
    public static void main(String[] args) {
        
        // 1부터 100까지의 누적합 구하기
        int count = 0;
        // 후위연산이기 때문에 100까지 더하기!
        for(int i = 1; i <= 100; i ++){
            System.out.print(i);
            count += i;
        }
        System.out.println("count : " + count);
        // 5050 출력
        
        
        try (// 직각 삼각형 찍기
                /*
                5를 입력
                 *
                 **
                 ***
                 ****
                 *****
                
                 */
        Scanner sc = new Scanner(System.in)) {
            int counta = 0;
            counta = sc.nextInt();
            for(int i = 1; i <= counta; i++){
                for(int j = 0; j != i; j++){
                    System.out.print("*");
                }
                System.out.println("\n");
            }
        }
        return;
    }
}

