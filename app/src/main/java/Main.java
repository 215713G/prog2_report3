import jp.ac.uryukyu.ie.naganuma.*;

public class Main {
    public static void main(String[] args){
        Warrior warrior = new Warrior("戦士", 20, 8);
        Enemy enemy = new Enemy("スライム", 10, 3);

        System.out.printf("%s vs. %s\n", warrior.getName(), enemy.getName());

        int turn = 0;
        while( warrior.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeaponSkill(enemy);  
            enemy.attack(warrior);
        }
        System.out.println("戦闘終了");
    }
}

/* 
public class Main {
    public static void main(String[] args){
        Hero hero = new Hero("勇者", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", hero.getName(), enemy.getName());

        int turn = 0;
        while( hero.isDead() == false && enemy.isDead() == false ){
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            hero.attack(enemy);
            enemy.attack(hero);
        }
        System.out.println("戦闘終了");
    }
}
*/