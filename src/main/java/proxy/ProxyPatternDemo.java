package proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        ProxyImage image = new ProxyImage("someone.png");
        image.display();
    }
}