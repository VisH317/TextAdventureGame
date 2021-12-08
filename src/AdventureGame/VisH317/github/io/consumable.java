package AdventureGame.VisH317.github.io;

public class consumable implements item {
    private double[] buffs;
    private long durability;

    public void consumable(double healthBuff, double attackBuff, double defenseBuff, long durability) {
        this.buffs = new double[]{healthBuff, attackBuff, defenseBuff};
        this.durability = durability;
    }

    public void use(Character character) {

    }
}
