package Java;

public class Car {
    Integer id;
    String license;
    Account driver;
    private Integer passegenger;

    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;

    }

    void printDataCar() {
        if(passegenger != null){
        System.out.println("License: " + license + " Driver: " + driver.name + " Passengers: " + passegenger); //el .name es por el metodo toString  - https://javautodidacta.es/metodo-tostring-java/
    }
    }

    public Integer getPassegenger(){
        return passegenger;
    }

    public void setPassegenger(Integer passenger){
        if(passenger == 4){
            this.passegenger = passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }
}
