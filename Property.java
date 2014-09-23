public class Property {

    private float price     = 0.0;
    private float bathrooms = 0.0;
    private int   bedrooms  = 0;
    private int   floors    = 0;
    private float sqrFeet   = 0.0;

    public float getPrice()     { return price; }
    public float getBathrooms() { return bathrooms; }
    public int   getBedrooms()  { return bedrooms; }
    public int   getFloors()    { return floors; }

    public void setPrice(float price)          { this.price = price; }
    public void setBathrooms(float bathrooms)  { this.bathrooms = bathrooms; }
    public void setBedrooms(int bedrooms)      { this.bedrooms = bedrooms; }
    public void setFloors(int floors)          { this.floors = floors; }

}
