package basic.exams.exam3;

public abstract class Character {

    private String name;
    private int maxHP;
    private int hp;
    private int attack;
    private int defense;
    private Dice dice;

    public Character(String name, int maxHP, int attack, int defense) {
        this.name = name;
        this.maxHP = maxHP;
        this.hp = maxHP;
        this.attack = attack;
        this.defense = defense;
        this.dice = new Dice();
    }

    public void battle(Character opponent) throws CharacterDefeatedException {
        System.out.println("\n" + this.getName() + " vs. " + opponent.getName());

        while (this.hp > 0 && opponent.hp > 0) {
            performAttack(this, opponent);
            pause();
            if (opponent.hp <= 0) {
                throw new CharacterDefeatedException(opponent.getName() + " was Defeated by " + this.getName() + "!");
            }

            performAttack(opponent, this);
            if (this.hp <= 0) {
                throw new CharacterDefeatedException(this.getName() + " was Defeated by " + opponent.getName() + "!");
            }
        }
    }

    private void performAttack(Character attacker, Character defender) {
        System.out.println("\n" + attacker.getName() + "'s turn");

        int diceRoll = dice.roll();
        System.out.println("Rolled " + diceRoll + " on the Dice!");
        int totalAttack = attacker.getAttack() + diceRoll;
        System.out.println("Attack: " + totalAttack);

        if (totalAttack > defender.getDefense()) {
            System.out.println("Hit!");
            int damage = totalAttack - defender.getDefense();
            System.out.println(defender.getName() + " Takes " + damage + " Damage!");
            defender.setHp(defender.getHp() - damage);
            System.out.println(defender.getName() + "'s Health: " + defender.getHp() + "/" + defender.getMaxHP());
        } else {
            System.out.println(attacker.getName() + " Missed!");
        }
    }

    private void pause() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
            throw new RuntimeException("Thread was interrupted during battle pause", e);
        }
    }

    public String getName() {
        return name;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    @Override
    public String toString() {
        return "Character [name=" + name + ", maxHP=" + maxHP + ", hp=" + hp + ", attack=" + attack + ", defense="
                + defense + "]";
    }
}
