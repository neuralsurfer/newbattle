import java.awt.*;
import javax.swing.*;
import java.util.*;
public class Battleship extends JFrame
{
    JPanel p = new JPanel();
    button[] grid = new button[121];
    public static void main( String[] args )
    {
        new Battleship();
    }
    
    public Battleship()
    {
        setName( "Battleship" );
        setSize( 1210, 1210 );
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout( new GridLayout( 11, 11, 1, 1) );
        for( int i = 0; i < 121; i++ )
        {
            if( i < 11 )
            {    
                JLabel label = new JLabel( "bottom text");
                add(label);
            }
                
            else
            {
                grid[i] = new button();
                add(grid[i]);
            }
        }
        add(p);
        setVisible(true);
    }
}
