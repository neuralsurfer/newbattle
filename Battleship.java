import java.awt.*;
import javax.swing.*;
import java.util.*;
public class Battleship extends JFrame
{
    int border = 10;
    JPanel p = new JPanel();
    button[][] grid = new button[border][border];
    String columnLabel = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int counter = 0, rowLabel = 1;
    
    public static void main( String[] args )
    {
        new Battleship();
    }
    
    public Battleship()
    {
        setName( "CopyOfBattleship" );
        setSize( 900, 900 );
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout( new GridLayout( border + 1, border + 1, 1, 1) );
        for( int i = 0; i < grid.length; i++ )
        {
            for( int j = 0; j < grid[i].length; j++ )
            {
                if( i == 0 )
                {    
                     String temp = columnLabel.substring( counter, counter + 1 );
                     counter++;
                     JLabel label = new JLabel( temp, SwingConstants.CENTER );
                     add(label);
                }               
                else if ( j == 0 )
                {
                     JLabel label = new JLabel( String.valueOf(rowLabel), SwingConstants.CENTER );
                     rowLabel++;
                     add(label);
                }
                else
                {
                    grid[i][j] = new button( i, j );
                    add(grid[i][j]);
                }
            }
        }
        add(p);
        setVisible(true);
    }

}
