public class ServiceStation {
    public void check(Transport transport) {
            System.out.println("Обслуживаем " + transport.getModelName());
            transport.updateTyre();
            transport.checkEngine();
            transport.checkTrailer();
        }
    }