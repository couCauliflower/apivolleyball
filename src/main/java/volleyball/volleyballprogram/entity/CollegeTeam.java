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
public class CollegeTeam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    里面字段有：id,collegeName(学院名称)，collegeImg(学院背景图片)，popularity(人气值)
    Integer Id;
    String collegeName;
    String collegeImg;
    String popularity;

}
