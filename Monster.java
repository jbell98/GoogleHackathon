public class Monster
{
   private String Name;
   private double hitPoints;
   private double damage;
   private int speed;
   private int level;
   private String weakness;
   private String attack;
   
   public Monster(String name, double hp, double dmg, int spd, String ATK)
   {
      Name = name;
      hitPoints = hp;
      damage = dmg;
      speed = spd;
      attack = ATK;
   }
   
   public Monster(String name, double hp, double dmg,int spd, String ATK, String weak)
   {
      Name = name;
      hitPoints = hp;
      damage = dmg;
      speed = spd;
      attack = ATK;
      weakness = weak;
   }
   
   public double takeDamage(double dmg, String weak)
   {
   
      if(weak.equalsIgnoreCase("fire"))
      {
         return hitPoints - dmg * (1.5);
      }
      else if (weak.equalsIgnoreCase("ice"))
      {
         return hitPoints - dmg * (1.5);
      }
      else if (weak.equalsIgnoreCase("electric"))
      {
         return hitPoints - dmg * (1.5);
      }
      else if(weak.equalsIgnoreCase("Physical"))
      {
         return hitPoints - dmg * (1.5);
      }
      else
         return hitPoints - dmg;
   }
   
  /* public void induceBLD()
   {
   }
   
   public void inducePSN()
   {
   }
   
   public void induceSLC()
   {
   }
  */ 
  
  //Name, hitPoints, Damage, Speed, Attack Name, Weakness
   static Monster[] monsters = {
   new Monster ("Carl the atheist", 10, 10, 30, "I dont believe in your attack", "fire"),
   new Monster ("John the terrible", 60, 40, 20, "Back Hand"),
   new Monster ("Ulltrak the ultimate destroyer", 1, 20, 0, "Ultimate Destruction", "physical attack"),
   new Monster ("Stevie", 60, 50, 30,"Yes?", "fire"),
   new Monster ("Hell Hound", 40, 50, 40,"Bite", "Ice"),
   new Monster ("Regular Hound", 30, 40, 30, "Bite", "physical"),
   new Monster ("Trump Supporter", 10, 0, 10,"Hes not racist", "physical"),
   new Monster ("Giant Wasp", 10, 50, 30, "Sting", "Fire"),
   new Monster ("New York Rat", 10, 80, 40, "Bite"),
   new Monster ("The Beast Beneath", 60, 60, 60, "Hell fire"),
   new Monster ("Azarog", 10, 10, 10, "Eternal Flame", "Ice"),
   new Monster ("El Diablo", 90, 80, 70, "Hell fire", "Ice"),
   new Monster ("lil squishy", 20, 20, 20, "Squish Squish"),
   new Monster ("Bubble Buddy", 40, 10, 20, "Bubble butt", "Electric"),
   new Monster ("Blood Jelly", 20, 30, 10, "Gummy Fangs", "Ice"),
   new Monster ("B.A. The Dragon", 10, 10, 10, "Dragon Breath", "Physical"),
   new Monster ("Sun o' vavich", 50, 60, 70, "Arrrghh"),
   new Monster ("HU Roach", 80, 4, 8, "Existing"),
   new Monster ("Zombie Drumpf", 100, 80, 30, "Eat American Brains again..."),
   };
  
  // Sends Monster to main method
   static Monster getMonster(int monsterIndex) {
      Monster current = monsters[monsterIndex];
      return new Monster(current.Name, current.hitPoints, current.damage, current.speed, current.attack, current.weakness);
   }
   
   /*static Monster getMonster(int monsterIndex) {
      Monster current = monsters[monsterIndex];
      return new Monster(current.Name, current.hitPoints, current.damage, current.speed, current.attack);
   }*/
}