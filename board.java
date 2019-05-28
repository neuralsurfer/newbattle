import java.awt.*;
import javax.swing.*;
import java.util.*;
public class board extends JFrame
{
    int border = 11;
    JPanel p = new JPanel();
    button[][] grid = new button[border*2][border];
    String columnLabel = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    int counter = 0, rowLabel = 1;
    
    public static void main( String[] args )
    {
        new board();
    }
    
    public board()
    {
        setName( "board" );
        setSize( 600, 1200 );
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout( new GridLayout( border*2 + 1, border + 1, 1, 1) );
        for( int i = 0; i < grid.length; i++ )
        {
            for( int j = 0; j < grid[i].length; j++ )
            {
                if( i == 0 || i == border)
                {    
                     if( counter == border )
                        counter = 0;
                     String temp = columnLabel.substring( counter, counter + 1 );
                     counter++;
                     JLabel label = new JLabel( temp, SwingConstants.CENTER );
                     add(label);
                }               
                else if ( j == 0 )
                {
                     if( rowLabel == border )
                        rowLabel = 1;
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
