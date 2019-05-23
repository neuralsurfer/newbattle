

public class visibleSBoard{


    String[][] value;

    public visibleSBoard(int x, int y){
        value = new String[x][y];
        
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                value[i][j] = "  ";
                
                
            }
            
            
            
        }
        
        
    }

    public void setVisible(int r, int c, String i){
        
        
        value[r][c] = i;
        
        
        
    }
    public boolean isValid(int x, int y){
        
        return x < value.length && x > -1 && y < value[0].length && y > -1;
        
        
        
    }


}    