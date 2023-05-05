import java.util.ArrayList;


class Hay extends Compounds{

//List of cows that are eating
public ArrayList<CowThread> cowsE = new ArrayList<CowThread>(); 

public Hay(int X, int Y) {
        super(X, Y);
}

//---Get---
public ArrayList<CowThread> getCowsE() {
    return cowsE;
}





}