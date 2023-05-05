import java.util.ArrayList;

class Basin extends Compounds{

    //List of cows that are drinking 
    public ArrayList<CowThread>cowsD = new ArrayList<CowThread>();

    public Basin(int X, int Y) {
        super(X, Y);
       // while()
    }
    //---Get---
    public ArrayList<CowThread> getCowD() {
        return cowsD;
    }
    



}