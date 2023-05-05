
class Compounds{

    public int X,Y;
    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }
    public Hay hay;
    public Basin basin;
    public WalkArea walk;


    public Compounds(int X,int Y){
        this.X = X;
        this.Y = Y;
        
    }

    public void eat(int id){
        System.out.println("The cow number " + id +  "  is in the hay compound.");
    }
    public void drink(int id){
        System.out.println("The cow number " + id + "  is in the basin compound.");
    }
    public void walk(int id){
        System.out.println("The cow number " + id + "  is in the walking area.");
    }
}