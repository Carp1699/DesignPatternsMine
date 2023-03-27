package behavorial2.Command;

public class Test {
    public static void main(String[] args) {
        FileSystemReceiver window = new WindowFileSystemReceiver();
        OpenFileCommand openFileCommand = new OpenFileCommand(window);
        FileInvoker file = new FileInvoker(openFileCommand);
        file.execute();
        WriteFileCommand writeFileCommand = new WriteFileCommand(window);
        file = new FileInvoker(writeFileCommand);
        file.execute();




    }
}
