public class Phone extends ElectronicItem{
    private String networkType;
    private int screenSize;

    public Phone(String name_, String location_, int price_, String description_, int storageCapacity, String model, String maker, String operatingSystem, String networkType, int screenSize) {
        super(name_, location_, price_, description_, storageCapacity, model, maker, operatingSystem);
        this.networkType = networkType;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Phone --> " + super.toString() + "\nnetworkType: " + getNetworkType() + ", screenSize: " + getScreenSize();
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
