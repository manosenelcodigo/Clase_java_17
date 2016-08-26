
package graficas;

import javax.swing.JFrame;


public class Marco extends JFrame 
{
    public Marco()
    {
        setBounds(200,50,1024,768);
        setVisible(true);
        setResizable(true);
        add(new Panel3());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
