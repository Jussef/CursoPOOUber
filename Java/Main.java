package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        UberX uberX = new UberX("AMQ123", new Account("Daniel","DAN123"), null, null);
        uberX.setPassegenger(4);
        uberX.printDataCar();
        
        Car car2 = new Car("ZAS123", new Account("Pedro","PER123"));
        car2.setPassegenger(3);
        car2.printDataCar();
    }
}