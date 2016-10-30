import javax.swing.JOptionPane;
import java.util.*;
public class trumpCard
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      String openingD = JOptionPane.showInputDialog("Following the day after Trump's election the world quickly fell to diseray." +
                         "\nTrump siphoned money from education institutuions around the world  so nobody" +
                         "\ncould compete against his presidency America fell ignorant, reverting to a stone age" +
                         "\nera of time thanks to the inability to use modern technology. In other words" +
                         "\nThe world forgot how to work. A secrert oginization known only as People Against The Tyranny of Drump" +
                         "\nRose to fight against trump who blew up using all the stolen money to create a radiation powered mech suit" +
                         "\nto battle those bad hombres, but inevitably it blew up mutating and changing the wasteland we once called our home" +
                         "\nnow you must battle our way through the creatures left here in order to survive.");
                         
      String greeting = JOptionPane.showInputDialog("Greetings new recruit welcome to the outland what might your" + 
                                                    "name be?");
      
      String name = keyboard.nextLine();
      
      String dumb = JOptionPane.showInputDialog("Wow..... thats a dumb name, im just gonna call you player 1");
      String intro = JOptionPane.showInputDialog("Well player 1 welcome to the last days of your life, this is the UST" +
                                                 "\nOnce known as the United States of America now known as the United States of Trump" +
                                                 "\nThe world is a shadow of its former self full of mutants, giant creatures, and general ner do wells" +
                                                 "\n So....... should be fun, good luck");
      
   }
}
      