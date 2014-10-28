import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Address extends JPanel implements ActionListener{

    private int    streetNum  = 0;
    private String streetName = "";
    private int    apNum      = 0;
    private int    zipCode    = 0;
    private String city       = "";
    private String state      = "";
    
    JTextField tStreetNum = new JTextField(15);
    JTextField tStreetName = new JTextField(15);
    JTextField tApNum = new JTextField(15);
    JTextField tCity = new JTextField(15);
    JTextField tState = new JTextField(15);
    JTextField tZip = new JTextField(15);
    
    JLabel lStreetNum = new JLabel("St #: ");
    JLabel lStreetName = new JLabel("St name: ");
    JLabel lApNum = new JLabel("Ap #: ");
    JLabel lCity = new JLabel("City: ");
    JLabel lState = new JLabel("State: ");
    JLabel lZip = new JLabel("ZipCode: ");
    
    Font font = new Font("verdana", Font.BOLD, 10);
    
    public Address() {
        tStreetNum.addActionListener(this);
        tStreetName.addActionListener(this);
        tApNum.addActionListener(this);
        tCity.addActionListener(this);
        tState.addActionListener(this);
        tZip.addActionListener(this);
        
        tStreetNum.setFont(font);
        lStreetNum.setFont(font);
        tStreetName.setFont(font);
        lStreetName.setFont(font);
        tApNum.setFont(font);
        lApNum.setFont(font);
        tCity.setFont(font);
        lCity.setFont(font);
        tState.setFont(font);
        lState.setFont(font);
        tZip.setFont(font);
        lZip.setFont(font);
        
        GridLayout grid = new GridLayout(3,2);
        //grid.setHgap(1);
        setLayout(grid);
        
        add(lStreetNum);  add(tStreetNum);
        add(lStreetName); add(tStreetName);
        add(lApNum);      add(tApNum);
        add(lCity);       add(tCity);
        add(lState);      add(tState);
        add(lZip);        add(tZip);
    }

    public int getStreetNum()     { return streetNum; }
    public String getStreetName() { return streetName; }
    public int getApNum()         { return apNum; }
    public int getZipCode()       { return zipCode; }
    public String getCity()       { return city; }
    public String getState()      { return state; }

    public void setStreetNum(int streetNum)      { this.streetNum = streetNum; }
    public void setStreetName(String streetName) { this.streetName = streetName; }
    public void setApNum(int apNum)              { this.apNum = apNum; }
    public void setZipCode(int zipCode)          { this.zipCode = zipCode; }
    public void setCity(String city)             { this.city = city; }
    public void setState(String state)           { this.state = state; }
    
    public void setAll(int num, String name, int ap, String cty, String st, int zp) {
        setStreetNum(num); setStreetName(name); setApNum(ap); setCity(cty);
        setState(st); setZipCode(zp);
    }

    @Override
    public String toString() {
        return String.format("%7d %20s %4d %6d %10s %10s", streetNum, streetName,
                             apNum, zipCode, city, state);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == tStreetNum) {
            setStreetNum(Integer.parseInt(tStreetNum.getText()));
            tStreetName.requestFocus();
        }
        if (obj == tStreetName) {
            setStreetName(tStreetName.getText());
            tApNum.requestFocus();
        }
        if (obj == tApNum) {
            setApNum(Integer.parseInt(tApNum.getText()));
            tCity.requestFocus();
        }
        if (obj == tCity) {
            setCity(tCity.getText());
            tState.requestFocus();
        }
        if (obj == tState) {
            setState(tState.getText());
            tZip.requestFocus();
        }
        if (obj == tZip) {
            setZipCode(Integer.parseInt(tZip.getText()));
            setAll(Integer.parseInt(tStreetNum.getText()), tStreetName.getText(), 
                   Integer.parseInt(tApNum.getText()), tCity.getText(),
                   tState.getText(), Integer.parseInt(tZip.getText()));
        }
    }
}
