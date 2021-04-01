package volleyball.volleyballprogram.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import volleyball.volleyballprogram.entity.matchStage;
import volleyball.volleyballprogram.service.MatchStageService;

import java.util.List;

@RestController
@RequestMapping("api/match")
public class MatchStageApi {
    @Autowired
    MatchStageService matchService;

    /*
    需求：1:添加赛事（post请求）
    地址：http://localhost:8080/ball/api/match Post
     */
    @PostMapping

    public String addOne(@RequestBody matchStage matchStage){
        matchService.addMatch(matchStage);
        return "ok";
    }

/*
2:获取所有赛事列表（get请求）
地址:http://localhost:8080/ball/api/match/find Get
 */
    @GetMapping("find")
    public Page<matchStage> getAllMatch(int page,int size){
        return matchService.getAllMatch(PageRequest.of(page, size));

    }
    /*
    地址：http://localhost:8080/ball/api/match/findByCollege?College=信息&page=0&size=5
     */
    @GetMapping("findByCollege")
    public List<matchStage> getByCollege(String college){
        return matchService.getByCollege(college);

    }

    /*
    根据球队名字来获取相应球队的所有赛事列表,注意可根据AName或BName（get请求）
    地址：http://localhost:8080/ball/api/match/findByCollege?College=信息&page=0&size=5
     */
    @GetMapping("findByName")
    public List<matchStage> getByName(String name){
        return matchService.getByName(name);
    }


}
