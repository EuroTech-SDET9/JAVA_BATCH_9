package days.day52.Player;

public class AttackPlayer extends FootBallPlayer implements Attacker {
    int numberOfGoals;

    @Override
    public void scoreGoal() {
        System.out.println(name + " scored goallll!!!");
        numberOfGoals++;
    }
}
