package Spooler;

public class Spooler {
    private static boolean instance_flag= false; private Spooler() {
    }
    public static Spooler getSpooler() {
        if (! instance_flag){ 
            instance_flag = true;
            return new Spooler (); 
        } else{
            return null;
        }
    } 
}