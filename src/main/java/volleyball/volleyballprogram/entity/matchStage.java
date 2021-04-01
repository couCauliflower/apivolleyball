package volleyball.volleyballprogram.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class matchStage {//赛事表
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String time;//比赛时间
    String place;//比赛地点
    String aname;//A队名字
    String aimg;//A队图片
    String acollege;//A队学院
    String bname;//B队名字
    String bimg;//B队图片
    String bcollege;//B队学院
    String begin;//是否开始
    String stage;//赛事所属阶段

}
