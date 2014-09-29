import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JFrame;


public class Database342 extends JApplet implements ActionListener{
    private static final long serialVersionUID = 1L;
    
    FrontPage frontpage = new FrontPage();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Realtor Assistant");
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(800, 600);
        //frame.setBackground(new Color(180, 180, 180));
        Database342 app = new Database342();
        app.initialize();
        frame.getContentPane().add(app);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    public Database342() {
        //constructor
    }
    
    private void initialize() {
        //init values
        Container c = getContentPane();
        c.setSize(750, 550);
        c.setLayout(new BorderLayout() );
        c.add(frontpage);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }

}
