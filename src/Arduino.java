public class Arduino extends ElectronicItem{
    String version;

    public Arduino(String name_, String location_, int price_, String description_, int storageCapacity, String model, String maker, String operatingSystem, String version) {
        super(name_, location_, price_, description_, storageCapacity, model, maker, operatingSystem);
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
