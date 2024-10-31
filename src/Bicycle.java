public class Bicycle extends Transport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Поменять покрышку на велосипеде");

    }

    public void checkEngine() {
    }

    public void checkTrailer() {
    }

    @Override
    public String toString() {
        return "Велосипед: " +
                "Название модели " + getModelName() +
                ", количество колес: " + getWheelsCount();
    }
}
