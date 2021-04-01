package volleyball.volleyballprogram.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import volleyball.volleyballprogram.entity.TeamMember;

public interface TeamMemberDao extends JpaRepository<TeamMember,Integer> {
}
