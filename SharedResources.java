import java.util.concurrent.Semaphore;

class SharedResources{
    public Semaphore semHay;
    public Semaphore semBasin;
    public Semaphore semWalk;


    public SharedResources(int X,int Y){
        this.semHay = new Semaphore(X);
        this.semBasin = new Semaphore(Y);
        this.semWalk = new Semaphore(0);
    }

}