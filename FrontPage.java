import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class FrontPage extends JPanel implements ActionListener{
    JButton addProperty = new JButton();
    JButton removeProperty = new JButton();
    JButton addClient = new JButton();
    JButton removeClient = new JButton();
    //JLabel welcomeScreen = new JLabel("Welcome");
    //Font title = new Font("verdana", Font.BOLD, 36);
    JPanel north = new JPanel();
    JPanel south = new JPanel();
    JPanel southWest = new JPanel();
    JPanel southEast = new JPanel();
    
    public FrontPage() {
        //addProperty.addActionListener(this);
        //removeProperty.addActionListener(this);
        //addClient.addActionListener(this);
        //removeClient.addActionListener(this);
        
        addProperty.setIcon(new ImageIcon("images/add_property.png"));
        removeProperty.setIcon(new ImageIcon("images/remove_property.png"));
        addClient.setIcon(new ImageIcon("images/add_client.png"));
        removeClient.setIcon(new ImageIcon("images/remove_client.png"));
        
        setLayout( new BorderLayout() );
        GridLayout grid = new GridLayout(1,2);
        grid.setHgap(20);
        north.setLayout( new BorderLayout() );
        south.setLayout( new BorderLayout() );
        southWest.setLayout(grid);
        southEast.setLayout(grid);
        
        north.setPreferredSize(new Dimension(750, 225));
        //welcomeScreen.setFont(title);
        
        //north.add(welcomeScreen, BorderLayout.NORTH);
        
        southWest.add(addProperty);
        southWest.add(removeProperty);
        southEast.add(addClient);
        southEast.add(removeClient);
        
        south.add(southWest, BorderLayout.WEST);
        south.add(southEast, BorderLayout.EAST);
        
        
        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
