package Concrete;

import Abstract.GameService;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void Add(Game game) {
		System.out.println("Oyun Ba�ar�yla Eklendi : "+game.getName());
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println("Oyun Ba�ar�yla Silindi  : "+game.getName());
		
	}

	@Override
	public void Update(Game game) {
		System.out.println("Oyun Ba�ar�yla G�ncellendi  : "+game.getName());
		
	}

	@Override
	public void Buy(Game game, Gamer gamer) {
		System.out.println(gamer.getUserName() + " taraf�ndan " + game.getName()+ " sat�n al�nd�");
		
	}



}
