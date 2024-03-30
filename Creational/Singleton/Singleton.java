public class Singleton {

    private static Singleton uniqueInstance = null;
    
    private Singleton( ) { }                         // private constructor
    
    public static Singleton getInstance() {
        if (uniqueInstance == null)
            uniqueInstance = new Singleton();        // call constructor
            
        return uniqueInstance;
    }

}