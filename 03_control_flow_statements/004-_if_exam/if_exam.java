import java.util.Scanner;

public class if_exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test1_score = 0, test2_score = 0, test3_score = 0, test4_score = 0;
        float test_score_average = 0.0f;

        System.out.print("test1 의 점수는? >> "); test1_score = sc.nextInt();
        System.out.print("test2 의 점수는? >> "); test2_score = sc.nextInt();
        System.out.print("test3 의 점수는? >> "); test3_score = sc.nextInt();
        System.out.print("test4 의 점수는? >> "); test4_score = sc.nextInt();

        test_score_average = (test1_score + test2_score + test3_score + test4_score) / 4.0f;
        System.out.println("당신의 평균 점수는? " + test_score_average);

        
        return;
    }
}
