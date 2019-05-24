import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class button extends JButton implements ActionListener
{
    ImageIcon nothing, miss, hit;
    int value = 0;
    /*
    0: nothing
    1: miss
    2: hit
    */
    
    public button()
    {
        setBackground(Color.BLUE);
        miss = new ImageIcon( this.getClass().getResource( "Miss.png" ) ); 
        hit = new ImageIcon( this.getClass().getResource( "Hit.png" ) );
        this.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        value++;
        value %= 3;
        switch(value)
        {
            case 0:
                setIcon(null);
                break;
            case 1:
                setIcon(miss);
                break;
            case 2:
                setIcon(hit);
                break;
        }
    }
}