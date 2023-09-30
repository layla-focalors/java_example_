import java.util.Scanner;

public class switch_case {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String error_type;

            System.out.print("발생한 에러를 입력하세요(E0001, E0002, E0003, E0004, E0005) >> ");
            error_type = sc.next();
            switch(error_type){
                case "e0001":
                case "E0001":
                    System.out.println("E0001E");
                    break;
                case "e0002":
                case "E0002":
                    System.out.println("E0002E");
                    break;
                case "e0003":
                case "E0003":
                    System.out.println("E0003E");
                    break;
                case "e0004":
                case "E0004":
                    System.out.println("E0004E");
                    break;
                case "e0005":
                case "E0005":
                    System.out.println("E0005E");
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }
        }
        int random_number = (int)(Math.random() * 100);
        // 이거 결과가 소수점이라서! 소수점 * 100을 해서 소수로 바꾸고 강제 형 변환으로 정수로 바꾼다!
        switch(random_number % 2){
            case 0:
                System.out.println("짝수입니다");
                break;
            case 1:
                System.out.println("홀수입니다.");
                break;
        }

       

        return;
    }
}


/*



 */