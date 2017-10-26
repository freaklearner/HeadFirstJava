package SimpleDotCom;

import java.util.ArrayList;

public class SimpleDot {
	private ArrayList<Integer> locations;
	
	public SimpleDot() {
		locations = null;
	}
	public void setLocationCells(ArrayList<Integer> locations) {
		this.locations = locations;
	}
	
	public String checkYourSelf(String guess) {
		String result = "miss";
		if(locations.contains(Integer.parseInt(guess))) {
			result = "hit";
			locations.remove((Object)Integer.parseInt(guess));
		}
		if(locations.isEmpty()) {
			result = "kill";
		}
		return result;
	}
}
