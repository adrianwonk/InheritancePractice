import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Book b = new Book("The Shining", "Skl", 3, "a book called the shining"
        , 344, "22/33", "AWong", "1344", "1st", "The Shining");

        Method m = b.getClass().getMethods()[2];
        String s = "Isbn";
        System.out.println(m);
        System.out.println(m.getParameters()[2]);
    }
}