public class Enemy5{
	//Enemy Data
	private static String deadImage;
	private static String aliveImage;
	public static boolean alive = true;
	private static int width;
	private static int height;
	public static double x;
	public static double y;
	public static boolean isTouchingX(){
		boolean isTouchingX;
		isTouchingX = Math.abs(Player.x - Enemy5.x) < Enemy5.width;
		return isTouchingX;
	}

	public static boolean isTouchingY(){
		boolean isTouchingY;
		isTouchingY = Math.abs(Player.y - Enemy5.y) < Enemy5.height;
		return isTouchingY;
	}

	//Draw Zombie
	public static void draw(){
		if(Enemy.alive == false && Enemy2.alive == false && Enemy3.alive == false){
		if(alive == true){
			StdDraw.picture(x, y, aliveImage);
	}
		if(alive == false){
			StdDraw.picture(x, y, deadImage);
	}
	}
}

	public static void start(){
		aliveImage = "Images/WheelchairZombie.png";
		deadImage = "Images/DeadWheelchairZombie.png";
		width = 15;
		height = 15;
		x = 430;
		y = 256;
	
	}
	public static void move(){
	if(Enemy.alive == false && Enemy2.alive == false && Enemy3.alive == false){
	if(Gun.isTouchingX5() == true && Gun.isTouchingY5() == true && Gun.isAttacking() == true){
		alive = false;
	}
	if(alive == true){
		if(x > Player.x){
			x -= 7;
		}
		if(x < Player.x){
			x += 7;
		}
		if(y > Player.y){
			y -= 7;
		}
		if(y < Player.y){
			y += 7;
		}
		}
	if(alive == false){
		if(x > Player.x){
			x -= 0;
		}
		if(x < Player.x){
			x += 0;
		}
		if(y > Player.y){
			y -= 0;
		}
		if(y < Player.y){
			y += 0;
		}
		}
		}	
	}
	public static void update(){
			move();
		
	}
}
