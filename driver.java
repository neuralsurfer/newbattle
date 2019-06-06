
import java.util.*;
public class driver{

       public static void main(String args[]) throws Exception {
          int temp = 0;
           Scanner inputOne = new Scanner(System.in);
           boolean check = false;
           int x = 0;
           int y = 0;
           SoundPlayer play = new SoundPlayer();
            System.out.println("Welcome to Battleship Meme Edition!\u00A9 Made by: Shaun Diem-Lane, Kevin Kersey, and Aaron Lee\n\nInstructions:\n\t"+
            "You can either play with 2 players or an AI which can be set to be extremely easy to beat to virtually impossible to beat."+
            "\n\tYou can enter your ships in manually or have them placed automatically, on each turn enter the row and column of the ship you wish to fire at."+
            "\n\tA number represents a ship and the quanitity represents its original length, an \"O\" represents a shot that missed,\n\ta \"X\" represents a shot that was hit, and a \"-\" represents a ship that has been sunk."+
            "\n\tWhen you see two boards, the bottom board represents your ships and any marks represent the hits and misses the enemy has made on your ships."+
            "\n\tThe top board is your targeting board and marks represent the hits and misses you have made on the enemy board."+
            "\n\tThe first player to sink all enemy ships wins! Have fun!\n");
            
           while(!check){
           System.out.println("How many rows would you like there to be? Min 6, Max 20\n ");
           
           x = inputOne.nextInt();
           
           System.out.println("\nHow many columns would you like there to be? Min 6, Max 20\n ");
           
           y = inputOne.nextInt();
           if(x > 5 && x <21 && y > 5 && y < 21){
               check = true;
               
            }
            else{
                System.out.println("\nThat isn't a valid board size\n");
                
            }
        }
        
        
           game.clear();
           
           System.out.println("Would you like to play with an AI or with two players? (Enter 1 for AI, 2 for two players)\n");
           temp = inputOne.nextInt();
           while(temp != 1 && temp != 2) {
               System.out.println("Not a valid input\n");
               System.out.println("Would you like to play with an AI or with two players? (Enter 1 for AI, 2 for two players)\n");
               temp = inputOne.nextInt();
            }
           if(temp==2){
               game.clear();
           visibleSBoard one = new visibleSBoard(x,y);
           visibleSBoard tOne = new visibleSBoard(x,y);
           shipBoard pOne = new shipBoard(x,y);
           
           visibleSBoard two = new visibleSBoard(x,y);
           visibleSBoard tTwo = new visibleSBoard(x,y);
           shipBoard pTwo = new shipBoard(x,y);
           boolean tester = false;
           int temp2 = 0;
           while(!tester){
           System.out.println("Player One, would you like to manually place your ships or have it be done automatically? Enter 1 for manual, 2 for automatic)\n");
           temp2 = inputOne.nextInt();
           if(temp2 == 1 || temp2 == 2){
               tester = true;
            }
            else{
                System.out.println("\nNot a valid response\n");
            }
        }
           if(temp2 == 1)game.setShips(pOne, one);
           else if(temp2 == 2){
               
               pOne.set(one);
               System.out.println("\nShips have been placed\n");
            }
           game.transition();
           
           temp2 = 0;
           tester = false;
              while(!tester){
           System.out.println("Player Two, would you like to manually place your ships or have it be done automatically? Enter 1 for manual, 2 for automatic)\n");
           temp2 = inputOne.nextInt();
           if(temp2 == 1 || temp2 == 2){
               tester = true;
            }
            else{
                System.out.println("\nNot a valid response\n");
            }
        }
        
           if(temp2 == 1)game.setShips(pTwo,two);
           else if(temp2 == 2){pTwo.set(two);
               System.out.println("\nShips have been placed\n");
               
            }
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
            while(d < 1 || d > 11){
            System.out.println("\nEnter difficulty level, 1-11 (1-3 is easy, 4-6 is medium, 7-8 is hard, 9-10 is near impossible, I promise you will lose if you pick 11).\n");
            
            d =  inputOne.nextInt();
            if(d<1||d>11) System.out.println("\nThat isn't a valid difficulty level\n");
            
            
        }
        game.clear();
            visibleSBoard one = new visibleSBoard(x,y);
           visibleSBoard tOne = new visibleSBoard(x,y);
           shipBoard pOne = new shipBoard(x,y);
            
            visibleSBoard two = new visibleSBoard(x,y);
           visibleSBoard tTwo = new visibleSBoard(x,y);
           shipBoard pTwo = new shipBoard(x,y);
           
           AI ar = new AI(pTwo, pOne, two, one,d);
           boolean tester = false;
           int temp2 = 0;
           while(!tester){
           System.out.println("Player One, would you like to manually place your ships or have it be done automatically? Enter 1 for manual, 2 for automatic)\n");
           temp2 = inputOne.nextInt();
           if(temp2 == 1 || temp2 == 2){
               tester = true;
            }
            else{
                System.out.println("\nNot a valid response\n");
            }
        }
           if(temp2 == 1)game.setShips(pOne, one);
           else if(temp2 == 2){
               
               pOne.set(one);
               System.out.println("\nShips have been placed\n");
            }
           game.clear();
           ar.set();
           game.playAI(pOne,one,tOne,pTwo,two,ar);
           
            System.out.println("\n\nPlayer One Board\n");
        one.printVisibleBoard();
        System.out.println("\n\nAI Board\n");
        two.printVisibleBoard();
          if(game.isWinner(pOne,pTwo) == 1){
               
               System.out.println("\n\tPlayer One has won the game!");
               play.winSound();
            }
            else{
                play.loseSound();
               System.out.println("\n\tThe AI has won the game!"); 
               
        }
        
        
        }
        


    }

}    