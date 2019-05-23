

public class shipTile{
    
    
    
    
    boolean shot;
    
    ship ref;
    public shipTile(ship i){
        
        
        ref = i;
        shot = false;
    }
    
    public String shoot(){
        
        shot = true;
        ref.hit();
        return "X";
    }
    public String value(){
        if(isShot()) return "X";
        
        return "\u25A1";
        
        
    }
    public boolean isShot(){
        
        return shot;
        
    }
    public ship getRef(){
        return ref;
        
    }
}
    