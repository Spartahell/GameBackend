package Concrete;

import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	
	EDevletManager edManager = new EDevletManager();
	
	@Override
	public void Add(Gamer gamer) {
		if(edManager.CheckPerson(gamer)) {
			System.out.println("Sisteme Ba�ar�yla eklendi : "+gamer.getUserName());
		}else 
		{
			System.out.println("B�yle bir kullan�c� yok : "+gamer.getFirstName());
		}
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println("Ba�ar�yla silindi : "+gamer.getUserName());		
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println("Ba�ar�yla g�ncellendi : "+gamer.getUserName());
		
	}
}
