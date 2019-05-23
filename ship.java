
public class ship{
    
    int health;
    
    public ship(int h){
        health = h;
        
    }
    
    public void hit(){
        health--;
        if(health == 0){
            
         System.out.println("\nShip has been sunk");   
            
        }
    }
    public int getHealth(){
        
        
        return health;
    }
    
    
}
    
    