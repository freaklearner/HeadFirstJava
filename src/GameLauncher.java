class Game{
	Player p1;
	Player p2;
	Player p3;
	
	void start() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		while(true) {
			int target = (int)(Math.random() * 10);
			System.out.println("Number Expected: "+target);
			p1.guess();
			p2.guess();
			p3.guess();
			boolean p1Flag = false;
			boolean p2Flag = false;
			boolean p3Flag = false;
			System.out.println("Player 1 guess "+p1.number);
			if(p1.number == target) {
				p1Flag = true;
			}
			System.out.println("Player 2 guess "+p2.number);
			if(p2.number == target) {
				p2Flag = true;
			}
			System.out.println("Player 3 guess "+p3.number);
			if(p3.number == target) {
				p3Flag = true;
			}
			if(p1Flag || p2Flag || p3Flag) {
				System.out.println("We have a Winner");
				break;
			}
			else {
				System.out.println("Players have to try again");
			}
			
		}
		
		
	}
}

class Player{
	int number;
	
	void guess() {
		number = (int)(Math.random() * 10);
		System.out.println("I'm guessing");
	}
}
public class GameLauncher {
	public static void main(String[] args) {
		Game ob = new Game();
		ob.start();
	}
}
