

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
    
    public void shoot(visibleSBoard r, visibleSBoard j){
        
        shot = true;
        ref.hit(r,j);
        
    }
    public void shoot(visibleSBoard r){
        
        shot = true;
        ref.hit(r);
        
    }
    
    public boolean isShot(){
        
        return shot;
        
    }
    
    public ship getRef(){
        return ref;
        
    }
}
    