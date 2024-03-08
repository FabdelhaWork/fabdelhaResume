public class Scene{
	//Scene Data - Only Accessible Within This Class
	private static String image;
	private static int width = 512;
	private static int height = 512;
	public static int getWidth(){
		return width;
	}
	public static int getHeight(){
		return height;
	}

	//Draws Scene
	public static void draw(){
		StdDraw.picture(width/2, height/2, image);

	}
	//Setup canvas data
	public static void start(){
		StdDraw.setCanvasSize(width, height);
		StdDraw.setXscale(0.0, width);
		StdDraw.setYscale(height, 0.0);
		image = "Images/Background.png";

	}
}