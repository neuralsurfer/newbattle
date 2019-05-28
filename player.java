


public class player{
    
    shipBoard i;
    
    
    //refer to other player
    public player(shipBoard b){
        
        i = b;
        
        
    }
    public int fire(int r, int c){
        
      int hit = 0;
        
        if(r > -1 && r < i.getShipBoard().length && c >-1 && c < i.getShipBoard()[0].length){
            if(i.getTile(r,c) != null && !i.getTile(r,c).isShot()){
                i.getTile(r,c).shoot();
                
                hit = 2;
            }
            else if(i.getTile(r,c) == null){
                
                hit = 1;
            }
            else{
                System.out.println("This tile has been shot at before");
            }
            
        }
        else{
            System.out.println("This isn't a valid tile index");
            
        }
        
        return hit;  
        
        
    }
    
    
    
    
}