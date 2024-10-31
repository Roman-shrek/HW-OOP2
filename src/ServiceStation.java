public class ServiceStation {
    public void check(Transport transport) {
        if (transport != null && transport.getWheelsCount() <= 2 && transport.getWheelsCount() < 4) {
            System.out.println("Обслуживаем велосипед " + transport.getModelName());
            transport.updateTyre();
        } else if (transport != null && transport.getWheelsCount() == 4) {
            System.out.println("Обслуживаем автомобиль " + transport.getModelName());
            transport.updateTyre();
            transport.checkEngine();
        } else if (transport != null && transport.getWheelsCount() > 4) {
            System.out.println("Обслуживаем грузовик " + transport.getModelName());
            transport.updateTyre();
            transport.checkEngine();
            transport.checkTrailer();
        }
    }
}