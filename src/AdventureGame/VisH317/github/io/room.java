package AdventureGame.VisH317.github.io;

import java.util.Scanner;

public class room {
    public enemy[] enemies;
    public item[] items;
    private player activePlayer;
    public String roomName;

    public room(player activePlayer, enemy[] enemies) {
        this.enemies = enemies;
        this.activePlayer = activePlayer;

    }

    public boolean init() {
        for(enemy enemy : enemies) {
            enemy.fight(activePlayer);
            if(activePlayer.isDead()) {
                return false;
            }
        }
        Scanner s = new Scanner(System.in);

        System.out.println("you have completed this room! Click any key to continue to the next room:");
        s.next();
        return true;

    }
}
