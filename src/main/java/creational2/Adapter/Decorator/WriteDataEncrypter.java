package creational2.Adapter.Decorator;

public class WriteDataEncrypter extends DataDecorator{
    public WriteDataEncrypter (DataSource data){
        super(data);
    }
    @Override
    public void writeData(String data) {
        super.writeData(data+"Encriptadisimo pai");
    }

}
