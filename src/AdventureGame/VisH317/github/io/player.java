package AdventureGame.VisH317.github.io;

public class player implements Character {
    public long health = 100;
    public weapon equipped;

    public void reduceHealth(long damage) {
        health -= damage;
    }
}
