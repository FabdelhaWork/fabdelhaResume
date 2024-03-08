public class Helicopter{
	//Helicopter data
	private static String image;
	private static int width;
	private static int height;
	private static double x;
	private static double y;
	public static boolean isTouchingX(){
		boolean isTouchingX;
		isTouchingX = Math.abs(Player.x - Helicopter.x) < Helicopter.width;
		return isTouchingX;
	}

	public static boolean isTouchingY(){
		boolean isTouchingY;
		isTouchingY = Math.abs(Player.y - Helicopter.y) < Helicopter.height;
		return isTouchingY;
	}
	
	//Draw Helicopter
	public static void draw(){
		if(Enemy.alive == false && Enemy2.alive == false && Enemy3.alive == false && Enemy4.alive == false && Enemy5.alive == false){
		StdDraw.picture(x+width/2, y+height/2, image);
	}
	}
	public static void start(){
		image = "Images/Helicopter.png";
		width = 30;
		height = 15;
		x = 450;
		y = 440;
	}

}