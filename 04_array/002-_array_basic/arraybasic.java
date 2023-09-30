
import java.util.*;

public class arraybasic {
    public static void main(String[] args) {
        // 길이가 5(개)인 정수형 배열을 생성하고 이를 가르킬 참조변수 선언.
        // 국어
        int[] score1 = new int[5];
        // 영어
        int score2[] = new int[5];
        // 수학
        int[] score3;
        score3 = new int[5];
        // 외국어
        int[] score4 = new int[] {100,100,100,100,100};    
        try (Scanner sc = new Scanner(System.in)) {
            // 반복문을 통한 데이터 입력
            // 국어 점수 입력
            for(int i=0; i<5; i++) {
                System.out.print(i+1+"번째 학생의 국어 점수를 입력 >> ");
                score1[i] = sc.nextInt();
            }
            // 수학 점수 입력
            for(int i=0; i<5; i++) {
                System.out.print(i+1+"번째 학생의 수학 점수를 입력 >> ");
                score2[i] = sc.nextInt();
            }
            // 영어
            for(int i=0; i<5; i++) {
                System.out.print(i+1+"번째 학생의 영어 점수를 입력 >> ");
                score3[i] = sc.nextInt();
            }

        }

        System.out.println("--------------------------------------------------------------------");
        // 국어 점수 출력
        for(int i=0; i<score1.length; i++) {
            System.out.println(i+1+"번째 학생의 국어 점수를 출력 >> " + score1[i]);
        }
        // 수학 점수 출력
        for(int i=0; i<score2.length; i++) {
            System.out.println(i+1+"번째 학생의 수학 점수를 출력 >> " + score2[i]);
        }
        // 영어 점수 출력
        for(int i=0; i<score3.length; i++) {
            System.out.println(i+1+"번째 학생의 영어 점수를 출력 >> " + score3[i]);
        }
        // 외국어 점수 출력
        for(int i=0; i<score4.length; i++) {
            System.out.println(i+1+"번째 학생의 외국어 점수를 출력 >> " + score4[i]);
        }
    }
}