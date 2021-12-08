package AdventureGame.VisH317.github.io;

interface Character {
    public void reduceHealth(long damage);
}

public class enemy implements Character {
    private String name;
    private long health;
    private weapon weapon;
    private long baseDamage;

    public void enemy(String name, long health, weapon weapon, long baseDamage) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
        this.baseDamage = baseDamage;
    }


    public void reduceHealth(long damage) {

    }
}
