package volleyball.volleyballprogram.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import volleyball.volleyballprogram.entity.matchGroup;
import volleyball.volleyballprogram.service.MatchGroupService;

@RestController
@RequestMapping("api/matchGroup")
public class MatchGroupApi {
    @Autowired
    MatchGroupService matchGroupService;

    //添加一条赛事数据
    /*
    地址：http://localhost:8080/ball/api/matchGroup Post
    {
    "matchGroup":"B组",
    "matchGroupGame":"淘汰赛",
    "matchGroupRange":"1",
    "matchGroupTeamName":"信院菜鸡队",
    "matchGroupScore":"25",
    "matchGroupWinLose":"Lose",
    "matchGroupWinRate":"50%"
}
     */
    @PostMapping
    public String Addone(@RequestBody matchGroup matchGroup){
        matchGroupService.addOne(matchGroup);
        return "ok";
    }

    //根据group和game查询整个列表数据
    /*
    地址：http://localhost:8080/ball/api/matchGroup/search?group=A组&game=淘汰赛&page=0&size=5
     */
    @GetMapping("search")
    public Page<matchGroup> getByGroup(String group, String game, Pageable pageable){
        return matchGroupService.getMatchGroupByGroupGame(group,game,pageable);
    }
}
