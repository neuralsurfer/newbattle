import java.awt.*;
import javax.swing.*;
import java.util.*;
public class Battleship extends JFrame
{
    JPanel p = new JPanel();
    button[] grid = new button[100];
    public static void main( String[] args )
    {
        new Battleship();
    }
    
    public Battleship()
    {
        setName( "Battleship" );
        setSize( 1000, 1000 );
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        setLayout( new GridLayout(10, 10) );
        for( int i = 0; i < 100; i++ )
        {
            grid[i] = new button();
            add(grid[i]);
        }
        add(p);
        setVisible(true);
    }
}
