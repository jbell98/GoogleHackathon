public class Consumables
{
   private String name;
   private int points;
   private String effect;

   public Consumables(String name, int points, String effect)
   {
      this.name = name;
      this.points = points;
      this.effect = effect;
   }

   public Consumables(String name, String effect)
   {
      this.name = name;
      this.effect = effect;
   }
   
   public int restoreHLT()
   {
      return 0;
   }
   
   public int restoreNRG()
   {
      return 0;
   }
   
   public void cureBLD()
   {
   }
   
   public void curePSN()
   {
   
   }
   
   public void cureSLC()
   {
      
   }
   
   static Consumables[] consumables = [
   new Consumables("Health Pack", 25, "Restore Health"),
   new Consumables("Health Kit", 50, "Restore Health"),
   new Consumables("Micro Generator", 20, "Restore Energy"),
   new Consumables("Small Battery", 10, "Restore Energy"),
   new Consumables("Eyedrops", "Cure Blind"),
   new Consumables("Antidote", "Cure Poison"),
   new Consumables("Driver", "Cure Silcnce"),
   new Consumables("Spoiled Loaf", 5, "Well... At least it won't kill you."),
   new Consumables("Cheese?", 5, "Considering cows aren't a thing anymore,\n I can't affirm if this is really cheese."),
   new Consumables("Expired Water", 10, "Best Before \n 08 Nov 2016"),
   new Consumables("Purified Water", 20, "Boiling Hot. Just the way you like it")
   };
   
}
