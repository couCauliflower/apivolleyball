package volleyball.volleyballprogram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import volleyball.volleyballprogram.dao.MatchDataDao;
import volleyball.volleyballprogram.entity.Team;
import volleyball.volleyballprogram.entity.matchData;

import java.util.List;
import java.util.Optional;


@Service
public class MatchDataService {
    @Autowired
    MatchDataDao matchDataDao;
    //1.添加数据
    public void addMatchData(matchData matchData){
        matchDataDao.save(matchData);
    }

    //2.根据赛事表id获取相应的数据
    public matchData getAllById(int id){

        matchData matchdata= new matchData();
        matchdata.setMatchid(id);
        Optional<matchData> matchresult=matchDataDao.findOne(Example.of(matchdata));
        return matchresult.get();
    }

}
