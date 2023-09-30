
import java.util.*;

public class dim2array2 {
    public static void main(String[] args) {
        
        // 5팀이 게임을 진행하는데 각 팀의 내부 사정으로 게임에 참여 못하는 팀이 생김.
        // 그래서 팀의 전체 평균으로 평가하며, 이를 반영하여 배열 구성(가변 배열) 
        Scanner sc = new Scanner(System.in);

        int[][] team_score = new int[5][];
         // 7게임 모두 참여
         // 5게임 참여
         // 3게임 참여
         // 4게임 참여
         // 7게임 모두 참여

         // 각 팀의 점수 입력하기
        for(int i=0; i<team_score.length; i++) {
            for(int j=0; j<team_score[i].length; j++) {
                System.out.printf("%d팀의 %d번 째 게임 점수 입력 >> ",i+1, j+1);
                team_score[i][j] = sc.nextInt();
            }
        }

        // 각 팀의 합계 및 평균 구하기
        for(int i=0, sum=0; i<team_score.length; i++,sum=0) {
            for(int j=0; j<team_score[i].length; j++) {
                sum += team_score[i][j];
            }
            System.out.printf("%d팀은 %d 게임을 했으며, 합계는 %d 평균 값은 %f입니다.\n", i+1, team_score[i].length , sum, sum/(double)team_score[i].length);
        }
        return;
    }
}