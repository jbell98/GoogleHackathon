import java.util.Random;

class GridPoints {
   boolean blocked;
   Weapon weapon;
   Armor armor;
   Consumable consumable;
}

public class randomBoardGen{


   public static void main(String[] args){
   
      Random block = new Random();
      GridPoints board[][] = new GridPoints[64][64];
      int blockType = 0;
      
      for (int row = 0; row < board.length; row++){            
         for (int col = 0; col < board[0].length; col++) {             
            blockType = block.nextInt(2);
            if (blockType == 0)
               board[row][col].blocked = false;
            else
               board[row][col].blocked = true;
         }
      }   
      Random itemIndex = new Random();
      for(int items = 0; items <= 10; items++)
      {
         int randomRow = block.nextInt(65);
         int randomCol = block.nextInt(65);
         if(board[randomRow][randomCol].blocked == false)
         {
            int item = block.nextInt(3);
            if(blockType == 0)
               board[randomRow][randomCol].weapon = Weapon.getWeapon(itemIndex.nextInt(6));
            else if (blockType == 1) 
               board[randomRow][randomCol].armor = Armor.getArmor(itemIndex.nextInt(4));
            else
               board[randomRow][randomCol].consumable = Consumable.getConsumable(itemIndex.nextInt(6));
         }
      }
   }
}