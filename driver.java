
import java.util.*;
public class driver{

       public static void main(String args[]){
          
           Scanner inputOne = new Scanner(System.in);
           
           int x = 0;
           int y = 0;
           
           System.out.println("How many rows would you like there to be? ");
           
           x = inputOne.nextInt();
           System.out.println("How many collums would you like there to be? ");
           
           y = inputOne.nextInt();
           visibleSBoard one = new visibleSBoard(x,y);
           shipBoard pOne = new shipBoard(x,y);
           
           boolean oneSelect = false;
           
           
           
           while(!oneSelect){
               
               game.printShipBoard(pOne);
               
            }
           
           
        }




}    