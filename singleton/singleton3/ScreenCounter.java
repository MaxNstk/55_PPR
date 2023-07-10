package singleton3;

public class ScreenCounter {

    private ScreenCounter(){}

    private static ScreenCounter instance;
    private int amount;

    public synchronized static ScreenCounter getInstance(){
        if (instance == null){
            instance = new ScreenCounter();
        }
        return instance;
    }

    public static int getScreenAmount(){
        return instance.amount;
    }

    public static int increaseScreenAmount(){
        instance.amount = instance.amount+1;
        return instance.amount;
    }
}
