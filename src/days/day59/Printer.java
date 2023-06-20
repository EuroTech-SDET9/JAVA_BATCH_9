package days.day59;

public class Printer {

    public void print(int number) {
        System.out.println("number = " + number);
    }

    public void print(String str) {
        System.out.println("str = " + str);
    }
}

class PrinterTest {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Hello");
        printer.print(20);
    }
}
