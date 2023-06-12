package days.day53.player;

public abstract class Player {
    String name;

    protected void training() {
        System.out.println(name + " is training.");
    }

    protected abstract void playing();


}
