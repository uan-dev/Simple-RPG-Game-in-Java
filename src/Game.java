import java.util.Random;

public class Game {
    static Random damage = new Random();
    public static void main(String[] args) {
        Entity human = new Entity("A", EntityType.Human);
        Entity monster = new Entity("B", EntityType.Monster);

        human.attack(100, monster);

        monster.profile();
        human.profile();
    }
}