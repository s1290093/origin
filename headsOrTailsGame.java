import java.util.Random;
import java.util.Scanner;

class headsOrTailsGame{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();

	String name = null;
	System.out.println("Who are you?");
	name = sc.next();
	System.out.println("Hello, " + name + "!");

	System.out.println("Tossing a coin...");

	int headsCount = 0, tailsCount = 0;

	for(int i = 1; i <= 3; i++){
	    System.out.print("Round " + i + ": ");
	    int n = rand.nextInt(2);
	    if(n == 0){
		System.out.println("Heads");
		headsCount++;
	    }else if(n == 1){
		System.out.println("Tails");
		tailsCount++;
	    }else{
		System.out.println("error");
	    }
	}

	System.out.println("Heads: " + headsCount + ", Tails: " + tailsCount);
    }
}
