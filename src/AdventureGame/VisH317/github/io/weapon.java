package AdventureGame.VisH317.github.io;

interface item {
    public void use(Character character);
}

public class weapon implements item {
    private String weaponName;
    public long damage;
    public long durability;

    public void weapon(String weaponName, long damage, long durability) {
        this.weaponName = weaponName;
        this.damage = damage;
        this.durability = durability;
    }

    public String printStats() {
        return "Damage: " + this.damage + "\nDurability: " + this.durability;
    }

    public void use(Character ch) {
        ch.reduceHealth(this.damage);
        this.durability--;
    }

    public boolean checkBroken() {
        if(durability==0) {
            return true;
        }
        return false;
    }
}
