public class Inventory extends Hero
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
      
   public Weapon equipWeapon()
   {      
      return weapon;
   }
      
   static class ProtoGauntlet
   {
      String element;
      private int energy;
      
      public ProtoGauntlet()
      {
         energy = 20;
      }
   
      public int GreekFlame()
      {
      
      }
   
      public int AbsZeroBlast()
      {
      
      }
   
      public int LightStrike()
      {
      
      }
   
      public int ZuesStrike()
      {
      
      }
   
   }
}
