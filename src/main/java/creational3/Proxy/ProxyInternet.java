package creational3.Proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet{
    private static final ArrayList<String> bannedSite = new ArrayList<>();
    private final Internet internet = new RialNet();
    static {
        bannedSite.add("banned.com");
    }
    @Override
    public void connectTo(String host) {
        if (bannedSite.contains(host)) {System.out.println("Access Denied"); return; }
        internet.connectTo(host);
    }
}
