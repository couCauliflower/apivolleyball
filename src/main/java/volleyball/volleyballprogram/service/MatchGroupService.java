package volleyball.volleyballprogram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import volleyball.volleyballprogram.dao.MatchGroupDao;
import volleyball.volleyballprogram.entity.matchGroup;

@Service
public class MatchGroupService {
    @Autowired
    MatchGroupDao matchGroupDao;
    //1.加一条数据
    public void addOne(matchGroup matchGroup) {
        matchGroupDao.save(matchGroup);

    }

    //2.根据group与game字段来查询相应的数据列表
    public Page<matchGroup> getMatchGroupByGroupGame(String group, String game, Pageable pageable) {
        matchGroup group1 = new matchGroup();
        group1.setMatchgroupgame(game);
        group1.setMatchgroup(group);
        return matchGroupDao.findAll(Example.of(group1),pageable);
    }
}
