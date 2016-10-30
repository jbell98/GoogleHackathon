private class Weapons {
  private String name
  private int damage
  private int speed 
  private String attack 
  
  public weapon(String name, int dmg, int spd, String atk){
    name = name;
    damage = dmg;
    speed = spd;
    attack = atk
  }
  /*public String getName() {
    return this.name
  }
  
  public String getDamage() {
    return this.name
  }*/
  
static Weapons[] weapon = [
  new Weapons(
  "Dagger", 1, 3, "Stab";
  "Bow & Arrow", 2, 1, "Shot";
  "Crossbow", 3, 2, "Shot";
  "Spear", 2, 1, "Stab";
  "Hand Axe", 3, 0, "Slash";
  "Battle Axe", 5, -3, "Slash";
  "Rusty Pistol", 4, 0, "Shot";
  "Pistol", 6, 2, "Shot";
  "Superb Pistol", 10, 3, "Shot";
  "Rusty Rifle", 5, -3, "Shot";
  "Rifle", 7, 0, "Shot";
  "Superb Rifle", 12, 2, "Shot";
  "Short Sword", 3, 0, "Slash";
  "Long Sword", 5, -2, "Slash";
  )]
  
}
