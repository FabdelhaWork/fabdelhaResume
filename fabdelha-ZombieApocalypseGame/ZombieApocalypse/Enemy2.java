public class Enemy2{
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
		isTouchingX = Math.abs(Player.x - Enemy2.x) < Enemy2.width;
		return isTouchingX;
	}
	public static boolean isTouchingY(){
		boolean isTouchingY;
		isTouchingY = Math.abs(Player.y - Enemy2.y) < Enemy2.height;
		return isTouchingY;
	}
	
	//Draw Zombie
	public static void draw(){
		if(alive == true){
			StdDraw.picture(x, y, aliveImage);
	}
		if(alive == false){
			StdDraw.picture(x, y, deadImage);
	}
	}

	public static void start(){
		aliveImage = "Images/BrideZombie.png";
		deadImage = "Images/DeadBrideZombie.png";
		width = 15;
		height = 15;
		x = Math.random() * Scene.getWidth() - width;
		y = Math.random() * Scene.getHeight() - height;
	}
	public static void move(){
	if(Gun.isTouchingX2() == true && Gun.isTouchingY2() == true && Gun.isAttacking() == true){
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
	public static void update(){
			move();
		
	}
}