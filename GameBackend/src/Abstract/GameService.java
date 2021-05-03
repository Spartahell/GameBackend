package Abstract;
import Entities.Game;
import Entities.Gamer;

public interface GameService {
	void Add(Game game);
	void Delete(Game game);
	void Update(Game game);
	void Buy(Game game,Gamer gamer);
}
