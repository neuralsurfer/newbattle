

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
    public String getVisible(int r, int c){
        
        return value[r][c];
        
        }
    public void setVisible(int r, int c, String v){
        
        value[r][c] = v;
    
        
    }
    public void setVisible(int r, int c, int len, int rotation){
        
        for(int i = 0; i < len; i++){
                if(rotation == 0){
                    
                    value[r][c] = String.valueOf(len);
                    r++;
                }
                   if(rotation == 1){
                    
                    value[r][c] = String.valueOf(len);
                    c--;
                }    
                       
            }
            
        for(int i = 0; i < len; i++){
                if(rotation == 2){
                    
                    value[r][c] = String.valueOf(len);
                    r--;
                }
                   if(rotation == 3){
                    
                    value[r][c] = String.valueOf(len);
                    c++;
                }    
                       
            }    
        
        
        
    }
    public boolean isValid(int x, int y){
        
        return x < value.length && x > -1 && y < value[0].length && y > -1 && value[x][y] == null;
        
        
        
    }
    
    public void printVisibleBoard(){
        String[] abc = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
         
        for(int r = 0; r < value.length; r++){
           
            if(r == 0){
                System.out.print("\t");
            for(int c = 0; c < value[0].length; c++){
                
                System.out.print((c+1)+"\t");
                
                
            }
        }
         System.out.println();
            System.out.print("\t");
            for(int c = 0; c < value[0].length; c++){
                
                System.out.print("--------");
                
                
            }
           System.out.println();
           System.out.print((r+1)+"\t");
            for(int c = 0; c < value[0].length; c++){
                
                
                System.out.print("|");
                
                if(value[r][c] != null){
                    System.out.print(value[r][c]);
                    
                }
                else{
                    System.out.print(" ");
                }
                System.out.print("|\t");
                
            }
           System.out.println();
            }
             System.out.println("\n");
            
            
        }
        
    }
    

   