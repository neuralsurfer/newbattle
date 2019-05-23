import java.awt.*;
import javax.swing.*;
import java.util.*;
public class Battleship extends JPanel
{
    JPanel p = new JPanel();
    button[] grid = new button[10];
    public static void main( String[] args )
    {
        new Battleship();
    }
    
    public Battleship()
    {
        setName( "Battleship" );
        setSize( 1600, 1600 );
        //setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        p.setLayout( new GridLayout(10, 10) );
        for( int i = 0; i < 100; i++ )
        {
            button[i] = new button();
            p.add(button[i]);
        }
        add(p);
        setVisible(true);
    }
}
