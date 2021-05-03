package Abstract;

import Entities.Campain;
import Entities.Game;

public interface CampainService {
	void Add(Campain campain);
	void Delete(Campain campain);
	void Update(Campain campain);
	void Apply(Campain campain, Game game);
}
