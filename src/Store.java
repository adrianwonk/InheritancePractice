import java.util.ArrayList;

public class Store {
    private ArrayList<CISItem> cisItems = new ArrayList<>();

    public Store(ArrayList<CISItem> cisItems) {
        this.cisItems = cisItems;
    }

    public void addBook(Book b){
        cisItems.add(b);
    }
    public void addPhone(Phone p){
        cisItems.add(p);
    }

    public void addMagazine(Magazine m){
        cisItems.add(m);
    }
    public void addArduino(Arduino a){
        cisItems.add(a);
    }
    public void updatePhonesLocation(String location){
        for (CISItem value : cisItems){
            if (value.getClass().equals(Phone.class)){
                value.setLocation(location);
            }
        }
    }

    public ArrayList<Phone> getAllPhones(){
        try{
            ArrayList<Phone> result = new ArrayList<>();
            for (CISItem value : cisItems){
                if (value.getClass().equals(Phone.class))
                    result.add((Phone)value);
            }
            return result;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public ArrayList<CISItem> getItems(String itemType) {
        ArrayList<CISItem> result = new ArrayList<>();

        for (CISItem value : cisItems){
            if (value.getClass().getTypeName().equals(itemType))
                result.add(value);
        }
        return result;
    }

//    updateItems(itemType: String, property: String, value: String) void
    public void updateItems(String itemType, String property, String value){
        for (CISItem item : cisItems){
            if (item.getClass().getTypeName().equals(itemType)) {
                switch (property){
                    case "name":
                        item.setName(value);
                        break;
                    case "location":
                        item.setLocation(value);
                        break;
                    case "price":
                        item.setPrice(Integer.parseInt(value));
                        break;
                    case "description":
                        item.setDescription(value);
                        break;
                }
            }
        }
    }

    public void showAllInfo(){
        int i = 1;
        for (CISItem value: cisItems) {
            System.out.println(i + ". \n" + value); i++;
        }
    }

    public ArrayList<CISItem> getAllItems() {
        return cisItems;
    }

    public void addItems (CISItem item){
        cisItems.add(item);
    }
}
