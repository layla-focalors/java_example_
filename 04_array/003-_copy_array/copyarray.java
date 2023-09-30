
import java.util.*;

public class copyarray {
    public static void main(String[] args) {
        int[] score = new int[] {100, 90, 95, 100, 100}; // 외국어
        Scanner sc = new Scanner(System.in);

        // 반복문을 통한 데이터 입력
        // 외국어 점수 입력
        for(int i=0; i<score.length; i++) {
            System.out.print(i+1+"번째 학생의 외국어 점수를 입력 >> ");
            score[i] = sc.nextInt();
        }

        // 학생이 중간에 늘어남. -> 배열 확장 및 복사
        // 확장
        // 복사
        
        System.out.println("--------------------------------------------------------------------");
        
        // 외국어 점수 출력
        for(int i=0; i<extended_score.length; i++) {
            System.out.println(i+1+"번째 학생의 외국어 점수를 출력 >> " + extended_score[i]);
        }
    }
}