package volleyball.volleyballprogram.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import volleyball.volleyballprogram.entity.matchStage;

public interface MatchStageDao extends JpaRepository<matchStage,Integer> {
}
