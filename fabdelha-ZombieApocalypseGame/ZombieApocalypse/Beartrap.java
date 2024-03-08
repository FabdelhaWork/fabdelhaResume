public class Beartrap{
	//Beartrap data
	private static String image;
	private static int width;
	private static int height;
	private static double x;
	private static double y;
	public static boolean isTouchingX(){
		boolean isTouchingX;
		isTouchingX = Math.abs(Player.x - Beartrap.x) < Beartrap.width;
		return isTouchingX;
	}
	public static boolean isTouchingY(){
		boolean isTouchingY;
		isTouchingY = Math.abs(Player.y - Beartrap.y) < Beartrap.height;
		return isTouchingY;
	}
	//Draw Beartrap
	public static void draw(){
		StdDraw.picture(x, y, image);
	}
	public static void start(){
		image = "Images/Beartrap.png";
		width = 15;
		height = 15;
		x = 400;
		y = 400;
	}

}