package Concrete;

import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {
	
	EDevletManager edManager = new EDevletManager();
	
	@Override
	public void Add(Gamer gamer) {
		if(edManager.CheckPerson(gamer)) {
			System.out.println("Sisteme Baþarýyla eklendi : "+gamer.getUserName());
		}else 
		{
			System.out.println("Böyle bir kullanýcý yok : "+gamer.getFirstName());
		}
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println("Baþarýyla silindi : "+gamer.getUserName());		
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println("Baþarýyla güncellendi : "+gamer.getUserName());
		
	}
}
