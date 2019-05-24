
import java.util.*;
public class driver{

       public static void main(String args[]){
          
           Scanner inputOne = new Scanner(System.in);
           boolean check = true;
           int x = 0;
           int y = 0;
           
           System.out.println("How many rows would you like there to be? ");
           
           x = inputOne.nextInt();
           game.clear();
           System.out.println("How many collums would you like there to be? ");
           
           y = inputOne.nextInt();
           game.clear();
           visibleSBoard one = new visibleSBoard(x,y);
           visibleSBoard Tone = new visibleSBoard(x,y);
           shipBoard pOne = new shipBoard(x,y);
           
           visibleSBoard two = new visibleSBoard(x,y);
           visibleSBoard Ttwo = new visibleSBoard(x,y);
           shipBoard pTwo = new shipBoard(x,y);
           
           
           game.setShips(pOne, one);
           game.transition();
           game.setShips(pTwo,two);
           game.transition();
           while(game.isWinner(pOne,pTwo) == 0){
               
               
               
               
               
               
            }
           
           
        }




}    