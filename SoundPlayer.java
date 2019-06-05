import java.io.*;
import sun.audio.*;
import java.util.*;
public class SoundPlayer
{
    ArrayList<String> hit = new ArrayList<String>();
    ArrayList<String> gsunk = new ArrayList<String>();
    ArrayList<String> bsunk = new ArrayList<String>();
    ArrayList<String> miss = new ArrayList<String>();
    ArrayList<String> win = new ArrayList<String>();
    ArrayList<String> lose = new ArrayList<String>();
    int randNum;
    public SoundPlayer()
    {
        hit.add( "clang.wav" );
        hit.add( "oof.wav" );
        hit.add( "wow.wav" );
        hit.add( "hitmark.wav" );
        hit.add( "hit-or-miss.wav" );
        miss.add( "mariomiss.wav" );
        miss.add( "bruh.wav" );
        miss.add( "ohno.wav" );
        miss.add( "adminhelp.wav" );
        miss.add( "clownhorn.wav" );
        gsunk.add( "fbi.wav" );
        bsunk.add( "sadviolin.wav" );
        bsunk.add( "jono.wav" );
        win.add( "sans.wav" );
        win.add( "bangindonk.wav" );
        win.add( "torture.wav" );
        lose.add( "clownmusic.wav" );
        lose.add( "dog.wav" );
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
    public void bsunkSound() throws Exception
    {
        randNum = (int)( Math.random() * bsunk.size() );
        player( bsunk.get( randNum ) );
    }
    public void gsunkSound() throws Exception
    {
        randNum = (int)( Math.random() * gsunk.size() );
        player( gsunk.get( randNum ) );
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