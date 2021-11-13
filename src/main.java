import java.util.*;


public class main {

	public static void main(String[] args) {
		
		// The players available to play the game.

		// Specify the array size like below.
		Player [] players = new Player[4];

		// Create objects with the player class.
		// Add all player objects to an array.
		players[0] = new Player("Michael Jordan", 38.5, 5.2, 7.4, 99);
		players[1] = new Player("Stephen Curry", 30.5, 8.2, 4.4, 96);
		players[2] = new Player("Kobe Bryant", 39.5, 2.2, 3.4, 99);
		players[3] = new Player("LeBron James", 36.5, 8.2, 8.4, 98);


		System.out.println("Welcome to the blacktop");
		System.out.println("These are your available players!");

		// Loop through the players array and print each player's name.
		for (int i = 0; i < players.length; i++){
			System.out.println(players[i].getName());
		}
		
    }

	// Check if the specified element is present in the array or not using Linear Search Algo.
	public static boolean check(int[] arr, int to_check_value)
    {
        for (int element : arr) {
            if (element == to_check_value) {
                return true;
            }
        }
        return false;
    }
}