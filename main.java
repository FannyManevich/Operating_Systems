import java.util.Scanner;
import java.util.ArrayList;


class main{
    


    public static void main(String[]args){
        int N,X,Y;
        

        Scanner input= new Scanner(System.in);

        System.out.println("Please choose number of cows");
       // N = input.nextInt();
        N =10;
        if(N <= 0)
            System.out.println("Error! number of cows is illegal!");

        System.out.println("Please choose max number of cows in hay compound");
        //X = input.nextInt();
        X = 5;
        System.out.println("Please choose max number of cows in basin compound");
        //Y = input.nextInt();
        Y = 5;
        Compounds c = new Compounds(X,Y);
        SharedResources sr = new SharedResources(X,Y);

        for (int i = 0 ; i < N; i++) {
            Thread Cow = new Thread(new CowThread(i,c,sr));
             Cow.start();
        }


        input.close();
}
}