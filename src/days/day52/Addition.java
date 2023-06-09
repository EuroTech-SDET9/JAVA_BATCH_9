package days.day52;

public interface Addition {
    String calculation = "Addition";// as a default fields are final and static
    int year = 2023;

    void add();

    void add(int a, int b);

    static void print() {

    }

    default void print(int number) {

    }


}
