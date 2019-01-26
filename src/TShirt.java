public class TShirt {
    private TShirtSize size;
    private String manufacturer;

    public TShirt(TShirtSize size, String manufacturer) {
        this.size = size;
        this.manufacturer = manufacturer;
    }

    public TShirtSize getSize() {
        return size;
    }

    public void setSize(TShirtSize size) {
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
