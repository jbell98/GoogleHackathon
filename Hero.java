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
      return maxHealth;
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

   private boolean weaponEquipped;
   private boolean armorEquipped;
   private Weapon currentWeapon;
   private Armor currentArmor;
   
   public void equipWeapon(int weaponIndex)
   {   
      if (weaponEquipped == false){
         Weapon currentWeapon = Inventory.getWeapon(weaponIndex);
         damage += currentWeapon.damage;
         speed += currentWeapon.speed;
         equipped = true;
      }
      else{
      
         damage -= currentWeapon.damage;
         speed -= currentWeapon.speed;
      
         currentWeapon = Inventory.getWeapon(weaponIndex);
         damage += currentWeapon.damage;
         speed += currentWeapon.speed;
         equipped = true;
      }   
   }
      
   public void equipArmor(Armor armor)
   {
      if (armorEquipped == false){
         Weapon currentWeapon = Inventory.getWeapon(weaponIndex);
         damage += currentWeapon.damage;
         speed += currentWeapon.speed;
         equipped = true;
      }
      else{
      
         damage -= currentWeapon.damage;
         speed -= currentWeapon.speed;
      
         currentWeapon = Inventory.getWeapon(weaponIndex);
         damage += currentWeapon.damage;
         speed += currentWeapon.speed;
         equipped = true;
      }  
   }
}
