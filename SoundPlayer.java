import java.io.*;
import sun.audio.*;
import java.util.*;
//gamer
public class SoundPlayer
{
    ArrayList<String> ghit = new ArrayList<String>();
    ArrayList<String> gsunk = new ArrayList<String>();
    ArrayList<String> bsunk = new ArrayList<String>();
    ArrayList<String> gmiss = new ArrayList<String>();
    ArrayList<String> win = new ArrayList<String>();
    ArrayList<String> lose = new ArrayList<String>();
    ArrayList<String> bhit = new ArrayList<String>();
    ArrayList<String> bmiss = new ArrayList<String>();
    int randNum;
    public SoundPlayer()
    {
        ghit.add( "clang.wav" );
        ghit.add( "oof.wav" );
        gsunk.add("dancinS.wav");
        ghit.add( "hitmark.wav" );
        ghit.add( "hit-or-miss.wav" );
        ghit.add("kachowLit.wav");
        gmiss.add("bruh.wav");
        bmiss.add("oof.wav");
        bmiss.add( "mariomiss.wav" );
        bmiss.add( "bruh.wav" );
        bmiss.add( "ohno.wav" );
        bhit.add("ohno.wav");
        bmiss.add( "adminhelp.wav" );
        bmiss.add( "clownhorn.wav" );
        gsunk.add( "fbi.wav" );
        bsunk.add( "sadviolin.wav" );
        bsunk.add( "jono.wav" );
        bsunk.add("lionKingMeme.wav");
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
    public void ghitSound() throws Exception
    {
        randNum = (int)( Math.random() * ghit.size() );
        player( ghit.get( randNum ) );
    }
    public void bhitSound() throws Exception
    {
        randNum = (int)( Math.random() * bhit.size() );
        player( bhit.get( randNum ) );
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
    public void bmissSound() throws Exception
    {
        randNum = (int)( Math.random() * bmiss.size() );
        player( bmiss.get( randNum ) );
    }
    public void gmissSound() throws Exception
    {
        randNum = (int)( Math.random() * gmiss.size() );
        player( gmiss.get( randNum ) );
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