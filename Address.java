public class Address {

    private int    streetNum  = 0;
    private String streetName = "";
    private int    apNum      = 0;
    private int    zipCode    = 0;
    private String city       = "";
    private String state      = "";

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

    @Override
    public String toString() {
        return String.format("%7d %20s %4d %6d %10s %10s", streetNum, streetName,
                             apNum, zipCode, city, state);
    }
}
