package volleyball.volleyballprogram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import volleyball.volleyballprogram.dao.MatchStageDao;
import volleyball.volleyballprogram.dao.TeamDao;
import volleyball.volleyballprogram.entity.Team;
import volleyball.volleyballprogram.entity.matchStage;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;


@Service
public class MatchStageService {
    @Autowired
    MatchStageDao matchStageDao;

    @Autowired
    TeamDao teamDao;

    //1.需求（接口）1:添加赛事
    public void addMatch(matchStage match){
//        System.out.println(match);
        Team team=new Team();
        team.setTeamName(match.getAname());
        Optional<Team> newteam=teamDao.findOne(Example.of(team));
//        System.out.println(newteam);
        match.setAimg(newteam.get().getTeamImg());

        Team team1=new Team();
        team1.setTeamName(match.getBname());
        Optional<Team> newteam1=teamDao.findOne(Example.of(team1));
        match.setBimg(newteam1.get().getTeamImg());

        matchStageDao.save(match);
    }

    //:2.获取所有赛事列表（get请求）
    public Page<matchStage> getAllMatch(Pageable pageable){
        return matchStageDao.findAll(pageable);
    }

    //3.根据所属学院来获取相应学院的所有赛事列表，注意可根据ACollege或BCollege（get请求）
    public List<matchStage> getByCollege(String college){

        int i;
        List<matchStage> allmatch= matchStageDao.findAll();//全都查出来
        int size=allmatch.size();
        for(i=0;i<size;i++){
            System.out.println(i);
            System.out.println(allmatch);
            if(!(allmatch.get(i).getAcollege().equals(college)||allmatch.get(i).getBcollege().equals(college))){
                System.out.println(allmatch.get(i));
                allmatch.remove(i);
                size--;
                i--;
                System.out.println(allmatch);
            }
        }

        return allmatch;//返回筛选过的result


    }

    //4.根据球队名字来获取相应球队的所有赛事列表,注意可根据AName或BName
    public List<matchStage> getByName(String name){
        int i;
        List<matchStage> result= matchStageDao.findAll();//全都查出来
//        System.out.println(result.size());
        int size=result.size();
        for(i=0;i<size;i++){
            System.out.println(i);
            if(!(result.get(i).getAname().equals(name)||result.get(i).getBname().equals(name))){
//                System.out.println(result.get(i));
                result.remove(i);
                size--;
                i--;
                System.out.println(result);
               }
        }

        return result;//返回筛选过的result
    }

}
