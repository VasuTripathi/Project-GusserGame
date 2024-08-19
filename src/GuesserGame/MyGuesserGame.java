package GuesserGame;

import java.util.Scanner;

class Guesser{
    int GuesserNum;
    public int GuesserNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser kindly guess a number");
        GuesserNum = sc.nextInt();
        return GuesserNum;
    }
}
class Player{
    int PlayerNum;
    public int PlayerNumb(){
        Scanner sc = new Scanner(System.in);
        PlayerNum = sc.nextInt();
        return PlayerNum;
    }
}
class Umpire{
    int Guessernum;
    int Playernum1;
    int Playernum2;
    int Playernum3;

    public void CollectNumForGuesser(){
        Guesser Gu = new Guesser();
        Guessernum = Gu.GuesserNumber();
    }
    public void CollectNumForPlayers() {
        Player P1 = new Player();
        System.out.println("Player1 kindly guess a number");
        Playernum1 = P1.PlayerNumb();

        Player P2 = new Player();
        System.out.println("Player2 kindly guess a number");
        Playernum2 = P2.PlayerNumb();

        Player P3 = new Player();
        System.out.println("Player3 kindly guess a number");
        Playernum3 = P3.PlayerNumb();


    }
    public void Compare(){
     if(Guessernum == Playernum1){
         if(Guessernum == Playernum2 &&  Guessernum==Playernum3 ){
             System.out.println("All player won the game");
         } else if (Guessernum == Playernum2) {
             System.out.println("player 1 and player 2 won the game");
         }
         else if (Guessernum == Playernum3) {
             System.out.println("player 1 and player 3 won the game");
     }
         else{
             System.out.println("Only player 1 won the game");
     }
    }
     else if(Guessernum== Playernum2){
     if(Guessernum==Playernum3){
         System.out.println("player 2 and player 3");
     }
     else{
         System.out.println("Player 2");
     }
     }
     else if(Guessernum == Playernum3){
         System.out.println("Only player 3 won the game");
     }
     else{
         System.out.println("All players lost the game");
     }
    }
}

public class MyGuesserGame {
    public static void main(String[] args) {
        System.out.println("_-_-_-_-_GAME STARTED_-_-_-_-_-");
        Umpire UM = new Umpire();
        UM.CollectNumForGuesser();
        UM.CollectNumForPlayers();
        UM.Compare();
        System.out.println("_-_-_-_-_GAME OVER_-_-_-_-_-");
    }
}