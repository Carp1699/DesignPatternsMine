package creational3.Proxy;

public class RialNet implements Internet{
    @Override
    public void connectTo(String host) {
        System.out.println("Connected to: " + host);
    }
}
