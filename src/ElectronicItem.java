public class ElectronicItem extends CISItem{
    private int storageCapacity;
    private String model;
    private String maker;
    private String operatingSystem;
    public ElectronicItem(String name_, String location_, int price_, String description_, int storageCapacity, String model, String maker, String operatingSystem) {
        super(name_, location_, price_, description_);
        this.storageCapacity = storageCapacity;
        this.model = model;
        this.maker = maker;
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "ElectronicItem --> " + super.toString() + "\nStorageCapacity: " + getStorageCapacity() + ", model: " + getModel() + ", maker: " + getMaker() + ", OS: " + getOperatingSystem();
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
