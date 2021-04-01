package volleyball.volleyballprogram.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import volleyball.volleyballprogram.entity.CollegeTeam;

public interface CollegeTeamDao extends JpaRepository<CollegeTeam,Integer> {
}
