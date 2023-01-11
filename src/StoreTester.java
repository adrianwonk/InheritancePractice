import java.util.ArrayList;

public class StoreTester {

    public boolean addBookTest(){
        int passed = 0;

        // inserts a good book
        ArrayList<CISItem> items = new ArrayList<>(); //<-- holds all items in store
        Book b = new Book("The Shining", "Skl", 3, "a book called the shining"
                , 344, "22/33", "AWong", "1344", "1st", "The Shining");
        Store s = new Store(items);
        s.addBook(b);
        if (s.getItems("Book").get(0).equals(b)){
            passed++;
        }


        if (passed == 1){
            return true;
        } else return false;
    }

    public boolean addPhoneTest(){
        int passed = 0;
        // inserts a good phone
        ArrayList<CISItem> items = new ArrayList<>(); //<-- holds all items in store
        Phone p = new Phone("Apple", "Skl", 10, "an ipad pro"
                , 344, "22/33", "AWong", "1344", "1st", 13);
        Store s = new Store(items);
        s.addPhone(p);
        if (s.getItems("Phone").get(0).equals(p)){
            passed++;
        }


        if (passed == 1){
            return true;
        } else return false;
    }

    public boolean test(){
        int passed = 0;

        if (addBookTest()) {
            System.out.println("add book passed");
            passed++;
        } else {
            System.out.println("add book not passed");
        }
        if (addPhoneTest()) {
            System.out.println("add phone passed");
            passed++;
        } else {
            System.out.println("add phone not passed");
        }

        if (passed == 2) return true;
        return false;
    }

    public void addBookAndPhone(){

        // test 1: add book then phone
        System.out.println("test 1: add book then phone");
        ArrayList<CISItem> items = new ArrayList<>(); //<-- holds all items in store
        Book b = new Book("The Shining", "Skl", 3, "a book called the shining"
                , 344, "22/33", "AWong", "1344", "1st", "The Shining");

        Phone p = new Phone("Apple", "Skl", 10, "an ipad pro"
                , 344, "22/33", "AWong", "1344", "1st", 13);

        Store s = new Store(items);

        s.addBook(b);
        s.addPhone(p);

        s.showAllInfo();

        //test 2: add phone then book
        System.out.println("\ntest 2: add phone then book");
        items.clear();
        Store s2 = new Store(items);
        s2.addPhone(p);
        s2.addBook(b);

        s2.showAllInfo();
    }

    public boolean updatePhonesLocationTest(){
        int passed = 0;

        Store s = new Store(new ArrayList<CISItem>());
        s.addPhone(new Phone ("DAMN BIG PHONE", "Skl", 10, "an ipad pro"
                , 344, "22/33", "AWong", "1344", "1st", 13));
        s.addPhone(new Phone ("DAMN SMALL PHONE", "Skl", 10, "an ipad pro"
                , 344, "22/33", "AWong", "1344", "1st", 13));

        s.updatePhonesLocation("Room 514");

        for (CISItem value : s.getAllPhones()){
            if (value.getLocation().equals("Room 514"))
                passed++;
        }
        if (passed == 2){
            return true;
        } return false;
    }

    public boolean getAllPhonesTest(){
        int passed = 0;

        Phone p1 = new Phone ("DAMN BIG PHONE", "Skl", 10, "an ipad pro"
                , 344, "22/33", "AWong", "1344", "1st", 13);
        Phone p2 = new Phone ("DAMN SMALL PHONE", "Skl", 10, "an ipad pro"
                , 344, "22/33", "AWong", "1344", "1st", 13);

        Phone p3 = new Phone ("DAMN SMoL PHONE", "Skl", 10, "an ipad pro"
                , 344, "22/33", "AWong", "1344", "1st", 13);

        Store s = new Store(new ArrayList<CISItem>());
        s.addPhone(p1);
        s.addPhone(p2);
        s.addPhone(p3);

        ArrayList<Phone> result = new ArrayList<>();
        result.add(p1);
        result.add(p2);
        result.add(p3);
        if (s.getAllPhones().equals(result)){
            return true;
        }
        return false;
    }

