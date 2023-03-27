package creational2.Adapter.Decorator;

 class DataItself implements DataSource {
    private String data;
//    public DataItself(String data){
//        this.data = data;
//    }
    public void writeData(String data) {
        this.data = data;
    }

    @Override
    public String readData() {
        return this.data;
    }
}
