
import java.util.*;
public class driver{

       public static void main(String args[]){
          
           Scanner inputOne = new Scanner(System.in);
           boolean check = true;
           int x = 0;
           int y = 0;
           int oneLen = 5;
           int tempX = 0;
           int tempY = 0;
           int rotation = 0;
           System.out.println("How many rows would you like there to be? ");
           
           x = inputOne.nextInt();
           System.out.println("How many collums would you like there to be? ");
           
           y = inputOne.nextInt();
           visibleSBoard one = new visibleSBoard(x,y);
           shipBoard pOne = new shipBoard(x,y);
           
           
           
           
           
           
           while(oneLen >=2){
               
              
               System.out.println();
               one.printVisibleBoard();
               
               System.out.println("Enter the row of bow the  of the ship of length " + oneLen);
               tempX = inputOne.nextInt();
               
               System.out.println("Enter the collum of the bow of the ship of length " + oneLen);
               tempY = inputOne.nextInt();
               
               System.out.println("Enter the rotation of the ship of " + oneLen + "\n"
               +"(0 for vertical with bow at top, 1 for horizontal with bow at right,\ntwo for vertical with bow at bottom, 3 for horizontal with bow at the left");
               
               
               rotation = inputOne.nextInt();
               int counter = tempX;
               if(rotation == 0 || rotation == 1){
               for(int i = 0; i < oneLen; i++){
                   
                   if(rotation == 0 && !one.isValid(counter,tempY)){
                       System.out.println("That isn't a valid ship index, enter a different one in");
                       check = false;
                    }
                   if(rotation == 1 && !one.isValid(tempX,counter)){
                       System.out.println("That isn't a valid ship index, enter a different one in");
                       check = false;
                    }
                   counter++;
                   
                }
            }
            if(rotation == 2 || rotation == 3){
                
                for(int i = 0; i < oneLen; i++){
                   
                   if(rotation == 2 && !one.isValid(counter,tempY)){
                       System.out.println("That isn't a valid ship index, enter a different one in");
                       check = false;
                    }
                   if(rotation == 3 && !one.isValid(tempX,counter)){
                       System.out.println("That isn't a valid ship index, enter a different one in");
                       check = false;
                    }
                   counter--;
                   
                }
                
                
            }
            
               if(check){
                   
                   one.setVisible(tempX,tempY,oneLen,rotation); 
                   oneLen--;
                   
                }
                
                
               
            }
           
           
        }




}    