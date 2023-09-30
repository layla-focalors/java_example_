public class class_basic {
    public static void main(String[] args) {
        TV t;
        t = new TV();
        t.channel = 100;
        t.channelDown();
        t.channelDown();
        System.out.println("현재 채널은 " + t.getChannel() + "번.");

        return;
    }
}
