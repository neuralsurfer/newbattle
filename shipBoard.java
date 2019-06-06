
import java.util.ArrayList;
public class shipBoard{

    shipTile[][] game;
    int[] len = {5,4,3,3,2};
    public shipBoard(int x, int y){
        
        game = new shipTile[x][y];
        
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                game[i][j] = null;
                
                
            }
            
            
            
        }
        
        
    }
    public int getLen(){
        
        return game.length;
        
        
    }
    public int get0Len(){
        
        return game[0].length;
        
    }
    public boolean isValid(int r, int c){
        
       
        return game[r][c] != null && !game[r][c].isShot();
        
        
    }
    public shipTile[][] getShipBoard(){
        
        return game;
        
    }
    public boolean isValid(int r, int c, int l){
        boolean check = false;
        for(int i: len){
            if(i == l) check = true;
            
        }
        return r < game.length && r > -1 && c < game[0].length && c > -1 && game[r][c] == null && check ;
        
        
    }
    
    public int setShip(boolean i,int r1, int c1, int r2, int c2){
        
        int diffH = Math.abs(r1 - r2);
        
        int diffLen = Math.abs(c1-2);
         
        int max = Math.max(diffH, diffLen);
        int counter = 0;
        for(int r = Math.min(r1,r2); r < game.length; r++){
            for(int c = Math.min(c1,c2); c < game[0].length; c++){
                //implement isValid
                
            }
            
            
        }
        return -1;
    }
    public int[] findINVALID(visibleSBoard input){
        int counter = 0;
        for(int r = 0; r < game.length; r++){
            for(int c = 0; c <game[0].length; c++){
                if(game[r][c] == null && input.isValid(r,c)){
                    
                    counter++;
                    
                }
                
                
                
            }
            
            
            
        }
        
        
        int[] temp = new int[counter];
        int[] tempY = new int[counter];
        counter = 0;
        for(int r = 0; r < game.length; r++){
            for(int c = 0; c <game[0].length; c++){
                
                if(game[r][c] == null && input.isValid(r,c)){
                    temp[counter] = r;
                    tempY[counter] = c;
                    counter++;
                }
                
                
            }
            
            
            
        }
        if(temp.length == 0){
            
            return find();
        }
         int index = (int)(Math.random()*temp.length);
         
         int[] output = {temp[index],tempY[index]};
         return output;
        
        
        
        
    }
    public int[] find(){
        int counter = 0;
        for(int r = 0; r < game.length; r++){
            for(int c = 0; c <game[0].length; c++){
                if(isValid(r,c)){
                    
                    counter++;
                    
                }
                
                
                
            }
            
            
            
        }
        
        
        int[] temp = new int[counter];
        int[] tempY = new int[counter];
        counter = 0;
        for(int r = 0; r < game.length; r++){
            for(int c = 0; c <game[0].length; c++){
                
                if(isValid(r,c)){
                    temp[counter] = r;
                    tempY[counter] = c;
                    counter++;
                }
                
                
            }
            
            
            
        }
         int index = (int)(Math.random()*temp.length);
         
         int[] output = {temp[index],tempY[index]};
         return output;
        
    }
    public void set(visibleSBoard input){
        
        
         int oneLen = 5;
            int tempX = 0;
            int tempY = 0;
            int rotation = 0;
            boolean check = true;
            boolean checkThree = false;
            
         
            while(oneLen >=2){
               check = true;
               tempX = (int)(Math.random()*getLen());
               tempY = (int)(Math.random()*get0Len());
               rotation = (int)(Math.random()*4);
               int counter = tempX;
               int counterY = tempY;
               if(rotation == 0 || rotation == 1){
               for(int i = 0; i < oneLen; i++){
                   
                   if(rotation == 0 && !input.isValid(counter,tempY)){
                      
                       check = false;
                      
                    }
                   if(rotation == 1 && !input.isValid(tempX,counterY)){
                       
                       check = false;
                      
                    }
                    
                    if(rotation == 0)counter++;
                   if(rotation == 1) counterY--;
                }
            }
            else if(rotation == 2 || rotation == 3){
                
                for(int i = 0; i < oneLen; i++){
                   
                   if(rotation == 2 && !input.isValid(counter,tempY)){
                       
                       check = false;
                     
                    }
                   if(rotation == 3 && !input.isValid(tempX,counterY)){
                       
                       check = false;
                      
                    }
                   
                   if(rotation == 2)counter--;
                   if(rotation == 3) counterY++;
                }
                
                
            }
            else{
                check = false;
                
            }
            
               if(check){
                   
                   input.setVisible(tempX,tempY,oneLen,rotation); 
                   setShip(tempX,tempY,oneLen,rotation);
                   if(!checkThree && oneLen == 3){
                       checkThree = true;
                    }
                   
                    
                    else{
                    oneLen--;
                    
                   }
                }
              
              
               
              
              
                 
                
              
               
                
               
                
                
            }
        
        
    }
    public void setShip(int r, int c, int le, int rotate){
        
         ship boat = new ship(le);
         if(rotate == 0 || rotate == 1){
              
                for(int i = 0; i < le; i++){
             
             
                    if(rotate == 0 ){
                      
                      game[r][c] = new shipTile(boat);
                      boat.addX(i,r);
                      boat.addY(i,c);
                      r++;
                    }
                   if(rotate == 1 ){
                       
                      game[r][c] = new shipTile(boat);
                      boat.addX(i,r);
                      boat.addY(i,c);
                      c--;
                    }
                   
                }
             
            }
            if(rotate == 2 || rotate == 3){
              
                for(int i = 0; i < le; i++){
             
             
                    if(rotate == 2 ){
                      
                      game[r][c] = new shipTile(boat);
                      boat.addX(i,r);
                      boat.addY(i,c);
                      r--;
                    }
                   if(rotate == 3 ){
                       
                      game[r][c] = new shipTile(boat);
                      boat.addX(i,r);
                      boat.addY(i,c);
                      c++;
                    }
                   
                }
             
            }
            
        
    }

    public shipTile getTile(int x, int y){
        
        return game[x][y];
    }
    
    





}    