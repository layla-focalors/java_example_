public class Break {
    public static void main(String[] args) {
        
        for(int i=0; i<2000; i++) {
            if(i==100) { 
                System.out.println("i의 값 " + i + "에서 탈출합니다.");
                break;
            }
            System.out.println("i의 값은 " + i);
        }        
        // 반복문이 100일 때, 탈출!
        for(int i = 0; i < 2; i ++){
            for(int j=0; j < 1000; j ++){
                if(j==100){
                    System.out.println("탈출!");
                    break;
                }
                System.out.println("A");
            }
            System.out.println("B");
        }
        return;
    }
}


