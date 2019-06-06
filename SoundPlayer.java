import java.io.*;
import sun.audio.*;
import java.util.*;
public class SoundPlayer
{
    //array lists containing all the sounds for the games
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
        bsunk.add("fine.wav");
        ghit.add( "hit-or-miss.wav" );
        ghit.add("kachowLit.wav");
        bsunk.add("fissionmailed.wav");
        gmiss.add("clownhorn.wav");
        gmiss.add("water.wav");
        gmiss.add("oof.wav");
        bmiss.add("oof.wav");
        bhit.add("clang.wav");
        gsunk.add("dog.wav");
        bsunk.add("ohno.wav");
        bmiss.add("fissionmailed.wav");
        bmiss.add("mariomiss.wav");
        bsunk.add( "bruh.wav" );
        bmiss.add("water.wav");
        bhit.add("oof.wav");
        bsunk.add("sad.wav");
        lose.add("sad.wav");
        gsunk.add("star.wav");
        bmiss.add( "adminhelp.wav" );
        bmiss.add( "clownhorn.wav" );
        gsunk.add( "fbi.wav" );
        bhit.add("sansh.wav");
        bsunk.add( "sadviolin.wav" );
        bsunk.add( "jono.wav" );
        bsunk.add("lionKingMeme.wav");
        gsunk.add( "sans.wav" );
        win.add( "bangindonk.wav" );
        win.add( "torture.wav" );
        lose.add( "clownmusic.wav" );
        lose.add( "dog.wav" );
        gsunk.add("oldmanScream.wav");
        ghit.add("beans.wav");
        bsunk.add("rave.wav");
        win.add("dancinS.wav");
    } //initializes all sounds
    public void player( String type ) throws Exception
    {
        String file = "Audio/" + type;
        
        InputStream in = new FileInputStream( file );
         
        AudioStream audioStream = new AudioStream( in );
        
        AudioPlayer.player.start( audioStream );
    } //prepares the sound file for playing, then plays it
    public void ghitSound() throws Exception
    {
        randNum = (int)( Math.random() * ghit.size() );
        player( ghit.get( randNum ) );
    } //generates good hit sound
    public void bhitSound() throws Exception
    {
        randNum = (int)( Math.random() * bhit.size() );
        player( bhit.get( randNum ) );
    } //generates bad hit sound
    public void bsunkSound() throws Exception
    {
        randNum = (int)( Math.random() * bsunk.size() );
        player( bsunk.get( randNum ) );
    } //generates bad sunk sound
    public void gsunkSound() throws Exception
    {
        randNum = (int)( Math.random() * gsunk.size() );
        player( gsunk.get( randNum ) );
    } //generates good sunk sound
    public void bmissSound() throws Exception
    {
        randNum = (int)( Math.random() * bmiss.size() );
        player( bmiss.get( randNum ) );
    } //generates bad miss sound
    public void gmissSound() throws Exception
    {
        randNum = (int)( Math.random() * gmiss.size() );
        player( gmiss.get( randNum ) );
    } //generates good miss sound
    public void winSound() throws Exception
    {
        randNum = (int)( Math.random() * win.size() );
        player( win.get( randNum ) );
    } //generates win sound
    public void loseSound() throws Exception
    {
        randNum = (int)( Math.random() * lose.size() );
        player( lose.get( randNum ) );
    } //generates lose sound
}//end class