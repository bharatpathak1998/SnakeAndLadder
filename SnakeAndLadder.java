
public class SnakeAndLadder {
	
    public static void main(String[] args) {
		
	int START_POSITION = 0;
	System.out.println("Player start at position " +START_POSITION );
	    
	int ROLL_THE_DICE = (int) (Math.floor(Math.random() *10) %6 ) +1;
	System.out.println("After rolling the dice we get " +ROLL_THE_DICE);
		
    }
}       