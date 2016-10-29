public class Armor {
	private String name;
	private int defense;
	private int speed;
	Armor (String name, int defense, int speed) {
		this.name = name;
		this.defense = defense;
		this.speed = speed;
	}
	Armor (String name, int defense) {
		this.name = name;
		this.defense = defense;
	}
	
	static Armor[] armors = {
	new Armor("Cloth", 3),
	new Armor("Light Leather", 5),
	new Armor("Heavy Leather", 7),
	new Armor("Chain", 8, -1),
	new Armor("Light Plate", 11, -2),
	new Armor("Heavy Plate", 13, -3),
	new Armor("Metal", 15, -4),
	};
}
