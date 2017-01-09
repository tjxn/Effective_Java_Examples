/**
 * Created by Trevor Jackson on 01-Jan-2017.
 */
public class Trevor_Jackson_Singleton_Static_Factory {
    private static final Trevor_Jackson_Singleton_Static_Factory INSTANCE = new Trevor_Jackson_Singleton_Static_Factory();

    private Trevor_Jackson_Singleton_Static_Factory() {
    }

    public static Trevor_Jackson_Singleton_Static_Factory getInstance() {
        return INSTANCE;
    }

    public void writeCode() {
        System.out.println("Hello World");
    }

}
