import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // -1을 입력할 때 까지 계속해서 합을 누적하는 예제.
        int input_numbera = 0, sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            while(true){
                System.out.print("합할 정수 입력 >> ");
                input_numbera = sc.nextInt();
                if(input_numbera == -1){
                    break;
                }else {
                    sum += input_numbera;
                }
            }
            System.out.printf("정수의 누적합은 %d 입니다.\n", sum);
            
            // 메뉴 입출력 예제.
            
            int input_number = 0;
            boolean loop_flag = true;
            while(loop_flag) {
                System.out.println("메뉴 -------- ");
                System.out.println("1. 주소록 생성 ");
                System.out.println("2. 주소록 조회 ");
                System.out.println("3. 주소록 삭제");
                System.out.println("4. 주소록 전체 출력");
                System.out.println("5. 종료");
                System.out.print("입력 >> ");
                input_number = sc.nextInt();

                switch(input_number) {
                    case 1:
                        System.out.println("주소록 생성 모듈을 실행합니다.");
                        break;
                    case 2:
                        System.out.println("주소록 조회 모듈을 실행합니다.");
                        break;
                    case 3:
                        System.out.println("주소록 삭제 모듈을 실행합니다.");
                        break;
                    case 4:
                        System.out.println("주소록 전체 출력 모듈을 실행합니다.");
                        break;
                    case 5:
                        System.out.println("종료합니다.");
                        loop_flag = false;
                        return;
                    default:
                        System.out.println("존재하지 않는 메뉴입니다.");
                        break;
                }
                
            }
        }
        return;
    }
}


