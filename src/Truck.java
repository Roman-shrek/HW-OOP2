public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Грузовик: " +
                "Название модели " + getModelName() +
                ", количество колес: " + getWheelsCount();
    }
}