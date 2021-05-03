package Concrete;
import Abstract.EDevletService;
import Entities.Gamer;

public class EDevletManager implements EDevletService {

	@Override
	public Boolean CheckPerson(Gamer gamer) {
		if(gamer.getCitizenId() != "") {
			return true ;
		}else {
			return false ;
		}
		
	}

}
