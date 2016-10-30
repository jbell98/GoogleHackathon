public class Consumable
{
   private String name;
   private int healthPoints;
   private int energyPoints;
   private String effect;

   public Consumable(String name, int healthPoints, int energyPoints, String effect)
   {
      this.name = name;
      this.healthPoints = healthPoints;
      this.energyPoints = energyPoints;
      this.effect = effect;
   }

   public Consumable(String name, String effect)
   {
      this.name = name;
      this.effect = effect;
   }
   
   //Sends the creature selected to the main method 
   
   
   public int heal()
   {
      return healthPoints;
   }
   
   public int recharge()
   {
      return energyPoints;
   }
   
   static Consumable[] consumables = {
   new Consumable("Health Pack", 25, 0, "Restores some Health"),
   new Consumable("Health Kit", 50, 0, "Restores a lot of Health"),
   new Consumable("Bandage", 10, 0, "Restores a little Health"),
   new Consumable("Fist Aid Kit", 1000, 0, "Completely Heals Hero"),
   new Consumable("Micro Generator", 0, 20, "Restore Energy"),
   new Consumable("Large Battery", 0, 10, "Restores some Energy"),
   new Consumable("Small Battery", 0, 5, "Restore Energy"),
   new Consumable("Eyedrops", "Cure Blind"),
   new Consumable("Antidote", "Cure Poison"),
   new Consumable("Driver", "Cure Silcnce"),
   new Consumable("Banana", 5, 5, "Yes it did. Don't ask how"),
   new Consumable("Spoiled Loaf", 5, 0, "Well... At least it won't kill you."),
   new Consumable("Cheese?", 5, 0, "Considering cows aren't a thing anymore,\n I can't affirm if this is really cheese."),
   new Consumable("Expired Water", 10, 0, "Best Before \n 08 Nov 2016"),
   new Consumable("Purified Water", 20, 0, "Boiling Hot. Just the way you like it")
   };
   
   // Makes Consumibles Accessible
   public Consumable getConsumable(int consumeIndex) {
      Consumable current = consumables[consumeIndex];
      return new Consumable(current.name, current.healthPoints, current.energyPoints, current.effect);
   }   
}