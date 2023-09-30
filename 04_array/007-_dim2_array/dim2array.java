
public class dim2array {
    public static void main(String[] args) {

        // 5팀이 7경기를 진행하면서 다음과 같이 점수를 획득
        // 1팀 : 10, 9, 10, 5, 8, 4, 7
        // 2팀 : 5, 9, 5, 5, 10, 6, 1
        // 3팀 : 8, 7, 4, 3, 8, 10, 5
        // 4팀 : 1, 9, 8, 5, 3, 9, 3
        // 5팀 : 3, 10, 10, 7, 9, 10, 10

        // 행과 열의 길이는 생략해도 ok!
        int[][] team_score = new int[][]{
            {10, 9, 10, 5, 8, 4, 7},
            {5, 9, 5, 5, 10, 6, 1},
            {8, 7, 4, 3, 8, 10, 5},
            {1, 9, 8, 5, 3, 9, 3},
            {3, 10, 10, 7, 9, 10, 10}
        };
        // 각 팀의 합계 및 평균 구하기
        for(int i = 0, sum = 0; i < team_score.length; i++, sum = 0){
            for(int j=0; j < team_score[0].length; j++){
                sum += team_score[i][j];
            }
            System.out.printf("%d팀의 합계는 %d 이며, 평균 값은 %f 입니다.\n", i + 1, sum, (double)sum / 7);
        }

        return;
    }
}