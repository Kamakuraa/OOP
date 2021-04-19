package udemy.curs.encapsulation;

public class DontUsedEncapsulationPlayer {
    public String allName;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0){
            System.out.println("Player knoked out");
        }
    }

    public int healtRemaining(){
        return this.health;
    }



}
