
public class formatted_print {
    public static void main(String[] args) {
        // ------------------------------------------------------------------
        // 009_formmated_print 예제의 목표는
        // formatted 출력에 대해 이해하고 다양한 서식문자에 대해서 실습한다.
        // ------------------------------------------------------------------

        // 출력할 변수 선언 및 초기화
        String name = "김자바";
        int age = 20;
        double tall = 190.1234;

        // printf의 서식 문자(%s 등)를 이용한 출력
        System.out.printf("제 이름은 %s 이고, 나이는 %d 이고, 키는 %f 입니다.", name, age, tall);

        byte b = 1;
        short s = 2;
        char c= 'A';
        int number = 10;
        long big = 100_000_000_000L; // 언더 바를 통해서 수의 자리 수 구분
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int oct_number = 010; // 8진 정수
        int hex_number = 0x10; // 16진 정수
        int bin_number = 0b10; // 2진 정수

        String welcome_str = "Hello Java World!!!!";

        System.out.printf("b = %d\n", b);
        System.out.printf("s = %d\n", s);
        System.out.printf("c = %c / %d \n", c, (int)c);

        // 서식문자 사이에 정수 값을 넣음으로써 칸 확보 및 0으로 채움
        System.out.printf("number = [%5d] \n", number);
        System.out.printf("number = [%-5d] \n", number);
        System.out.printf("number = [%05d] \n", number);

        // 다양한 진법의 수 출력
        System.out.printf("big = %d \n",big);
        System.out.printf("hex = %x \n", hex);
        System.out.printf("oct_number = %#o %d \n", oct_number, oct_number); // #은 각 진수답게 출력. 8진수이므로 0을 붙혀서 출력
        System.out.printf("hex_number = %#x %d \n", hex_number, hex_number); // #은 각 진수답게 출력. 16진수이므로 0x를 붙혀서 출력
        System.out.printf("bin_number = %s %d \n", Integer.toBinaryString(bin_number), bin_number);
        // Integer 클래스의 toBinaryString 메소드를 이용하여 2진수 형태의 문자열로 출력.

        System.out.printf("welcome_str = %s \n", welcome_str);

        // 다양한 실수 선언
        float f1 = .123f;
        float f2 = 1e1f;
        float f3 = 3.1415e3f;
        double d = 1.123456789;

        // %f:실수를 소수점 6자리까지 출력
        // %e:실수를 e표기법으로 출력
        // %g:실수의 길이에 따라 %f 또는 %e로 출력
        // %a:실수를 16진수 방식으로 출력
        System.out.printf("f1 = %f, %e, %g %a\n", f1, f1, f1, f1);
        System.out.printf("f2 = %f, %e, %g %a\n", f2, f2, f2, f2);
        System.out.printf("f3 = %f, %e, %g %a\n", f3, f3, f3, f3);

        System.out.printf("d = %f \n",d);
        System.out.printf("d = %14.10f \n",d); // 총 14칸 확보하며, 소수점 아래 10자리까지 실수 형식으로 출력

        return;
    }
}
