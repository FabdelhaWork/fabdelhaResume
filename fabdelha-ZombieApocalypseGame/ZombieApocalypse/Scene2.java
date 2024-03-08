public class Scene2{
	//Scene Data - Only Accessible Within This Class
	private static String loss;
	private static String win;
	private static int width = 512;
	private static int height = 512;

	//Draws Scene
	public static void draw(){
		if(Game.gameOver == true && Player.win == false){
			StdDraw.picture(width/2, height/2, loss);
		}
		if(Game.gameOver == true && Player.win == true){
			StdDraw.picture(width/2, height/2, win);
		}

	}

	//Setup canvas data
	public static void start(){
		loss = "Images/Loss.png";
		win = "Images/Win.png";
	}
}