import java.util.Scanner;


class main{
    


    public static void main(String[]args){
        int N,X,Y;
        Scanner input= new Scanner(System.in);

        SharedResources sr = new SharedResources();
        Compounds c = new Compounds();

        System.out.println("Please choose number of cows");
        N = input.nextInt();

        System.out.println("Please choose max number of cows in hay compound");
        X = input.nextInt();

        System.out.println("Please choose max number of cows in basin compound");
        Y = input.nextInt();

    }
}