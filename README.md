## Guesser Game
This Java program simulates a simple guessing game involving a Guesser, three Players, and an Umpire. The Guesser selects a number, and the Players attempt to guess it. The Umpire collects the guesses and determines the winner(s).

Package
*Java*

package GuesserGame;
 Review and use carefully. More info on FAQ.
Classes
1. Guesser
   The Guesser class is responsible for the Guesser’s number selection.

Java

class Guesser {
int GuesserNum;

    public int GuesserNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser kindly guess a number");
        GuesserNum = sc.nextInt();
        return GuesserNum;
    }
}
AI-generated code. Review and use carefully. More info on FAQ.
Attributes:
GuesserNum: Stores the number guessed by the Guesser.
Methods:
GuesserNumber(): Prompts the Guesser to input a number and returns it.
2. Player
   The Player class is responsible for each Player’s number selection.

Java

class Player {
int PlayerNum;

    public int PlayerNumb() {
        Scanner sc = new Scanner(System.in);
        PlayerNum = sc.nextInt();
        return PlayerNum;
    }
}
Review and use carefully. More info on FAQ.
Attributes:
PlayerNum: Stores the number guessed by the Player.
Methods:
PlayerNumb(): Prompts the Player to input a number and returns it.
3. Umpire
   The Umpire class manages the game by collecting numbers from the Guesser and Players and comparing them to determine the winner(s).

Java
~~~ java
class Umpire {
int Guessernum;
int Playernum1;
int Playernum2;
int Playernum3;

    public void CollectNumForGuesser() {
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

    public void Compare() {
        if (Guessernum == Playernum1) {
            if (Guessernum == Playernum2 && Guessernum == Playernum3) {
                System.out.println("All players won the game");
            } else if (Guessernum == Playernum2) {
                System.out.println("Player 1 and Player 2 won the game");
            } else if (Guessernum == Playernum3) {
                System.out.println("Player 1 and Player 3 won the game");
            } else {
                System.out.println("Only Player 1 won the game");
            }
        } else if (Guessernum == Playernum2) {
            if (Guessernum == Playernum3) {
                System.out.println("Player 2 and Player 3 won the game");
            } else {
                System.out.println("Player 2 won the game");
            }
        } else if (Guessernum == Playernum3) {
            System.out.println("Only Player 3 won the game");
        } else {
            System.out.println("All players lost the game");
        }
    }
}
~~~
Review and use carefully. More info on FAQ.
Attributes:
Guessernum: Stores the number guessed by the Guesser.
Playernum1, Playernum2, Playernum3: Store the numbers guessed by the Players.
Methods:
CollectNumForGuesser(): Collects the number from the Guesser.
CollectNumForPlayers(): Collects the numbers from the Players.
Compare(): Compares the Guesser’s number with the Players’ numbers and determines the winner(s).
Main Class
The MyGuesserGame class contains the main method to run the game.

Java

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
AI-generated code. Review and use carefully. More info on FAQ.
Methods:
main(String[] args): Initiates the game by creating an Umpire object, collecting numbers from the Guesser and Players, and comparing them to determine the winner(s).