package days.day22.CarSample;

public class Car {

    // FIELDS - ATTRIBUTES;
    String machineType= "CAR";
    String brand;
    String model;
    int serialNumber;
    String colour;
    int doorNumber;
    static int servicePeriod = 100;

    public static void service(){
        servicePeriod--;
    }

    //FUNC:
    public void startEngine(){
        System.out.println("Engine is started!");
    }

    public void honk(){
        System.out.println("PUSH HONK!! BIP BIP!!");
    }
    public void openLights(){
        System.out.println("LIGHTS ON!");
    }

    public void shutdownEngine(){
        System.out.println("ENGINE OFF!!");
    }


}

// Honda CIVIC
// Kia NIRO
// Audi A3
// BMW M4