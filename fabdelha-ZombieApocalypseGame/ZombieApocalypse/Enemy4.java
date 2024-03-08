public class Enemy4{
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
		isTouchingX = Math.abs(Player.x - Enemy4.x) < Enemy4.width;
		return isTouchingX;
	}

	public static boolean isTouchingY(){
		boolean isTouchingY;
		isTouchingY = Math.abs(Player.y - Enemy4.y) < Enemy4.height;
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
		aliveImage = "Images/Zombie2.png";
		deadImage = "Images/DeadZombie2.png";
		width = 15;
		height = 15;
		x = 256;
		y = 430;
	
	}
	public static void move(){
	if(Enemy.alive == false && Enemy2.alive == false && Enemy3.alive == false){
	if(Gun.isTouchingX4() == true && Gun.isTouchingY4() == true && Gun.isAttacking() == true){
		alive = false;
	}
	if(alive == true){
		if(x > Player.x){
			x -= 5;
		}
		if(x < Player.x){
			x += 5;
		}
		if(y > Player.y){
			y -= 5;
		}
		if(y < Player.y){
			y += 5;
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
