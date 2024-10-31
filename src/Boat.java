class Boat extends Transport {
    private int speed;
    private String fuelType;

    public Boat(String model, int year, int speed, String fuelType) {
        super(model, year); // Використання super для ініціалізації батьківського класу
        this.speed = speed;
        this.fuelType = fuelType;
    }

    public Boat(String model, int year) {
        this(model, year, 0, "Unknown"); // Використання this для іншого конструктора
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void changeSpeed(int newSpeed) {
        this.speed = newSpeed;
    }

    public void changeSpeed(int increment, boolean isIncrease) {
        if (isIncrease) {
            this.speed += increment;
        } else {
            this.speed -= increment;
        }
    }

    @Override
    public String getTransportType() {
        return "Boat ,";
    }

    @Override
    public String toString() {
        return super.toString() + ", Speed: " + speed + ", Fuel Type: " + fuelType;
    }

}
