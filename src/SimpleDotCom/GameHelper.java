package SimpleDotCom;

import java.io.*;
public class GameHelper {
	public static String guessInput(String prompt) {
		String input = null;
		System.out.println(prompt);
		try {
			BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
			input = is.readLine();
			if(input.length() == 0) {
				return null;
			}
		}catch(Exception e) {
			System.out.println("IOException: "+ e);
		}
		return input;
	}
}
