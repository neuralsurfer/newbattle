

public class visibleSBoard{


    String[][] value;

    public visibleSBoard(int x, int y){
        value = new String[x][y];
        
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                value[i][j] = null;
                
                
            }
            
            
            
        }
        
        
    }

    public void setVisible(int r, int c, int len, int rotation){
        
        for(int i = 0; i < len; i++){
                if(rotation == 0){
                    
                    value[r][c] = "\u25A1";
                    r++;
                }
                   if(rotation == 1){
                    
                    value[r][c] = "\u25A1";
                    c--;
                }    
                       
            }
            
        for(int i = 0; i < len; i++){
                if(rotation == 2){
                    
                    value[r][c] = "\u25A1";
                    r--;
                }
                   if(rotation == 3){
                    
                    value[r][c] = "\u25A1";
                    c++;
                }    
                       
            }    
        
        
        
    }
    public boolean isValid(int x, int y){
        
        return x < value.length && x > -1 && y < value[0].length && y > -1 && value[x][y] == null;
        
        
        
    }
    
    public void printVisibleBoard(){
        
        for(int r = 0; r < value.length; r++){
            System.out.println("_________________________________________");
            for(int c = 0; c < value[0].length; c++){
                
                
                System.out.print("|");
                
                if(value[r][c] != null){
                    System.out.print(value[r][c]);
                    
                }
                else{
                    System.out.print(" ");
                }
                System.out.print("|   ");
                
            }
            System.out.println("\n");
            }
            
            
            
        }
        
    }
    

   