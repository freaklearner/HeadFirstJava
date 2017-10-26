package SimpleDotCom;

public class SimpleDot {
	private int[] locations;
	private int count;
	
	public SimpleDot() {
		count = 0;
		locations = null;
	}
	public void setLocationCells(int[] locations) {
		this.locations = locations;
	}
	
	public String checkYourSelf(String guess) {
		int num = Integer.parseInt(guess);
		String result = "miss";
		for(int i : locations) {
			if(i == num) {
				count++;
				result = "hit";
				break;
			}
		}
		if(count == locations.length) {
			result = "kill";
		}
		return result;
	}
}
