package volleyball.volleyballprogram.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import volleyball.volleyballprogram.entity.matchData;
import volleyball.volleyballprogram.service.MatchDataService;

@RestController
@RequestMapping("/api/matchData")
public class MatchDataApi {
    @Autowired
    MatchDataService dataService;
    //添加赛事数据
    @PostMapping
    /*//输入地址：http://localhost:8080/ball/api/matchData Post
    //发送数据
    {
        "match_id":"1",
        "AScore1":"12",
        "AScore2":"12",
        "AScore3":"12",
        "ATotal":"36",
        "BScore1":"25",
        "BScore2":"25",
        "BScore3":"23",
        "BTotal":"75",
        "video":"暂无",
    }
成功返回”ok“
     */

    public String saveMatchData(@RequestBody matchData matchData){
    dataService.addMatchData(matchData);
    return "ok";
}

/*
根据赛事表id获取相应的数据（get请求）
输入地址：http://localhost:8080/ball/api/matchData/find?id=7 Get
 */
    @GetMapping("find")
    public matchData getAllById(int id){
        return dataService.getAllById(id);
    }
}
