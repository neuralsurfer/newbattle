
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
    
    public void setShip(int r, int c, shipTile i){
        
        game[r][c] = i;
        
    }

    public shipTile getTile(int x, int y){
        
        return game[x][y];
    }
    
    





}    