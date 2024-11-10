import java.util.Random;

enum EntityType {
    Human, Monster;
}

public class Entity {
    // Constants
    private static final int MAX_HP = 100;
    private static final int MIN_HP = 1;
    
    private static final int MAX_LEVEL = 5;

    //
    private String name;
    private EntityType type;
    private int level;
    private int EXP;
    private int HP;

    public Entity(String name, EntityType type) {
        this.name = name;
        this.type = type;
        this.level = 1;
        this.HP = MAX_HP;
        
    }

    // Get n Set methods
    public int getHP() {
        return this.HP;
    }

    public String getName() {
        return this.name;
    }

    public void setHP(int HP){
        this.HP = HP;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Entity methods 
    public void profile() {
        System.out.printf("%nName  : %s%n", this.name);
        System.out.printf("Type  : %s%n", this.type);
        System.out.printf("Level : %s%n", this.level);
        System.out.printf(" EXP  : %s%n", this.EXP);
        System.out.printf(" HP   : %s%n", this.HP);
    }

    
    public void earnEXP(int damage) {
        Random earn = new Random();
        this.EXP = earn.nextInt(damage + 100);
        
        System.out.printf("%n%s earned %d exps points.%n", this.name, this.EXP);
        
        if (EXP > 100) {
            this.level += 1;
            System.out.printf("%s it's gone up to level %d", this.name, this.level);
        }
    }

    // Attack system
    public void takeDamage(int damage) {
        this.HP -= damage;
        if (this.HP < 0) {
            this.HP = 0;
            return;
        }
    }
    
    public void attack(int damage, Entity enemy) {
        if (this.HP < 0) {
            this.HP = 0;
            System.out.printf("%nYou cannot attack %s, he's dead!%n", this.name);
            return;
        }
        enemy.takeDamage(damage);
        if (enemy.HP > 0) {
            System.out.printf("%s attacked %s with damage equal to %d!%n", this.name, enemy.getName(), damage);
            System.out.printf("%s now has %d HP remaining!%n", enemy.getName(), enemy.getHP());
        } else {
            System.out.printf("%s attacked %s with damage equal to %d!", this.name, enemy.getName(), damage);
            System.out.printf("%n%s was defeated!%n", enemy.name);
            earnEXP(damage);
        }
    }
}
