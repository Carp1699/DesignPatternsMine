package creational3.Proxy;

public class Test {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connectTo("www.google.com");
        internet.connectTo("banned.com");
    }
}
