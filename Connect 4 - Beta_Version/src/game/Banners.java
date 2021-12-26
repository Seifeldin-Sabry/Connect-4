package game;

import java.util.Scanner;

import static game.GameSession.printNewScreen;

public class Banners {
	public static void printLogo() {
		String logo = """
				  ______   ______   .__   __. .__   __.  _______   ______ .___________.    _  _
				 /      | /  __  \\  |  \\ |  | |  \\ |  | |   ____| /      ||           |   | || |
				|  ,----'|  |  |  | |   \\|  | |   \\|  | |  |__   |  ,----'`---|  |----`   | || |_
				|  |     |  |  |  | |  . `  | |  . `  | |   __|  |  |         |  |        |__   _|
				|  `----.|  `--'  | |  |\\   | |  |\\   | |  |____ |  `----.    |  |           | |
				 \\______| \\______/  |__| \\__| |__| \\__| |_______| \\______|    |__|           |_|
				""";
		System.out.println(logo);
	}

	public static void printGameOver() {
		String gameOver = """
				  _______      ___      .___  ___.  _______      ______   ____    ____  _______ .______     \s
				 /  _____|    /   \\     |   \\/   | |   ____|    /  __  \\  \\   \\  /   / |   ____||   _  \\    \s
				|  |  __     /  ^  \\    |  \\  /  | |  |__      |  |  |  |  \\   \\/   /  |  |__   |  |_)  |   \s
				|  | |_ |   /  /_\\  \\   |  |\\/|  | |   __|     |  |  |  |   \\      /   |   __|  |      /    \s
				|  |__| |  /  _____  \\  |  |  |  | |  |____    |  `--'  |    \\    /    |  |____ |  |\\  \\----.
				 \\______| /__/     \\__\\ |__|  |__| |_______|    \\______/      \\__/     |_______|| _| `._____|
				                                                                                            \s
				Press Enter to continue\040""";
		System.out.println(gameOver);
	}

	public static void youWin() {
		String youWin = """
				  ____    ____  ______    __    __     ____    __    ____  __  .__   __.\s
				  \\   \\  /   / /  __  \\  |  |  |  |    \\   \\  /  \\  /   / |  | |  \\ |  |\s
				   \\   \\/   / |  |  |  | |  |  |  |     \\   \\/    \\/   /  |  | |   \\|  |\s
				    \\_    _/  |  |  |  | |  |  |  |      \\            /   |  | |  . `  |\s
				      |  |    |  `--'  | |  `--'  |       \\    /\\    /    |  | |  |\\   |\s
				      |__|     \\______/   \\______/         \\__/  \\__/     |__| |__| \\__|\s
				Press Enter to continue\040""";
		System.out.println(youWin);
	}

	public static void printInstructions(Scanner scanner) {
		String instructions = """
				Rules and instructions:
				 - Your objective is to be the first to connect 4
						
				 - You can connect four vertically, horizontally, diagonally
				    
				 - The game ends when a player connects four or all squares are filled (draw)
				    
				    
				Press Enter to continue""";
		printNewScreen();
		System.out.print(instructions);
		scanner.nextLine();
	}


	public static void printWelcomeScreen() {
		String s = """ 
				Highscores:
				            Name        Moves     Time (seconds)
				1.................xxx       8               1:16
				2.................abc      10               1:23
				3..............pinkie      14               1:00
				4..............blabla      18               2:12
				5..........helloworld      18               2:43
				 
				Start a new game..........n
				Load a saved game.........l
				View game instruction.....i
				Close game................e
								
				""";
		printNewScreen();
		Banners.printLogo();
		System.out.print(s);
	}
}