import java.io.*;
import sun.audio.*;
import java.util.*;
public class SoundPlayer
{
    ArrayList<String> hit = new ArrayList<String>();
    ArrayList<String> sunk = new ArrayList<String>();
    ArrayList<String> miss = new ArrayList<String>();
    ArrayList<String> win = new ArrayList<String>();
    ArrayList<String> lose = new ArrayList<String>();
    int randNum;
    public SoundPlayer()
    {
        //This part gonnna be added later so it doesn't game ya
    }
    public void player( String type ) throws Exception
    {
        String file = "Audio/" + type;
        
        InputStream in = new FileInputStream( file );
         
        AudioStream audioStream = new AudioStream( in );
        
        AudioPlayer.player.start( audioStream );
    }
    public void hitSound() throws Exception
    {
        randNum = (int)( Math.random() * hit.size() );
        player( hit.get( randNum ) );
    }
    public void sunkSound() throws Exception
    {
        randNum = (int)( Math.random() * sunk.size() );
        player( sunk.get( randNum ) );
    }
    public void missSound() throws Exception
    {
        randNum = (int)( Math.random() * miss.size() );
        player( miss.get( randNum ) );
    }
    public void winSound() throws Exception
    {
        randNum = (int)( Math.random() * win.size() );
        player( win.get( randNum ) );
    }
    public void loseSound() throws Exception
    {
        randNum = (int)( Math.random() * lose.size() );
        player( lose.get( randNum ) );
    }
}