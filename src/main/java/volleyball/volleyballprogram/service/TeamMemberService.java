package volleyball.volleyballprogram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import volleyball.volleyballprogram.dao.TeamMemberDao;
import volleyball.volleyballprogram.entity.Team;
import volleyball.volleyballprogram.entity.TeamMember;

import java.util.Optional;

@Service
public class TeamMemberService {
    @Autowired
    TeamMemberDao teamMemberDao;
    public void addTeamMember(TeamMember teamMember) {
        teamMemberDao.save(teamMember);
    }

    public Page<TeamMember> findTeamMembers(String teamName, Pageable pageable) {
        TeamMember teamMember=new TeamMember();
        teamMember.setTeamName(teamName);
        return teamMemberDao.findAll(Example.of(teamMember),pageable);


    }

    public Optional<TeamMember> getTeamMemberInfo(String name) {
        TeamMember teamMember=new TeamMember();
        teamMember.setNickName(name);
        return teamMemberDao.findOne(Example.of(teamMember));
    }
}
