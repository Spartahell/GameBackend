import Concrete.CampainManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Entities.Campain;
import Entities.Game;
import Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		GameManager gameManager = new GameManager();
		GamerManager gamerManager = new GamerManager();
		CampainManager cManager = new CampainManager();
		
		Game game1 = new Game(1, "GTA V", 200);
		Game game2 = new Game(2, "Pes 2013", 100);
		Game game3 = new Game(3, "CS:GO", 300);
		Game[] games = {game1,game2,game3};
		
		Gamer gamer = new Gamer(1, "Sabri", "Turhan", "Spartahell", "10101010101", "2005",games);
		
		Campain campain = new Campain(1, "Muhteþem Yaz Kampanyasý ", 10);
		
		gamerManager.Add(gamer);
		gamerManager.Delete(gamer);
		gamerManager.Update(gamer);
		
		gameManager.Buy(game3, gamer);
		
		cManager.Apply(campain, game1);
		
		
	}

}
