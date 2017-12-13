public class Character {
	protected int HP;
	protected int strength; 
	protected int defense;
	protected double attackR;
	
	// Returns whether protagonist is dead (when HP = 0)
	public boolean isAlive() {
		return HP > 0;
	}

	// Accessor method for defense
	public int getDefense() {
		return defense;
	}
		
	// Lowers HP by d
	public void lowerHP(int d) {
		HP -= d;
	}
	
	// Attack, deals damage to monster
	public int attack(Character c) {
		int damage = 0;
		damage = (int) (strength * attackR) - c.getDefense();
		if (damage < 0) damage = 0;
		c.lowerHP(damage);
		return damage;
	}
}