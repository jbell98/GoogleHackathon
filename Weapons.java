public class Weapon {
  private String name;
  private int damage;
  private int speed;
  private String attack; 
  
  public Weapon(String name, int dmg, int spd, String atk){
    name = name;
    damage = dmg;
    speed = spd;
    attack = atk;
  }
  /*public String getName() {
    return this.name
  }
  
  public String getDamage() {
    return this.name
  }*/
  
static Weapon[] weapons = {
  new Weapon("Dagger", 1, 3, "Stab"),
  new Weapon("Bow & Arrow", 2, 1, "Shot"),
  new Weapon("Crossbow", 3, 2, "Shot"),
  new Weapon("Spear", 2, 1, "Stab"),
  new Weapon("Hand Axe", 3, 0, "Slash"),
  new Weapon("Battle Axe", 5, -3, "Slash"),
  new Weapon("Rusty Pistol", 4, 0, "Shot"),
  new Weapon("Pistol", 6, 2, "Shot"),
  new Weapon("Superb Pistol", 10, 3, "Shot"),
  new Weapon("Rusty Rifle", 5, -3, "Shot"),
  new Weapon("Rifle", 7, 0, "Shot"),
  new Weapon("Superb Rifle", 12, 2, "Shot"),
  new Weapon("Short Sword", 3, 0, "Slash"),
  new Weapon("Long Sword", 5, -2, "Slash")
};
}
