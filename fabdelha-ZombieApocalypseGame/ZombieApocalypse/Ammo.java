public class Ammo{
	private static String ammo0;
	private static String ammo1;
	private static String ammo2;
	private static String ammo3;
	private static String ammo4;
	private static String ammo5;
	private static String ammo6;
	private static String ammo7;
	private static String ammo8;
	private static int width;
	private static int height;
	private static double x;
	private static double y;

	public static void draw(){
		if(Gun.ammo == 0){
			StdDraw.picture(x, y, ammo0);
	}
		if(Gun.ammo == 1){
			StdDraw.picture(x, y, ammo1);
	}
		if(Gun.ammo == 2){
			StdDraw.picture(x, y, ammo2);
	}
		if(Gun.ammo == 3){
			StdDraw.picture(x, y, ammo3);
	}
		if(Gun.ammo == 4){
			StdDraw.picture(x, y, ammo4);
	}
		if(Gun.ammo == 5){
			StdDraw.picture(x, y, ammo4);
	}
		if(Gun.ammo == 6){
			StdDraw.picture(x, y, ammo6);
	}
		if(Gun.ammo == 7){
			StdDraw.picture(x, y, ammo7);
	}
		if(Gun.ammo == 8){
			StdDraw.picture(x, y, ammo8);
	}
	}

	public static void start(){
		ammo0 = "Images/Ammo0.png";
		ammo1 = "Images/Ammo1.png";
		ammo2 = "Images/Ammo2.png";
		ammo3 = "Images/Ammo3.png";
		ammo4 = "Images/Ammo4.png";
		ammo5 = "Images/Ammo5.png";
		ammo6 = "Images/Ammo6.png";
		ammo7 = "Images/Ammo7.png";
		ammo8 = "Images/Ammo8.png";
		width = 15;
		height = 15;
		x = 64;
		y = 450;
	}
}

