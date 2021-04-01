package volleyball.volleyballprogram.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import volleyball.volleyballprogram.entity.matchData;

public interface MatchDataDao extends JpaRepository<matchData,Integer> {
}
