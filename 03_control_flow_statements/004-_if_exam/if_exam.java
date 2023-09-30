import java.util.Scanner;

public class if_exam {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int test1_score = 0, test2_score = 0, test3_score = 0, test4_score = 0;
            float test_score_average = 0.0f;

            System.out.print("test1 의 점수는? >> "); test1_score = sc.nextInt();
            System.out.print("test2 의 점수는? >> "); test2_score = sc.nextInt();
            System.out.print("test3 의 점수는? >> "); test3_score = sc.nextInt();
            System.out.print("test4 의 점수는? >> "); test4_score = sc.nextInt();

            test_score_average = (test1_score + test2_score + test3_score + test4_score) / 4.0f;
            // 40f는 리터럴 함수로 실수값을 저장한다
            System.out.println("당신의 평균 점수는? " + test_score_average);
            if(test_score_average >= 90){
                System.out.println("A");
            }else if(test_score_average >= 80){
                System.out.println("B");
            }else if(test_score_average >= 70){
                System.out.println("C");
            }else if(test_score_average >= 60){
                System.out.println("D");
            }else if(test_score_average >= 50){
                System.out.println("E");
            }else{
                System.out.println("F");
            }
        }
        return;
    }
}
