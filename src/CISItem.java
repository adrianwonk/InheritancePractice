public class CISItem {
     String name;
     String location;
     int price;
     String description;

    public CISItem(String name_, String location_, int price_, String description_){
        setName(name_);
        setLocation(location_);
        setPrice(price_);
        setDescription(description_);
    }

    @Override
    public String toString() {
        return "CISItem\n" + "name: " + getName() + ", location: " + getLocation() + ", price: " + getPrice() + ", desc.: " + getDescription();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
