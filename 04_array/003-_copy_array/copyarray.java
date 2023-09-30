
public class copyarray {
    public static void main(String[] args) {
        int[] score = new int[] {100, 90, 95, 100, 100}; // 외국어

        // 학생이 중간에 늘어남. -> 배열 확장 및 복사
        int [] extended_score = new int[score.length * 2];
        // 확장
        for(int i = 0; i < score.length; i ++){
            extended_score[i] = score[i];
        }
        // 복사
        
        System.out.println("--------------------------------------------------------------------");
        
        // 외국어 점수 출력
        for(int i=0; i<extended_score.length; i++) {
            System.out.println(i+1+"번째 학생의 외국어 점수를 출력 >> " + extended_score[i]);
        }
    }
}