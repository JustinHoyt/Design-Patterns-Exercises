package Singleton;

class Driver {

    static void Main(String[] args) { 
        Spooler sp1 = Spooler.getSpooler(); 
        if (sp1 != null)
            System.out.println("Got 1 spooler"); 
        Spooler sp2 = Spooler.getSpooler ();
        if (sp2 == null)
            System.out.println("Can\'t get second spooler"); //fails at compile time
    }
}