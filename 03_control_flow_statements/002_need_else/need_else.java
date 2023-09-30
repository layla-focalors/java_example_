import java.util.Scanner;

public class need_else {
    public static void main(String[] args) {
        try (// import java.util.Scanner;
        Scanner sc = new Scanner(System.in)) {
            int num1 = 0, num2 = 0;

            System.out.print("연산할 첫번째 수 > ");
            num1 = sc.nextInt();
            System.out.print("연산할 두번째 수 > ");
            num2 = sc.nextInt();

            int operator = 0; 
            System.out.print("연산을 선택하세요(1:덧셈/2:뺄셈) : ");
            operator = sc.nextInt();

            if(operator == 1) { // 덧셈 연산
                System.out.println(num1+num2);
            } 
            else { // 뺄셈 연산
                System.out.println(num1-num2);
            }
        }
        return;
    }
}
