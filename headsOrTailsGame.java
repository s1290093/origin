import java.util.Random;

class headsOrTailsGame{
    public static void main(String[] args){
	Random rand = new Random();

	String name = null;

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

	if(headsCount > tailsCount){
	    if(name != null){
		System.out.print(name);
	    }else{
		System.out.print("You");
	    }
	    System.out.println(" won");
	}
	else{
	    if(name != null){
		System.out.print(name);
	    }else{
		System.out.print("You");
	    }
	    System.out.println(" lost");
	}
    }
}
