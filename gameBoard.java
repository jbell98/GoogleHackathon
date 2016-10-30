import java.util.Random;

public class randomBoardGen{
    public static void main(String[] args){
    int board[][];
    Random block = new Random();
    board = new int[64][64];
        for (int row=0; row < board.length; row++){
            
            for (int col=0; col < board[0].length; col++){
               board[row][col] = block.nextInt(3);
                
            }
        return board
        }
    }
       
}