    public boolean getItemsTest(){

        ArrayList<CISItem> items = new ArrayList<>(); //<-- holds all items in store
        Book b = new Book("The Shining", "Skl", 3, "a book called the shining"
                , 344, "22/33", "AWong", "1344", "1st", "The Shining");

        Phone p = new Phone("Apple", "Skl", 10, "an ipad pro"
                , 344, "22/33", "AWong", "1344", "1st", 13);

        Store s = new Store(items);

        s.addBook(b);
        s.addPhone(p);

        int passed = 0;
        ArrayList<Book> resultB = new ArrayList<>();
        ArrayList<Phone> resultP = new ArrayList<>();
        resultP.add(p);
        resultB.add(b);
        if (s.getItems("Book").equals(resultB)){
            passed++;
        }
        if (s.getItems("Phone").equals(resultP)){
            passed++;
        }

        if (passed == 2){
            return true;
        }
        return false;
    }

    //Make a test for updateItems

    public boolean updateItems(){

        ArrayList<CISItem> items = new ArrayList<>(); //<-- holds all items in store
        Store s = new Store(items);

        Book b = new Book("The Shining", "Skl", 3, "a book called the shining"
                , 344, "22/33", "AWong", "1344", "1st", "The Shining");

        Book b2 = new Book("The WHDSFSDF", "Skl", 3, "a book called the shining"
                , 344, "22/33", "AWong", "1344", "1st", "The Shining");

        Book bR = new Book("BOOK!!!", "Skl", 3, "a book called the shining"
                , 344, "22/33", "AWong", "1344", "1st", "The Shining");

        Book b2R = new Book("BOOK!!!", "Skl", 3, "a book called the shining"
                , 344, "22/33", "AWong", "1344", "1st", "The Shining");


        Phone p = new Phone("Apple", "Skl", 10, "an ipad pro"
                , 344, "22/33", "AWong", "1344", "1st", 13);

        Phone p1 = new Phone ("DAMN BIG PHONE", "Skl", 10, "an ipad pro"
                , 344, "22/33", "AWong", "1344", "1st", 13);
        Phone p2 = new Phone ("DAMN SMALL PHONE", "Skl", 10, "an ipad pro"
                , 344, "22/33", "AWong", "1344", "1st", 13);

        Phone p3 = new Phone ("DAMN SMoL PHONE", "Skl", 10, "an ipad pro"
                , 344, "22/33", "AWong", "1344", "1st", 13);

        Phone pR = new Phone("Apple", "Skl", 50, "an ipad pro"
                , 344, "22/33", "AWong", "1344", "1st", 13);

        Phone p1R = new Phone ("DAMN BIG PHONE", "Skl", 50, "an ipad pro"
                , 344, "22/33", "AWong", "1344", "1st", 13);
        Phone p2R = new Phone ("DAMN SMALL PHONE", "Skl", 50, "an ipad pro"
                , 344, "22/33", "AWong", "1344", "1st", 13);

        Phone p3R = new Phone ("DAMN SMoL PHONE", "Skl", 50, "an ipad pro"
                , 344, "22/33", "AWong", "1344", "1st", 13);

        s.addItems(b);
        s.addItems(b2);
        s.addItems(p);
        s.addItems(p1);
        s.addItems(p2);
        s.addItems(p3);


        s.updateItems("Book", "name", "BOOK!!!");
        s.updateItems("Phone", "price", "50");


        ArrayList<CISItem> result = new ArrayList<>();
        result.add(bR);
        result.add(b2R);
        result.add(pR);
        result.add(p1R);
        result.add(p2R);
        result.add(p3R);

        int passed = 0;
        for (int i = 0; i < result.size(); i++){
            if ((s.getAllItems().get(i).toString()).equals(result.get(i).toString()))
                passed++;
        }

        if (passed == result.size())
            return true;
        return false;
    }

}
