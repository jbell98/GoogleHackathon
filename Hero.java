import java.util.*;

public class Hero
{
   private String name;
   
   private int maxHealth;
   private int hitpoints;   
   private int baseDamage;
   private int damage;
   private int speed;
   private int level;
   
   private int Vitality;
   private int Strength;
   private int Intelligence;
   private int Agility;

   public Hero(String name)
   {
      this.name = name;
      maxHealth = 10;
      hitpoints = maxHealth;
      
      baseDamage = 2;
      damage = baseDamage;
      Vitality = 1;
      Strength = 1;
      Intelligence = 1;
      Agility = 1;
   }
   
   public int heroMaxHealth()
   {
   return maxHealth();
   }
   
   public int heroHealth()
   {
      return hitpoints;
   }
   
   public int heroSpeed()
   {
      return speed;
   }

   public int takeDamage(int dmg)
   {
      return hitpoints - dmg;
   }

   public int damage()
   {
      return damage;
   }
   
   public void useConsumable(Consumable consumable)
   {
   
   }

   // Equips 
   public void equipWeapon(Weapon weapon)
   {
    damage += weapon.Damage();
    speed += weapon.Speed();
   }

   public void equipArmor(Armor armor)
   {
   
   }  
}
