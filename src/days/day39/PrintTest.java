package days.day39;

public class PrintTest {
    public static void main(String[] args) {
        Printer firstPrinter = new Printer();
        Printer secondprinter = new Printer();
        Printer thirdprinter = new Printer();
        firstPrinter.brand = "Canon";
        firstPrinter.value = 100;
        secondprinter.brand = "Hp";
        secondprinter.value = 200;
        firstPrinter.printerInfo();
        secondprinter.printerInfo();
        firstPrinter.value = 500;
        firstPrinter.printerInfo();


    }
}
