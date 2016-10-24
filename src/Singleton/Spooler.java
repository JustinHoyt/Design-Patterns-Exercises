package Singleton;

public class Spooler {
    private static boolean instanceFlag= false; 
    private Spooler() {}
    public static Spooler getSpooler() {
        if (! instanceFlag){ 
            instanceFlag = true;
            return new Spooler (); 
        } else{
            return null;
        }
    } 
}