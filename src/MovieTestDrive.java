class Movie{
	String title;
	String gener;
	int rating;
	
	void playit() {
		System.out.println("Playing Movie "+title);
	}
}
public class MovieTestDrive {
		public static void main(String[] args) {
			Movie one = new Movie();
			one.title = "Gone with the stock";
			one.gener = "Tragic";
			one.rating = -2;
			Movie two = new Movie();
			two.title = "Lost in Cubical Space";
			two.gener = "Comedy";
			two.rating = 5;
			two.playit();
			Movie three = new Movie();
			three.title = "Byte Club";
			three.gener = "Tragic but ultimately uplifting";
			three.rating = 127;
			}
}
