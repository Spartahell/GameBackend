package Concrete;
import Abstract.CampainService;
import Entities.Campain;
import Entities.Game;

public class CampainManager implements CampainService {

	@Override
	public void Add(Campain campain) {
		System.out.println("Kampanya ba�ar�yla eklendi "+ campain.getName());
		
	}

	@Override
	public void Delete(Campain campain) {
		System.out.println("Kampanya ba�ar�yla silindi  "+ campain.getName());
		
	}

	@Override
	public void Update(Campain campain) {
		System.out.println("Kampanya ba�ar�yla g�ncellendi  "+ campain.getName());
		
	}

	@Override
	public void Apply(Campain campain, Game game) {
		double newPrice = game.getPrice() - (game.getPrice()*campain.getRate()/100);
		game.setPrice(newPrice);
		System.out.println("Kampanya ba�ar�yla uyguland� : "+game.getPrice());
		
	}

}
