package days.day47.first;

public class Driver {
    private Driver() {

    }

    public static void get() {
        System.out.println("Will return a driver.");
    }
}

class Building {
    public static void main(String[] args) {
        // Driver driver = new Driver();
        Driver.get();
    }

}
