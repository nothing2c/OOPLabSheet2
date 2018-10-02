public class Dagger {

    private String name;
    private int damage;
    private float critChance, critMultiplier, durability;

    public Dagger (String name, int damage, float critChance, float critMultiplier, float durability)
    {
        setName(name);
        setDamage(damage);
        setCritChance(critChance);
        setCritMultiplier(critMultiplier);
        setDurability(durability);
    }

    public Dagger ()
    {
        this("Dagger", 0, 0f, 0f, 999f);
    }

    public String toString()
    {
        return "Name: "+getName()+"\nDamage: "+getDamage()+"\nCrit Chance: "+getCritChance()+"\nCrit Multiplier: "+getCritMultiplier()+"\nDurability: "+durability;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public void setCritChance(float critChance) {
        this.critChance = critChance;
    }

    public float getCritChance() {
        return critChance;
    }

    public void setCritMultiplier(float critMultiplier) {
        this.critMultiplier = critMultiplier;
    }

    public float getCritMultiplier() {
        return critMultiplier;
    }

    public void setDurability(float durability) {
        this.durability = durability;
    }

    public float getDurability() {
        return durability;
    }
}
