package days.day53.player;

import java.util.ArrayList;
import java.util.List;

public class PlayerTest {
    public static void main(String[] args) {
        FootBallPlayer footBallPlayer = new FootBallPlayer();
        footBallPlayer.name = "Kevin";
        footBallPlayer.training();
        footBallPlayer.playing();
        BasketBallPlayer basketBallPlayer = new BasketBallPlayer();
        basketBallPlayer.name = "Jordan";
        basketBallPlayer.training();
        basketBallPlayer.playing();
        footBallPlayer.playing();

        Player player1 = new FootBallPlayer();
        player1.name = "Ronaldo";
        Player player2 = new BasketBallPlayer();
        player2.name = "Curry";
        playGame(player1);//footballplayer
        playGame(player2);//basketball
        ArrayList<Integer> integers = new ArrayList<>();
        List<Integer> numberList = new ArrayList<>();
        Player[] playersArray = new Player[2];
        playersArray[0] = player1;
        playersArray[1] = player2;


    }

//    public static void playGame(BasketBallPlayer basketBallPlayer) {
//        basketBallPlayer.playing();
//    }
//
//    public static void playGame(FootBallPlayer footBallPlayer) {
//        footBallPlayer.playing();
//    }

    public static void playGame(Player player) {
        player.playing();
    }


}
