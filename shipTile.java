

public class shipTile{
    
    
    
    
    boolean shot;
    
    ship ref;
    public shipTile(){
        ref = null;
        shot = false;
        
        
    }
    public shipTile(ship i){
        
        
        ref = i;
        shot = false;
    }
    
    public void shoot(){
        
        shot = true;
        ref.hit();
        
    }
    
    public boolean isShot(){
        
        return shot;
        
    }
    public ship getRef(){
        return ref;
        
    }
}
    