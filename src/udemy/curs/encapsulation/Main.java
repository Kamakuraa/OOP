package udemy.curs.encapsulation;

import udemy.curs.inheritance.Dog;

public class Main {
    public static void main(String[] args) {
//        DontUsedEncapsulationPlayer player = new DontUsedEncapsulationPlayer();
//        player.allName = "Tim";
//        player.health = 21;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healtRemaining());
//
//        damage = 12;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healtRemaining());

        UsedEncapsulationEnhancePlayer player = new UsedEncapsulationEnhancePlayer(
                "Alex",200,"Sword");
        System.out.println("Initial health is " + player.getHealth());

    }


}
