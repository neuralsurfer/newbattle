
import java.util.*;
public class driver{

       public static void main(String args[]) throws InterruptedException{
          int temp = 0;
           Scanner inputOne = new Scanner(System.in);
           boolean check = false;
           int x = 0;
           int y = 0;
           while(!check){
           System.out.println("How many rows would you like there to be? ");
           
           x = inputOne.nextInt();
           
           System.out.println("How many collums would you like there to be? ");
           
           y = inputOne.nextInt();
           if(x > 7 && x <21 && y > 7 && y < 21){
               check = true;
               
            }
            else{
                System.out.println("That isn't a valid board size");
                
            }
        }
        
        
           game.clear();
           
           System.out.println("Would you like to play with an AI or with two players? (Enter 1 for AI, 2 for two players)");
           temp = inputOne.nextInt();
           if(temp==2){
               game.clear();
           visibleSBoard one = new visibleSBoard(x,y);
           visibleSBoard tOne = new visibleSBoard(x,y);
           shipBoard pOne = new shipBoard(x,y);
           
           visibleSBoard two = new visibleSBoard(x,y);
           visibleSBoard tTwo = new visibleSBoard(x,y);
           shipBoard pTwo = new shipBoard(x,y);
           
           
           game.setShips(pOne, one);
           game.transition();
           game.setShips(pTwo,two);
           game.transition();
           
           game.play(pOne,one,tOne,pTwo,two,tTwo);
           
           System.out.println("\n\nPlayer One Board\n");
        one.printVisibleBoard();
        System.out.println("\n\nPlayer Two Board\n");
        two.printVisibleBoard();
           
           if(game.isWinner(pOne,pTwo) == 1){
               
               System.out.println("\nPlayer One has won the game!");
               
            }
            else{
                
               System.out.println("\nPlayer Two has won the game!"); 
            }
        }
        
        else{
            int d = 0;
            while(d < 1 || d > 10){
            System.out.println("Enter difficulty level, 1-10 (1-3 is easy, 4-6 is medium, 7-8 is hard, 9-10 is near impossible)");
            
            d =  inputOne.nextInt();
            if(d<1||d>10) System.out.println("That isn't a valid difficulty level\n");
            
            
        }
        game.clear();
            visibleSBoard one = new visibleSBoard(x,y);
           visibleSBoard tOne = new visibleSBoard(x,y);
           shipBoard pOne = new shipBoard(x,y);
            
            visibleSBoard two = new visibleSBoard(x,y);
           visibleSBoard tTwo = new visibleSBoard(x,y);
           shipBoard pTwo = new shipBoard(x,y);
           
           AI ar = new AI(pTwo, pOne, two, one,d);
           game.setShips(pOne,one);
           game.clear();
           ar.set();
           game.playAI(pOne,one,tOne,pTwo,two,ar);
           
            System.out.println("\n\nPlayer One Board\n");
        one.printVisibleBoard();
        System.out.println("\n\nAI Board\n");
        two.printVisibleBoard();
          if(game.isWinner(pOne,pTwo) == 1){
               
               System.out.println("\nPlayer One has won the game!");
               
            }
            else{
                
               System.out.println("\nThe AI has won the game!"); 
               
        }
        
        
        }
        


    }

}    