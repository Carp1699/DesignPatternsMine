package creational2.Adapter.Decorator;

public abstract class DataDecorator implements DataSource{
    private DataSource data;
    public DataDecorator(DataSource data){
        this.data = data;
    }
    @Override
    public void writeData(String data) {
        this.data.writeData(data);
    }

    @Override
    public String readData() {
        return data.readData();
    }
}
