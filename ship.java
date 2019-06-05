
public class ship{
    
    int health;
    int[] x;
    int[] y;
    public ship(int h){
        health = h;
        x = new int[health];
        y = new int[health];
    }
    
    public void hit(visibleSBoard r, visibleSBoard j){
        health--;
        if(health == 0){
            for(int i = 0; i < x.length;i++){
                
               r.setVisible(x[i],y[i],"-"); 
               j.setVisible(x[i],y[i],"-"); 
                
            }
            
            
            
            
        }
    }
    public void hit(visibleSBoard r){
        health--;
        if(health == 0){
            for(int i = 0; i < x.length;i++){
                
               r.setVisible(x[i],y[i],"-"); 
               
                
            }
            
            
            
            
        }
    }
    public void addX(int index, int input){
        
        x[index] = input;
        
    }
    public void addY(int index, int input){
        y[index] = input;
        
    }
    public int getX(int index){
        
        return x[index];
        
    }
    public int getY(int index){
        
        
        return y[index];
        
    }
    public int getHealth(){
        
        
        return health;
    }
    
    
}
    
    