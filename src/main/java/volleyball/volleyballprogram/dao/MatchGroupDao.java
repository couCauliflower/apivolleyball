package volleyball.volleyballprogram.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import volleyball.volleyballprogram.entity.matchGroup;

public interface MatchGroupDao extends JpaRepository<matchGroup,Integer> {
}
