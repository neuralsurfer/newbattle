
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
    
    public void printShipBoard(){
        
        for(int r = 0; r < game.length; r++){
            for(int c = 0; c < game[0].length; c++){
                if(r%2 == 0){
                    System.out.print("-");
                     
                }
                else if(game[r][c] != null){
                System.out.print("| "+  game[r][c].value() + " |");
                
            }
            }
            
            
            
        }
        
    }





}    