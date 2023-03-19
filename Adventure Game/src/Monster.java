public abstract class Monster {
    private int id;
    private int damage;
    private int health;
    private String name;
    private int bonus;
    private  int defaultHealth;


    public Monster(int id, int damage, int health, String name, int bonus){
        this.id = id;
        this.damage=damage;
        this.health=health;
        this.name=name;
        this.bonus=bonus;
        this.defaultHealth = health;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(this.health<0){
            this.health = 0;
        }
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getDefaultHealth() {
        return defaultHealth;
    }

    public void setDefaultHealth(int defaultHealth) {
        this.defaultHealth = defaultHealth;
    }
}
