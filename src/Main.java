public class Main {
    public static void main(String[] args) {
        Bicycle[] bicycles = {new Bicycle("Kellys", 2),
                new Bicycle("Chost", 2),};
        Car[] cars = {new Car("Шевроле Авео", 4),
                new Car("Форд Фокус", 4),};
        Truck[] trucks = {new Truck("Ман", 8),
                new Truck("Маз", 6),};

        Transport[] transports = new Transport[bicycles.length + cars.length + trucks.length];
        for (int i = 0; i < bicycles.length; i++) {
            transports[i] = bicycles[i];
        }
        for (int i = 0; i < cars.length; i++) {
            transports[i + bicycles.length] = cars[i];
        }
        for (int i = 0; i < trucks.length; i++) {
            transports[i + bicycles.length + cars.length] = trucks[i];
        }
        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(transports[1]);
        System.out.println();
        serviceStation.check(cars[0]);
    }
}