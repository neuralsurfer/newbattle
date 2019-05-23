


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

    public static void printShipBoard(shipBoard i){
        shipTile[][] o = i.getShipBoard();
        for(int r = 0; r < o.length; r++){
            for(int c = 0; c < o.length; c++){
                if(r%2 == 0){
                    System.out.print("-");
                     
                }
                else if(o[r][c] != null){
                System.out.print("| "+  o[r][c].value() + " |");
                
            }
            }
            
            
            
        }
        
    }




}    