package days.day52.Player;

public class FootBallPlayer extends Player {

    public void tacticalTraining() {
        System.out.println(name + " is in the tactic meeting.");
    }

    @Override
    public void playing() {
        System.out.println(name + " playing football.");
    }
}
