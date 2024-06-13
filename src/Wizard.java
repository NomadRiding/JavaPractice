import java.util.Random;

public class Wizard extends Character implements IAttacker {
    private int mana = new Random().nextInt(50) + 1;
    private int intelligence = new Random().nextInt(91) + 10;

    public Wizard(String name, int health, int attackPower, int attackSuccessRate) {
        super(name, health, attackPower, attackSuccessRate);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public void attack() {

    }

}
