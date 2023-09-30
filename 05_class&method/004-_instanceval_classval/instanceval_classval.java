public class instanceval_classval {
    public static void main(String[] args) {
        
        // 클래스 변수는 인스턴스가 생성하기 이전에도 접근 가능.
        System.out.println(TV_A134.width);
        System.out.println(TV_A134.height);
        
        // 컬러를 red로 지정하여 인스턴스 생성.
        TV_A134 red_t;
        red_t = new TV_A134();
        red_t.setColor("red");

        // 컬러를 blue로 지정하여 인스턴스 생성.
        TV_A134 blue_t;
        blue_t = new TV_A134();
        blue_t.setColor("blue");

        // non-static 변수는 각 인스턴스마다 독립적으로 저장됨.
        System.out.println(red_t.getColor());
        System.out.println(blue_t.getColor());

        // 인스턴스를 생성하고 width와 height 출력
        System.out.println("red_t -> " + red_t.width + "/" + red_t.height);
        System.out.println("blue_t -> " + blue_t.width + "/" + blue_t.height);

        // 각 인스턴스마다 클래스 변수 수정
        red_t.width = 11;
        blue_t.height = 22;

        // 클래스 변수는 모든 동일 객체들이 공유.
        System.out.println("red_t -> " + red_t.width + "/" + red_t.height);
        System.out.println("blue_t -> " + blue_t.width + "/" + blue_t.height);
        return;
    }
}

class TV_A134 {

    static int width = 1280;
    static int height = 720;
    static String model_name = "a134";

    String color;
    boolean power;
    int channel;

    void power() { power = !power;}
    void channelUp() { channel++;}
    void channelDown() { channel--;}
    void setColor(String c) { color = c; }
    String getColor() { return color; }
    int getChannel() { return channel; }

}