package volleyball.volleyballprogram.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import volleyball.volleyballprogram.entity.CollegeTeam;
import volleyball.volleyballprogram.service.CollegeTeamService;

import java.util.Optional;

@RestController
@RequestMapping("/api/collegeTeam")
public class CollegeTeamApi {
    @Autowired
    CollegeTeamService collegeTeamService;

//    需求（接口）1：添加院队基本信息（post请求）
//    http://localhost:8080/ball/api/collegeTeam
    @PostMapping
    public String addCollegeTeam(@RequestBody CollegeTeam collegeTeam){
        collegeTeamService.addCollegeTeam(collegeTeam);
        return "ok";
    }

//    需求（接口）2：根据collegeName来获取相应数据（get请求）
//    http://localhost:8080/ball/api/collegeTeam/search?collegeName=信院
    @GetMapping("search")
    public Optional<CollegeTeam> findCollegeTeams(String collegeName){
        return collegeTeamService.findCollegeTeams(collegeName);
    }

    //图片自定义上传
    @GetMapping("updatecollegeimg")
    public String updateAdminFaceimg(Integer id,String faceimg){
        collegeTeamService.updateAdminFaceimg(id,faceimg);
        return "ok";
    }

    //院队人气值修改
    @GetMapping("updatepopularity")
    public String updatePopularity(Integer id,String popularity){
        collegeTeamService.updatePopularity(id,popularity);
        return "ok";
    }

}
