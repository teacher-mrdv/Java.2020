import java.util.Random; 
  
public class Guess
{
	
	public static void main (String[] args)
	{
		int guesses = 5;
		int tries = 0;
		Random rand = new Random(); 
		int random = rand.nextInt(10);
		do 
		{
			int guess = IBIO.inputInt("Enter your guess: ");
			tries++;
			if( guess < random )
			{	IBIO.output("Too low");
				guesses--;
			} else if( guess > random )
			{	IBIO.output("Too high");
				guesses--;
			} else {
				IBIO.output("You won!");
				IBIO.output("In " + tries + " tries");
				break;
			}
		} while(guesses > 0);
		if(guesses == 0)
		{	IBIO.output("You lost!");
			IBIO.output("The number was " + random);
		}
		char ans = IBIO.inputChar("Play again (y/n)? ");
		if(ans == 'y' || ans == 'Y')
		{	main(null);
		}
	}
}

