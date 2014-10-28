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
    AddProperty addProperty = new AddProperty();
    AddClient addClient = new AddClient();

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
        //addProperty.setVisible(false);
        frontpage.addProperty.addActionListener(this);
        frontpage.removeProperty.addActionListener(this);
        frontpage.addClient.addActionListener(this);
        frontpage.removeClient.addActionListener(this);
        addProperty.done.addActionListener(this);
        addProperty.addNew.addActionListener(this);
        addProperty.cancel.addActionListener(this);
        addClient.done.addActionListener(this);
        addClient.addNew.addActionListener(this);
        addClient.cancel.addActionListener(this);
        
        //c.add(addProperty, BorderLayout.CENTER);
        c.add(frontpage);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object obj = e.getSource();
        if(obj == frontpage.addProperty) {
            setAllEnabled(false);
            addProperty.setVisible(true);
        }
        if(obj == frontpage.removeProperty) {}
        if(obj == frontpage.addClient) {
            setAllEnabled(false);
            addClient.setVisible(true);
        }
        if(obj == frontpage.removeClient) {}
        if(obj == addProperty.done) {
            //addProperty.setVisible(false);
            //setAllEnabled(true);
        }
        if(obj == addProperty.addNew) {}
        if(obj == addProperty.cancel) {
            addProperty.setVisible(false);
            setAllEnabled(true);
        }
        if(obj == addClient.done) {
            //addProperty.setVisible(false);
            //setAllEnabled(true);
        }
        if(obj == addClient.addNew) {}
        if(obj == addClient.cancel) {
            addClient.setVisible(false);
            setAllEnabled(true);
        }
        
    }
    
    private void setAllEnabled(boolean enable) {
        frontpage.addProperty.setEnabled(enable);
        frontpage.removeProperty.setEnabled(enable);
        frontpage.addClient.setEnabled(enable);
        frontpage.removeClient.setEnabled(enable);
    }

}
