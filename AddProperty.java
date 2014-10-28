import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class AddProperty extends JFrame implements ActionListener{
    JPanel north = new JPanel();
    JPanel south = new JPanel();
    
    JRadioButton residential = new JRadioButton();
    JRadioButton commercial = new JRadioButton();
    JRadioButton ranch = new JRadioButton();
    
    JTextField price = new JTextField(20);
    JTextField lotSize = new JTextField(20);
    JTextField sqrFeet = new JTextField(20);
    JTextField year = new JTextField(20);
    JTextField status = new JTextField(20);
    JTextField zipCode = new JTextField(20);
    
    JLabel ePrice = new JLabel("Price:    ");
    JLabel eLotSize = new JLabel("Lot Size: ");
    JLabel eSqrFeet = new JLabel("Sqr Feet: ");
    JLabel eYear = new JLabel("Year:     ");
    JLabel eStatus = new JLabel("Status:   ");
    JLabel eZipCode = new JLabel("Zip Code: ");
    
    JButton done = new JButton("Done");
    JButton addNew = new JButton("Add +");
    JButton cancel = new JButton("Cancel");
    
    Font font = new Font("verdana", Font.BOLD, 10);
    
    
    public AddProperty() {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        setSize(600,500);
        residential.addActionListener(this);
        commercial.addActionListener(this);
        ranch.addActionListener(this);
        price.addActionListener(this);
        lotSize.addActionListener(this);
        sqrFeet.addActionListener(this);
        year.addActionListener(this);
        status.addActionListener(this);
        zipCode.addActionListener(this);
        
        ePrice.setFont(font);
        eLotSize.setFont(font);
        eSqrFeet.setFont(font);
        eYear.setFont(font);
        eStatus.setFont(font);
        eZipCode.setFont(font);
        
        setLayout( new BorderLayout() );
        GridLayout grid = new GridLayout(3,2);
        grid.setHgap(20);
        north.setLayout(grid);
        
        north.add(ePrice);   north.add(price);
        north.add(eLotSize); north.add(lotSize);
        north.add(eSqrFeet); north.add(sqrFeet);
        north.add(eYear);    north.add(year);
        north.add(eStatus);  north.add(status);
        north.add(eZipCode); north.add(zipCode);
        
        south.add(done); south.add(addNew); south.add(cancel);
        
        add(north, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
        
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }
}
