import java.util.Random;

@SuppressWarnings("unused")
public class Game {
    static Random damage = new Random();
    public static void main(String[] args) {
        Entity humanOne = new Entity("Human", EntityType.Human);
        Entity monsterOne = new Entity("Monster", EntityType.Monster);
    }
}