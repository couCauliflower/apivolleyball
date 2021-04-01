package volleyball.volleyballprogram.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import volleyball.volleyballprogram.entity.TeamMember;
import volleyball.volleyballprogram.service.TeamMemberService;

import java.util.Optional;

@RestController
@RequestMapping("/api/teamMember")
public class TeamMemberApi {
    @Autowired
    TeamMemberService teamMemberService;

//    需求（接口）1：添加成员（post请求）
//    http://localhost:8080/ball/api/teamMember
    @PostMapping
    public String addTeamMember(@RequestBody TeamMember teamMember){
        teamMemberService.addTeamMember(teamMember);
        return "ok";
    }

//    需求（接口）2：根据teamName来获取该球队所有成员列表（get请求）
//    http://localhost:8080/ball/api/teamMember/search?teamName=信院男排1队&page=0&size=50
    @GetMapping("search")
    public Page<TeamMember> findTeamMembers(String teamName,int page,int size){
        return teamMemberService.findTeamMembers(teamName, PageRequest.of(page,size));
    }

//    需求（接口）3：根据nickName来获取相应的数据列表（主要获得teamName,在我的页面我的队伍使用）（get请求）

//    http://localhost:8080/ball/api/teamMember/find?name=李根生
    @GetMapping("find")
    public Optional<TeamMember> getTeamMemberInfo(String name){
        return teamMemberService.getTeamMemberInfo(name);

    }
}
