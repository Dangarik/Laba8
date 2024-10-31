abstract class Transport {
    protected String model;
    protected int year;

    public Transport(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public abstract String getTransportType();

    @Override
    public String toString() {
        return "Model: " + model + ", Year: " + year;
    }
}