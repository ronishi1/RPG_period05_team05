public class Ogre extends Monster {
	
	public Ogre() {
		
		HP = 250;
		strength = (int) (Math.random() * 60.0) + 30;
		defense = 15;
		attackR = 1;
	}

	public String toString() {
		return super.toString() + System.lineSeparator() + "Type: Ogre";
	}

}