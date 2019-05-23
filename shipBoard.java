
public class shipBoard{

    shipTile[][] game;
    
    public shipBoard(int x, int y){
        
        game = new shipTile[x][y];
        
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                game[i][j] = null;
                
                
            }
            
            
            
        }
        
        
    }
    
    public shipTile[][] getShipBoard(){
        
        return game;
        
    }
    
    
    public void setShip(int r, int c, int len, int rotate){
        
         ship boat = new ship(len);
         if(rotate == 0 || rotate == 1){
              
                for(int i = 0; i < len; i++){
             
             
                    if(rotate == 0 ){
                      
                      game[r][c] = new shipTile(boat);
                      r++;
                    }
                   if(rotate == 1 ){
                       
                      game[r][c] = new shipTile(boat);
                      c++;
                    }
                   
                }
             
            }
            if(rotate == 2 || rotate == 3){
              
                for(int i = 0; i < len; i++){
             
             
                    if(rotate == 2 ){
                      
                      game[r][c] = new shipTile(boat);
                      r--;
                    }
                   if(rotate == 3 ){
                       
                      game[r][c] = new shipTile(boat);
                      c--;
                    }
                   
                }
             
            }
            
        
    }

    public shipTile getTile(int x, int y){
        
        return game[x][y];
    }
    
    





}    