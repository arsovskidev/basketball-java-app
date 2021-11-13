
public class Player {
	private String player_name = null;
	private double player_ppg = 0;
	private double player_apg = 0;
	private double player_rpg = 0;
	private int player_rating = 0;

	public Player(String name, Double ppg, Double apg, Double rpg, int rating) {
		player_name = name; 
		player_ppg = ppg; 
		player_apg = apg; 
		player_rpg = rpg; 
		player_rating = rating; 
    }
	public String getName() {
		return player_name;
	}

}
