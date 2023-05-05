
class CowThread implements Runnable{

    private final int id;
    private Compounds comp;
    private SharedResources res;

    public CowThread(int id, Compounds comp, SharedResources res){
        this.id = id;
        this.comp = comp;
        this.res = res;
    }
    //---Get---
    public Compounds getComp() {
            return comp;
    }
    public SharedResources getRes() {
            return res;
    }
    public int getId() {
        return id;
    }



    @Override
    public void run() {
        //Each cow will go and eat hay first
        try {
            //Cow eats
            res.semHay.acquire();
            comp.eat(id);
            comp.hay.cowsE.add(this);
            res.semHay.release();
            comp.hay.cowsE.remove(this);

            //Cows drinks
            res.semBasin.acquire();
            comp.drink(id);
            comp.basin.cowsD.add(this);
            res.semBasin.release();
            comp.basin.cowsD.remove(this);

            //Cows walking
            while(!comp.hay.getCowsE().isEmpty() && !comp.basin.getCowD().isEmpty()){
                comp.walk.cowsW.add(this);
                res.semWalk.acquire();

            }
            for (int i = 0 ; i < comp.getX() +comp.getY(); i++) {
                res.semWalk.release();

            }
            res.semWalk.release();
            res.semWalk.acquire();
            comp.walk(id);
            res.semWalk.release();
            



        } catch (InterruptedException e) {
            System.out.println("EROOOOFGHFGHDFGHDGFHFGH");
            e.printStackTrace();
        }




    }
}