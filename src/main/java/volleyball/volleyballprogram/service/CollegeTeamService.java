package volleyball.volleyballprogram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;
import volleyball.volleyballprogram.dao.CollegeTeamDao;
import volleyball.volleyballprogram.entity.CollegeTeam;

import java.util.Optional;

@Service
public class CollegeTeamService {
    @Autowired
    CollegeTeamDao collegeTeamDao;

    public void addCollegeTeam(CollegeTeam collegeTeam) {
        collegeTeamDao.save(collegeTeam);
    }

    public Optional<CollegeTeam> findCollegeTeams(String collegeName) {
        CollegeTeam collegeTeam = new CollegeTeam();
        collegeTeam.setCollegeName(collegeName);
        return collegeTeamDao.findOne(Example.of(collegeTeam));
    }

    public void updateAdminFaceimg(Integer id, String faceimg) {
        Optional<CollegeTeam> optionalCollegeTeam=collegeTeamDao.findById(id);
        optionalCollegeTeam.get().setCollegeImg(faceimg);
        collegeTeamDao.save(optionalCollegeTeam.get());
    }

    public void updatePopularity(Integer id, String popularity) {
        Optional<CollegeTeam> optionalCollegeTeam=collegeTeamDao.findById(id);
        optionalCollegeTeam.get().setPopularity(popularity);
        collegeTeamDao.save(optionalCollegeTeam.get());
    }
}
