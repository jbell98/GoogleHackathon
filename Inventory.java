import java.util.*;

public class Inventory
{
   ArrayList<Consumable> consumables = new ArrayList<Consumable>();
   ArrayList<Weapon> weapons = new ArrayList<Weapon>();
   ArrayList<Armor> armors = new ArrayList<Armor>();
         
   public void addItem(Consumable consumable)
   {
      consumables.add(consumable);
   }
   
   public void addWeapon(Weapon weapon)
   {
      weapons.add(weapon);
   }
   
   public void addArmor(Armor armor)
   {
      armors.add(armor);
   }
      
   public Weapon getWeapon(int itemIndex)
   {
   return weapons.get(itemIndex);
   }
   
   public Armor getArmor(int itemIndex)
   {
   return armors.get(itemIndex);
   }
}
