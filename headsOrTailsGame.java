import java.util.Random;

class headsOrTailsGame{
    public static void main(String[] args){
	Random rand = new Random();

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
