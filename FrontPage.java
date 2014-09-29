import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class FrontPage extends JPanel implements ActionListener{
    JButton addNewProperty = new JButton("Add Property");
    JButton addNewClient = new JButton("Add Client");
    
    public FrontPage() {
        addNewProperty.addActionListener(this);
        addNewClient.addActionListener(this);
        
        setLayout( new BorderLayout());
        add(addNewProperty, BorderLayout.WEST);
        add(addNewClient, BorderLayout.EAST);
        
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }
}
