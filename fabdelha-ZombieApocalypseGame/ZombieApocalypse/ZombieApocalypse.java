public class Game{
	public static void main(String[] args){
			start();	//Start Game
						//Game Loop:
			update();		//1. Update Game
			render();		//2. Render Game
		public static void render(){
			Scene.draw();		//Draw Scene
								//Draw Zombie
								//Draw Player
			StdDraw.show(100);	//Show Graphic
		}

		public static void update(){
			//Check for Input
			//Update Player
			//Update Zombie

		}

		public static void start(){
		//Setup All Game Data
		Scene.start();	//Setup Scene Data
						//Setup Zombie Data
						//Setup Player Data

		}
	}
}