
import java.util.*;

public class needarray {
    public static void main(String[] args) {
        // 5명의 국영수 성적을 관리하는 프로그램

        int input_number = 0;
        Scanner sc = new Scanner(System.in);

        int score1_student1, score2_student1, score3_student1;
        int score1_student2, score2_student2, score3_student2;
        int score1_student3, score2_student3, score3_student3;
        int score1_student4, score2_student4, score3_student4;
        int score1_student5, score2_student5, score3_student5;

        // 5명의 국영수 입력
        
        System.out.print("1 학생의 국어 점수 입력 >> "); score1_student1 = sc.nextInt();
        System.out.print("2 학생의 국어 점수 입력 >> "); score1_student2 = sc.nextInt();
        System.out.print("3 학생의 국어 점수 입력 >> "); score1_student3 = sc.nextInt();
        System.out.print("4 학생의 국어 점수 입력 >> "); score1_student4 = sc.nextInt();
        System.out.print("5 학생의 국어 점수 입력 >> "); score1_student5 = sc.nextInt();

        System.out.print("1 학생의 영어 점수 입력 >> "); score3_student1 = sc.nextInt();
        System.out.print("2 학생의 영어 점수 입력 >> "); score3_student2 = sc.nextInt();
        System.out.print("3 학생의 영어 점수 입력 >> "); score3_student3 = sc.nextInt();
        System.out.print("4 학생의 영어 점수 입력 >> "); score3_student4 = sc.nextInt();
        System.out.print("5 학생의 영어 점수 입력 >> "); score3_student5 = sc.nextInt();

        System.out.print("1 학생의 수학 점수 입력 >> "); score2_student1 = sc.nextInt();
        System.out.print("2 학생의 수학 점수 입력 >> "); score2_student2 = sc.nextInt();
        System.out.print("3 학생의 수학 점수 입력 >> "); score2_student3 = sc.nextInt();
        System.out.print("4 학생의 수학 점수 입력 >> "); score2_student4 = sc.nextInt();
        System.out.print("5 학생의 수학 점수 입력 >> "); score2_student5 = sc.nextInt();


        // 5명의 국영수 점수 출력

        System.out.print("1 학생의 국어 점수 출력 >> " + score1_student1 + '\n'); 
        System.out.print("2 학생의 국어 점수 출력 >> " + score1_student2 + '\n');
        System.out.print("3 학생의 국어 점수 출력 >> " + score1_student3 + '\n');
        System.out.print("4 학생의 국어 점수 출력 >> " + score1_student4 + '\n');
        System.out.print("5 학생의 국어 점수 출력 >> " + score1_student5 + '\n');

        System.out.print("1 학생의 영어 점수 출력 >> " + score3_student1 + '\n');
        System.out.print("2 학생의 영어 점수 출력 >> " + score3_student2 + '\n');
        System.out.print("3 학생의 영어 점수 출력 >> " + score3_student3 + '\n');
        System.out.print("4 학생의 영어 점수 출력 >> " + score3_student4 + '\n');
        System.out.print("5 학생의 영어 점수 출력 >> " + score3_student5 + '\n');

        System.out.print("1 학생의 수학 점수 출력 >> " + score2_student1 + '\n');
        System.out.print("2 학생의 수학 점수 출력 >> " + score2_student2 + '\n');
        System.out.print("3 학생의 수학 점수 출력 >> " + score2_student3 + '\n');
        System.out.print("4 학생의 수학 점수 출력 >> " + score2_student4 + '\n');
        System.out.print("5 학생의 수학 점수 출력 >> " + score2_student5 + '\n');

        // 반복문 이용이 가능한가?
        for(int i=0; i<5; i++) { // 국어 출력
            // System.out.printf("%d 학생의 국어 점수 출력 : %d \n",i+1,score1_student+(i+1)); 
        }
        return;
    }
}