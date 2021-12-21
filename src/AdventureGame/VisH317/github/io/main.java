package AdventureGame.VisH317.github.io;

import java.util.Scanner;

public class main {
    private static Scanner input;
    public static room[] roomArray;

    public static void initGame() {
        roomArray = new room[2];
        weapon activeWeapon = new weapon("sword", 8, -1);
        player Player = new player(activeWeapon);

        enemy[] room1Enemies = {new enemy("Skeleton", 20, 3)};
        enemy[] room2Enemies = {new enemy("Zombie", 30, 4), new enemy("Zombie", 30, 4)};

        roomArray[0] = new room(Player, room1Enemies);
        roomArray[1] = new room(Player, room2Enemies);

        for(room room : roomArray) {
            boolean cont = room.init();
            if(!cont) {
                System.out.println("You have died!");
                System.exit(0);
            }
        }

    }

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.println("Welcome to AdventureGame!");
        System.out.println("Click p to play or q to quit");

        char play = input.next().charAt(0);
        if(play == 'p' || play == 'P') {
            initGame();
        } else if (play == 'q' || play == 'Q') {
            System.exit(0);
        }
    }
}
