package volleyball.volleyballprogram.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import volleyball.volleyballprogram.dao.ReviewDao;
import volleyball.volleyballprogram.entity.review;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ReviewService {
    @Autowired
    ReviewDao reviewDao;

    //1.添加回顾表数据Service
    public String addReview(review review){

        Date dd=new Date();
        //格式化
        SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time=sim.format(dd);
        review.setImgtime(time);

        reviewDao.save(review);
        return "ok";
    }
    //2.根据session获取所有图片相关信息列表
    public Page<review> getBySession(String session, Pageable pageable){
        review review = new review();
        review.setSession(session);
        return reviewDao.findAll(Example.of(review),pageable);
    }
}
