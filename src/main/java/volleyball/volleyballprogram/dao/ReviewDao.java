package volleyball.volleyballprogram.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import volleyball.volleyballprogram.entity.review;

public interface ReviewDao extends JpaRepository<review,Integer> {
}
