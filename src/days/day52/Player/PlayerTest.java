package days.day52.Player;

import java.util.ArrayList;

public class PlayerTest {
    public static void main(String[] args) {
        AttackPlayer attackPlayer = new AttackPlayer();
        attackPlayer.name = "Ronaldo";
        attackPlayer.training();
        attackPlayer.scoreGoal();
        attackPlayer.scoreGoal();
        System.out.println("attackPlayer.numberOfGoals = " + attackPlayer.numberOfGoals);
        attackPlayer.playing();


        AttackPlayer attackPlayer2 = new AttackPlayer();
        attackPlayer2.name = "Rivaldo";
        attackPlayer2.number = 10;
        attackPlayer2.age = 32;

        AttackPlayer attackPlayer3 = new AttackPlayer();
        attackPlayer3.name = "Ronaldinho";
        attackPlayer3.number = 9;
        attackPlayer3.age = 29;

        ArrayList<AttackPlayer> listOfAttackPlayer = new ArrayList<>();
        listOfAttackPlayer.add(attackPlayer);
        listOfAttackPlayer.add(attackPlayer2);
        listOfAttackPlayer.add(attackPlayer3);

        System.out.println("listOfAttackPlayer.get(0).name = " + listOfAttackPlayer.get(0).name);
        System.out.println("Ronaldinho age = " + listOfAttackPlayer.get(2).age);
        System.out.println(listOfAttackPlayer.get(1).name);


    }
}
