import javax.swing.*;
import java.awt.event.*;
public class button extends JButton implements ActionListener
{
    ImageIcon hit, miss;
    int value = 0;
    /*
    0: nothing
    1: miss
    2: hit
    */
    
    public button()
    {
        miss = new ImageIcon( this.getClass().getResource( "Miss.png" ) ); 
        hit = new ImageIcon( this.getClass().getResource( "Hit.png" ) );
        this.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        value++;
        value %= 3;
    }
}