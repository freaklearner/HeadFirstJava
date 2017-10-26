package SimpleDotCom;

import java.util.ArrayList;

public class SimpleDotTestDrive {
	public static void main(String[] args) {
		int numOfGuesses = 0;
		SimpleDot ob = new SimpleDot();
		int random = (int)(Math.random() * 5);
		ArrayList<Integer> locations = new ArrayList<Integer>();
		for(int i = 1;i<=3;i++) {
			locations.add(random);
			random++;
		}
		ob.setLocationCells(locations);
		boolean isAlive = true;
		while(isAlive) {
			String guess = GameHelper.guessInput("Guess a number between 0 and 5:");
			String result = ob.checkYourSelf(guess);
			System.out.println(result);
			numOfGuesses++;
			if(result.equals("kill")) {
				isAlive = false;
				System.out.println("You took "+numOfGuesses+ " guesses");
			}
		}
		
	}
}
