package AdventureGame.VisH317.github.io;

public class player implements Character {
    public long health = 100;
    public weapon equipped;
    public double attackMult;
    public double defenseMult;

    public player(weapon equipped) {
        this.equipped = equipped;
    }

    public boolean isDead() {
        return health<=0;
    }

    public void addHealth(long damage) {
        this.health += damage;
        if(this.health > 120) {
            this.health = 120;
        }
    }
    public void addAttack(double buff) { attackMult += buff; }
    public void addDefense(double buff) { defenseMult += buff; }
}
