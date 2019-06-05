
import java.util.ArrayList;
public class AI{
    shipBoard pOne; 
    shipBoard e;
    visibleSBoard one;
    visibleSBoard two;
    int difficulty;
    ArrayList<String> hit;
    
    
    // e is enemies, ts is ai visible, two is enemy normal visible
    public AI(shipBoard i, shipBoard tr, visibleSBoard ts, visibleSBoard et, int r){
        
        pOne = i;
        e = tr;
        one = ts;
        difficulty = r;
        two = et;
        
    }
    public void transition(){
        
        
        
        
    }
    public int[] fire(){
        int temp = (int)(Math.random()*10);
        int second = (int)(Math.random()*4);
        int[] index;
        
        
        
        if(temp+second < difficulty+1 || difficulty == 11){
            index = e.find();
            game.fireAI(index[0],index[1],e,two);
           
        }
        else{
            index = e.findINVALID(two);
            game.fireAI(index[0],index[1],e,two);
            
            
            
            
        }
        
        
        
        return index;
        
        
        
    }
    public void set(){
        
        
         int oneLen = 5;
            int tempX = 0;
            int tempY = 0;
            int rotation = 0;
            boolean check = true;
            boolean checkThree = false;
            
         
            while(oneLen >=2){
               check = true;
               tempX = (int)(Math.random()*pOne.getLen());
               tempY = (int)(Math.random()*pOne.get0Len());
               rotation = (int)(Math.random()*4);
               int counter = tempX;
               int counterY = tempY;
               if(rotation == 0 || rotation == 1){
               for(int i = 0; i < oneLen; i++){
                   
                   if(rotation == 0 && !one.isValid(counter,tempY)){
                      
                       check = false;
                      
                    }
                   if(rotation == 1 && !one.isValid(tempX,counterY)){
                       
                       check = false;
                      
                    }
                    
                    if(rotation == 0)counter++;
                   if(rotation == 1) counterY--;
                }
            }
            else if(rotation == 2 || rotation == 3){
                
                for(int i = 0; i < oneLen; i++){
                   
                   if(rotation == 2 && !one.isValid(counter,tempY)){
                       
                       check = false;
                     
                    }
                   if(rotation == 3 && !one.isValid(tempX,counterY)){
                       
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
                   
                   one.setVisible(tempX,tempY,oneLen,rotation); 
                   pOne.setShip(tempX,tempY,oneLen,rotation);
                   if(!checkThree && oneLen == 3){
                       checkThree = true;
                    }
                   
                    
                    else{
                    oneLen--;
                    
                   }
                }
              
              
               
              
              
                 
                
              
               
                
               
                
                
            }
        
        
    }
    
    
    
    
}
    