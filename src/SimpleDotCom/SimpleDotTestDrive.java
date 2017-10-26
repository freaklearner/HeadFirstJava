package SimpleDotCom;

public class SimpleDotTestDrive {
	public static void main(String[] args) {
		int numOfGuesses = 0;
		SimpleDot ob = new SimpleDot();
		int random = (int)(Math.random() * 5);
		int[] locations = {random,random+1,random+2};
		ob.setLocationCells(locations);
		boolean isAlive = true;
		while(isAlive) {
			String guess = GameHelper.guessInput("Guess a number between 0 and 5:");
			String result = ob.checkYourSelf(guess);
			numOfGuesses++;
			if(result.equals("kill")) {
				isAlive = false;
				System.out.println("You took "+numOfGuesses+ " guesses");
			}
		}
		
	}
}
