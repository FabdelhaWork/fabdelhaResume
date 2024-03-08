public class Gun{
	//Gun data
	private static String image;
	private static int width;
	private static int height;
	public static int ammo = 8;
	private static double x;
	private static double y;
	public static boolean isAttacking;
	public static boolean isTouchingX(){
		boolean isTouchingX;
		isTouchingX = Math.abs(Enemy.x - Gun.x) < Gun.width;
		return isTouchingX;
	}
	public static boolean isTouchingY(){
		boolean isTouchingY;
		isTouchingY = Math.abs(Enemy.y - Gun.y) < Gun.height;
		return isTouchingY;
	}
	public static boolean isTouchingX2(){
		boolean isTouchingX2;
		isTouchingX2 = Math.abs(Enemy2.x - Gun.x) < Gun.width;
		return isTouchingX2;
	}
	public static boolean isTouchingY2(){
		boolean isTouchingY2;
		isTouchingY2 = Math.abs(Enemy2.y - Gun.y) < Gun.height;
		return isTouchingY2;
	}
	public static boolean isTouchingX3(){
		boolean isTouchingX3;
		isTouchingX3 = Math.abs(Enemy3.x - Gun.x) < Gun.width;
		return isTouchingX3;
	}
	public static boolean isTouchingY3(){
		boolean isTouchingY3;
		isTouchingY3 = Math.abs(Enemy3.y - Gun.y) < Gun.height;
		return isTouchingY3;
	}
	public static boolean isTouchingX4(){
		boolean isTouchingX4;
		isTouchingX4 = Math.abs(Enemy4.x - Gun.x) < Gun.width;
		return isTouchingX4;
	}
	public static boolean isTouchingY4(){
		boolean isTouchingY4;
		isTouchingY4 = Math.abs(Enemy4.y - Gun.y) < Gun.height;
		return isTouchingY4;
	}
	public static boolean isTouchingX5(){
		boolean isTouchingX5;
		isTouchingX5 = Math.abs(Enemy5.x - Gun.x) < Gun.width;
		return isTouchingX5;
	}
	public static boolean isTouchingY5(){
		boolean isTouchingY5;
		isTouchingY5 = Math.abs(Enemy5.y - Gun.y) < Gun.height;
		return isTouchingY5;
	}
	public static void draw(){
		StdDraw.picture(x+width/2, y+height/2, image);
	}
	public static boolean isAttacking(){
		return isAttacking;
	}

	public static void start(){
		image = "Images/aimer.png";
		width = 15;
		height = 15;
		x = Scene.getWidth();
		y = Scene.getHeight();
		isAttacking = false;
	}
	public static void move(){
		x = StdDraw.mouseX() - width/2;
		y = StdDraw.mouseY() - height/2;
	}
	public static void update(){
		move();		//update Gun
		attack();   //update attack
	}
	public static void attack(){
		if (StdDraw.mousePressed() && ammo > 0){
			isAttacking = true;
			ammo--;
		}
		else{
			isAttacking = false;
		}
	}
}