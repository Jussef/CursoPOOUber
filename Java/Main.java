package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car("AMQ123", new Account("Daniel","DAN123"));
        car.passegenger = 4;
        car.printDataCar();
        
        Car car2 = new Car("ZAS123", new Account("Pedro","PER123"));
        car2.passegenger = 3;
        car2.printDataCar();
    }
}