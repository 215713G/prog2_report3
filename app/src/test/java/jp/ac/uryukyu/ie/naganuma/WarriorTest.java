package jp.ac.uryukyu.ie.naganuma;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void attackWithWeaponSkillTest() {
        Warrior demowarrior = new Warrior("戦士", 100, 10);
        Enemy demoenemy = new Enemy("スライム", 50, 5);

        for (int i = 0; i < 3; i++) {
            int expectedDamage = (int) (demowarrior.getAttack() * 1.5);
            int initialEnemyHP = demoenemy.getHitPoint();
            demowarrior.attackWithWeaponSkill(demoenemy);
            int actualDamage = initialEnemyHP - demoenemy.getHitPoint();

            assertEquals(expectedDamage, actualDamage, "攻撃力の150%のダメージを与えられていない");
        }
    }
}
