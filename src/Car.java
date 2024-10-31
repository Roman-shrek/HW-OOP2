public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);

    }

    @Override
    public void updateTyre() {
        System.out.println("Поменять покрышку на легковом автомобиле");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
    }

    @Override
    public String toString() {
        return "Машина: " +
                "Название модели " + getModelName() +
                ", количество колес: " + getWheelsCount();
    }
}
