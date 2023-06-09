package days.day52.Player;

public abstract class Player extends Person {

    String team;
    int number;

    public abstract void playing();

    public void training() {
        System.out.println(name + " is training.");
    }
}
