

import java.util.Scanner;
public class game{


    public static int isWinner(shipBoard one, shipBoard two){
        
        int countOne = 0;
        int countTwo = 0;
        
        for(int i = 0; i <one.getShipBoard().length; i++){
            for(int j = 0; j < one.getShipBoard()[0].length; j++){
                
                if(one.getShipBoard()[i][j] != null && one.getShipBoard()[i][j].getRef().getHealth() >0){
                    
                    countOne+= one.getShipBoard()[i][j].getRef().getHealth();
                }
                
                
            }
            
            
            
        }
         for(int i = 0; i <two.getShipBoard().length; i++){
            for(int j = 0; j < two.getShipBoard()[0].length; j++){
                
                if(two.getShipBoard()[i][j] != null && two.getShipBoard()[i][j].getRef().getHealth() >0){
                    
                    countTwo+= two.getShipBoard()[i][j].getRef().getHealth();
                }
                
                
            }
            
            
            
        }
        if(countTwo == 0) return 2;
        if(countOne == 0) return 1;
        return 0;
        
    }

    public static void setShips(shipBoard pOne, visibleSBoard one){
            int oneLen = 5;
            int tempX = 0;
            int tempY = 0;
            int rotation = 0;
            boolean check = true;
            Scanner inputOne = new Scanner(System.in);
            
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
                      
                       check = false;
                    }
                   if(rotation == 1 && !one.isValid(tempX,counter)){
                       
                       check = false;
                    }
                   counter++;
                   
                }
            }
            else if(rotation == 2 || rotation == 3){
                
                for(int i = 0; i < oneLen; i++){
                   
                   if(rotation == 2 && !one.isValid(counter,tempY)){
                       
                       check = false;
                    }
                   if(rotation == 3 && !one.isValid(tempX,counter)){
                       
                       check = false;
                    }
                   counter--;
                   
                }
                
                
            }
            else{
                check = false;
                
            }
               if(check){
                   
                   one.setVisible(tempX,tempY,oneLen,rotation); 
                   pOne.setShip(tempX,tempY,oneLen,rotation);
                   oneLen--;
                   
                }
                else{
                    System.out.println("That isn't a valid ship index, enter a different one in");
                    
                    
                }
               
                
                
                
                
                
            }
        
        
        
    }
    public static void transition(){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Pass the computer to the other player and hit any key once they have it");
        String str = input.nextLine();
        
    }
    


}    