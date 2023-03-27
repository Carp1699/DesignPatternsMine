package creational2.Adapter.Decorator;

public class Test {
    public static void main(String[] args) {
        DataItself dato1 = new DataItself();
        dato1.writeData("Quiuvole pai");
        System.out.println(dato1.readData());
        //
        DataSource data1 = new WriteDataEncrypter(new DataItself());
        data1.writeData("Uwu");
        System.out.println(data1.readData());

    }
}
