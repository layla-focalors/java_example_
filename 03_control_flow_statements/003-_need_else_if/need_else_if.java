
import java.util.Scanner;

public class need_else_if {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = 0, num2 = 0;

            System.out.print("연산할 첫번째 수 > ");
            num1 = sc.nextInt();
            System.out.print("연산할 두번째 수 > ");
            num2 = sc.nextInt();

            ///////////////////////////////////////// type1
            // 덧셈 연산
            System.out.println(num1+num2);
            // 뺄셈 연산
            System.out.println(num1-num2);
            // 곱셈 연산
            System.out.println(num1*num2);
            // 나눗셈 연산
            System.out.println((double)num1/num2);
            ///////////////////////////////////////// type1
            System.out.println(" ----------------------------------------------------------------- ");

            int if_cnt = 0;     
            int elseif_cnt = 0;
            ///////////////////////////////////////// type2
            int operator = 0; 
            System.out.print("연산을 선택하세요(1:덧셈/2:뺄셈/3:곱셈/4:나눗셈/5:나머지) : ");
            operator = sc.nextInt();

            // 연산되는 데이터의 숫자 보기
            if(++if_cnt < 100 && operator == 1) { // 덧셈 연산
                System.out.println(num1+num2);
            }
            if(++if_cnt < 100 && operator == 2) { // 뺄셈 연산
                System.out.println(num1-num2);
            }
            if(++if_cnt < 100 && operator == 3) { // 곱셈 연산
                System.out.println(num1*num2);
            }
            if(++if_cnt < 100 && operator == 4) { // 나눗셈 연산
                System.out.println((double)num1/num2);
            }
            if(++if_cnt < 100 && operator == 5) { // 나머지 연산
                System.out.println(num1%num2);
            }
            ///////////////////////////////////////// type2
            System.out.printf("%s", if_cnt);
            System.out.println(" ----------------------------------------------------------------- ");
            ///////////////////////////////////////// type3
            char char_operator;
            System.out.print("연산을 선택하세요(+:덧셈 | -:뺄셈 | *:곱셈 | /:나눗셈 | %:나머지) : ");
            char_operator = sc.next().charAt(0);

            if(++elseif_cnt < 100 && char_operator == '+') { // 덧셈 연산
                System.out.println(num1+num2);
            }
            else if(++elseif_cnt < 100 && char_operator == '-') { // 뺄셈 연산
                System.out.println(num1-num2);
            }
            else if(++elseif_cnt < 100 && char_operator == '*') { // 곱셈 연산
                System.out.println(num1*num2);
            }
            else if(++elseif_cnt < 100 && char_operator == '/') { // 나눗셈 연산
                System.out.println((double)num1/num2);
            }
            else if(++elseif_cnt < 100 && char_operator == '%') { // 나머지 연산
                System.out.println(num1%num2);
            }
            System.out.printf("%s", elseif_cnt);
        }
        ///////////////////////////////////////// type3
        return;
    }
}