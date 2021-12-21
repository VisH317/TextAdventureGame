package AdventureGame.VisH317.github.io;

import java.util.Scanner;

interface Character {
    void addHealth(long damage);
    void addAttack(double buff);
    void addDefense(double buff);
    boolean isDead();
}

public class enemy implements Character {
    private String name;
    private long health;
    private weapon weapon;
    private long baseDamage;
    private double Defense;

    public enemy(String name, long health, long baseDamage) {
        this.name = name;
        this.health = health;
        this.baseDamage = baseDamage;
    }

    public boolean fight(player p) {
        Scanner s = new Scanner(System.in);
        char output;
        while (!this.isDead() && !p.isDead()) {
            System.out.println("A " + this.name + " has appeared!");
            System.out.println("Your turn:");
            System.out.println("Attack (a) or Defend (d)");

            output = s.next().charAt(0);

            if(output=='A' || output=='a') {
                this.addHealth(-p.equipped.damage);
            } else if(output=='D' || output=='d') {
                p.addHealth(5);
            }

            System.out.println("Your health: " + p.health + "\nEnemy's health: " + this.health);
            p.addHealth(-this.baseDamage);
            System.out.println("Enemy does" + this.baseDamage + " damage");
            System.out.println("Your health: " + p.health + "\nEnemy's health: " + this.health);
        }

        if(this.isDead()) {
            System.out.println("You have defeated the " + this.name);
            return true;
        }

        System.out.println("You are dead");
        return false;

    }

    public boolean isDead() {
        return health<=0;
    }


    public void addHealth(long damage) { this.health += damage; }
    public void addDefense(double buff) { this.Defense += buff; }
    public void addAttack(double buff) { this.baseDamage *= 1 + buff; }
}

