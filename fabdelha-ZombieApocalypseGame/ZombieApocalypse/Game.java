public class Game {
	public static boolean gameOver = false;
	public static void main(String[] args){
			start();						//Start Game
			while (gameOver == false){		//Game Loop:
			update();							//1. Update Game
			render();							//2. Render Game
		}
	}
	public static void render(){
		Scene.draw();		//Draw Scene
		Beartrap.draw();
		Enemy.draw();		//Draw Zombie
		Enemy2.draw();
		Enemy3.draw();
		Enemy4.draw();
		Enemy5.draw();
		Ammo.draw();
		Gun.draw();
		Player.draw();		//Draw Player
		Helicopter.draw();  //Draw Helicopter
		Scene2.draw();
		StdDraw.show(100);	//Show Graphic
	}

	public static void update(){
							//Check for Input
		Player.update();	//Update Player
		Enemy.update();		//Update Zombie
		Enemy2.update();
		Enemy3.update();
		Enemy4.update();
		Enemy5.update();
		Gun.update();

	}

	public static void start(){
		//Setup All Game Data
		Scene.start();		//Setup Scene Data
		Beartrap.start();
		Scene2.start();
		Enemy.start();		//Setup Zombie Data
		Enemy2.start();
		Enemy3.start();
		Enemy4.start();
		Enemy5.start();
		Ammo.start();
		Player.start();		//Setup Player Data
		Helicopter.start(); //Setuop Helicopter Data
		Gun.start();
	}
}