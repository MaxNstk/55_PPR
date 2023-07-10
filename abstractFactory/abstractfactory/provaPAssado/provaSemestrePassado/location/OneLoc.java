package location;

public class OneLoc extends Location {
    private static Location instance = new OneLoc();

    public static Location getInstance() {
        return instance;
    }

    private OneLoc() {
        super();
        add(new Integer(80));
    }
}
