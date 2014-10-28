import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class AddClient extends JFrame implements ActionListener {

    JPanel north = new JPanel();
    JPanel center = new JPanel();
    JPanel south = new JPanel();
    //JPanel west = new JPanel();
    //JPanel east = new JPanel();
    
    //JRadioButton residential = new JRadioButton();
    //JRadioButton commercial = new JRadioButton();
    //JRadioButton ranch = new JRadioButton();
    
    JTextField fistName = new JTextField(20);
    JTextField lastName = new JTextField(20);
    JTextField ssn = new JTextField(20);
    JTextField dOb = new JTextField(20);
    JTextField mStatus = new JTextField(20);
    JTextField budget= new JTextField(20);
    Address address = new Address();
    
    JLabel lFirstName = new JLabel("First:    ");
    JLabel lLastName = new JLabel("Last: ");
    JLabel lSsn = new JLabel("Ssn: ");
    JLabel lDoB = new JLabel("DoB:     ");
    JLabel lMstatus = new JLabel("M Status:   ");
    JLabel lBudget = new JLabel("budget: ");
    
    JButton done = new JButton("Done");
    JButton addNew = new JButton("Add +");
    JButton cancel = new JButton("Cancel");
    
    Font font = new Font("verdana", Font.BOLD, 10);
    
    public AddClient() {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        setSize(500,500);
        fistName.addActionListener(this);
        lastName.addActionListener(this);
        ssn.addActionListener(this);
        dOb.addActionListener(this);
        mStatus.addActionListener(this);
        budget.addActionListener(this);
        
        fistName.setFont(font);
        lFirstName.setFont(font);
        lastName.setFont(font);
        lLastName.setFont(font);
        ssn.setFont(font);
        lSsn.setFont(font);
        dOb.setFont(font);
        lDoB.setFont(font);
        mStatus.setFont(font);
        lMstatus.setFont(font);
        budget.setFont(font);
        lBudget.setFont(font);
        
        setLayout( new BorderLayout() );
        GridLayout grid = new GridLayout(3,2);
        grid.setHgap(20);
        north.setLayout(grid);
        
        north.add(lFirstName); north.add(fistName);
        north.add(lLastName);  north.add(lastName);
        north.add(lSsn);       north.add(ssn);
        north.add(lDoB);       north.add(dOb);
        north.add(lMstatus);   north.add(mStatus);
        north.add(lBudget);    north.add(budget);
        center.add(address);
        
        south.add(done); south.add(addNew); south.add(cancel);
        
        add(north, BorderLayout.NORTH);
        add(center, BorderLayout.CENTER);
        add(south, BorderLayout.SOUTH);
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }
    

}
