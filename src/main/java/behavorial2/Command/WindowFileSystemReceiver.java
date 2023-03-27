package behavorial2.Command;

public class WindowFileSystemReceiver implements FileSystemReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening file in window");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing in a unix window");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in window ");
    }
}
