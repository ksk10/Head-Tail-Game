import java.util.Random;

public class HeadTailGame{
    public static void main(String args[]){
        int head=0, tail=0;
        Random rand = new Random();

         System.out.println("Tossing a coin...");
         for(int i=0; i<3; i++){
            System.out.print("Round " + i + ": ");
            int num = rand.nextInt(2);
            if(num == 0){
                System.out.println("Heads");
                head++;
            }
            if(num == 1){
                System.out.println("Tails");
                tail++;
            }
        }
        System.out.println("Heads: " + head + ", Tails: " + tail);
        if(head >= 2) System.out.println("You won.");
        else System.out.println("You lost.");
    }
}