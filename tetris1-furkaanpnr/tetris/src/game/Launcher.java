package game;

public class Launcher{
	public static void main(String[] args) {
		Game game1 = new Game("Tetris-1");
		game1.start();

		Game game2 = new Game("Tetris-2");
		game2.start();
	}
}
