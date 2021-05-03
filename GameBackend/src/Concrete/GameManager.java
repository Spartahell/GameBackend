package Concrete;

import Abstract.GameService;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService {

	@Override
	public void Add(Game game) {
		System.out.println("Oyun Baþarýyla Eklendi : "+game.getName());
		
	}

	@Override
	public void Delete(Game game) {
		System.out.println("Oyun Baþarýyla Silindi  : "+game.getName());
		
	}

	@Override
	public void Update(Game game) {
		System.out.println("Oyun Baþarýyla Güncellendi  : "+game.getName());
		
	}

	@Override
	public void Buy(Game game, Gamer gamer) {
		System.out.println(gamer.getUserName() + " tarafýndan " + game.getName()+ " satýn alýndý");
		
	}



}
