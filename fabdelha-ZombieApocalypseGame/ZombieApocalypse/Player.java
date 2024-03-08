import java.util.Scanner;

public class Player{
	//Player data
	private static String aliveImage;
	private static String deadImage;
	private static int width;
	private static int height;
	public static double x;
	public static double y;
	public static boolean win = false;
	public static void draw(){
		StdDraw.picture(x, y, aliveImage);
	}

	public static void start(){
		aliveImage = "Images/Player.png";
		width = 31;
		height = 31;
		x = 30;
		y = 30;
	}
	public static void move(){
		if(StdDraw.hasNextKeyTyped()){
			char ch = StdDraw.nextKeyTyped();
			if (ch == 'w'){
				y -= 20;
			}
			if (ch == 's'){
				y += 20;
			}
			if (ch == 'd'){
				x += 20;
			}
			if (ch == 'a'){
				x -= 20;
			}
			if (ch == 'r'){
				Gun.ammo = Gun.ammo + (8 - Gun.ammo);
			}
		}
	}
	public static void update(){
			move();
			if( Helicopter.isTouchingX() == true && Helicopter.isTouchingY() == true && Enemy.alive == false && Enemy2.alive == false && Enemy3.alive == false && Enemy4.alive == false && Enemy5.alive == false){
				Game.gameOver = true;
				win = true;
			}	
			if( Enemy.isTouchingX() == true && Enemy.isTouchingY() == true && Enemy.alive == true){
				Game.gameOver = true;

			}
			if( Enemy2.isTouchingX() == true && Enemy2.isTouchingY() == true && Enemy2.alive == true){
				Game.gameOver = true;

			}
			if( Enemy3.isTouchingX() == true && Enemy3.isTouchingY() == true && Enemy3.alive == true){
				Game.gameOver = true;

			}
			if(Enemy4.isTouchingX() == true && Enemy4.isTouchingY() == true && Enemy4.alive == true && Enemy.alive == false && Enemy2.alive == false && Enemy3.alive == false){
				Game.gameOver = true;

			}
			if(Enemy5.isTouchingX() == true && Enemy5.isTouchingY() == true && Enemy5.alive == true && Enemy.alive == false && Enemy2.alive == false && Enemy3.alive == false){
				Game.gameOver = true;

			}
			if( Beartrap.isTouchingX() == true && Beartrap.isTouchingY() == true){
				Game.gameOver = true;
			}
	}	
	public static double getX(){
		return x;
	}
}