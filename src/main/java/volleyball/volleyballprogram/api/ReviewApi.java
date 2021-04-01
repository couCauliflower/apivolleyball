package volleyball.volleyballprogram.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import volleyball.volleyballprogram.entity.review;
import volleyball.volleyballprogram.service.ReviewService;

import java.awt.print.Pageable;

@RestController
@RequestMapping("api/review")
public class ReviewApi {
    @Autowired
    ReviewService reviewService;

    //需求（接口）1：添加回顾表数据（post请求）
    @PostMapping
    /*
    地址：http://localhost:8080/ball/api/review Post
  {
    "session":"属于哪届",
    "img":"照片地址",
    "imgTime":"照片时间",
    "imgLike":"点赞数",
    "video":"暂无"
}
     */
    public String addReview(@RequestBody review review){
        reviewService.addReview(review);
        return "ok";
    }

    //需求（接口）2：根据session获取所有图片相关信息列表（get请求）
    @GetMapping("find")
    /*
    地址：http://localhost:8080/ball/api/review/find?session=18&page=0&size=5 Get
     */
    public Page<review> findBySession(String session,int page,int size){
        return reviewService.getBySession(session, PageRequest.of(page,size));
    }
}
