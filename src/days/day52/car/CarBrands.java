package days.day52.car;

public enum CarBrands {
    FERRARI(5000), TESLA(3000), BMW(2500), TOYOTA(800), HONDA(900), MERCEDES(1500);

    int price;

    CarBrands(int price) {
        this.price = price;
    }


}
