import java.util.*;

public class Hero
{
   private String name;
   private Inventory inventory;
   
   private int maxHealth;
   private int hitpoints;   
   private int baseDamage;
   private int damage;
   private int defense;
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
      defense = 0;
      
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
         Weapon currentWeapon = inventory.getWeapon(weaponIndex);
         this.damage += currentWeapon.getDamage();
         this.speed += currentWeapon.getSpeed();
         weaponEquipped = true;
      }
      else{
      
         damage -= currentWeapon.getDamage();
         speed -= currentWeapon.getSpeed();
      
         currentWeapon = inventory.getWeapon(weaponIndex);
         this.damage += currentWeapon.getDamage();
         this.speed += currentWeapon.getSpeed();
         weaponEquipped = true;
      }   
   }
      
   public void equipArmor(int armorIndex)
   {
      if (armorEquipped == false){
         Armor currentArmor = inventory.getArmor(armorIndex);
         defense += currentArmor.getDefense();
         speed += currentArmor.getSpeed();
         armorEquipped = true;
      }
      else{
      
         damage -= currentArmor.getDefense();
         speed -= currentArmor.getSpeed();
      
         currentArmor = inventory.getArmor(armorIndex);
         damage += currentArmor.getDefense();
         speed += currentArmor.getSpeed();
         armorEquipped = true;
      }  
   }
}
