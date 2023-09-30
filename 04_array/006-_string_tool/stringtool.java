
public class stringtool {
    public static void main(String[] args) {
        
        // String sentence = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String sentence = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

        // 1. char 배열의 특정 인덱스에 존재하는 문자 출력
        // apple
        System.out.print(sentence.charAt(0));
        System.out.print(sentence.charAt(15));
        System.out.print(sentence.charAt(15));
        System.out.print(sentence.charAt(11));
        System.out.print(sentence.charAt(4));
        // 문자 단위의 제어 : char at
        
        System.out.println();
        // galaxy
        System.out.print(sentence.charAt(6));
        System.out.print(sentence.charAt(0));
        System.out.print(sentence.charAt(11));
        System.out.print(sentence.charAt(0));
        System.out.print(sentence.charAt(23));
        System.out.print(sentence.charAt(24));
        System.out.println();

        // 2. NOP 출력하기
        //  +1을 해 줘야 함 (0부터 시작이기에)
        System.out.println(sentence.substring(13, 15 + 1));
        
        // beginIndex 부터 endIndex-1까지!!

        // 3. 뽑아낸 문자열이 내가 원하는 문자열인가?
        System.out.println(sentence.substring(13, 15 + 1).equals("NOP"));
        // 4. String -> char[] 타입으로 변경
        char[] char_arr = sentence.substring(13, 15 + 1).toCharArray();
        System.out.println(char_arr);
        // System.out.println(char_arr.substring(0, 3));

        // 5. 문자열의 길이 확인 
        // 문자열은 함수 형태로 요청해야 한다!
        System.out.println(sentence.length());
        




        return;
    }
}