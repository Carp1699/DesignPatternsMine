package behavorial3.Observer;

import java.io.File;

public class LogOpenListener  implements EventListener{
    private File log;

    public LogOpenListener(String file) {
        this.log = new File(file);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType);
    }
}
