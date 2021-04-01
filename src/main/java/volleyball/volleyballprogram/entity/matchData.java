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
public class matchData {//数据表
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer matchid;//赛事表ID
    Integer ascore1;//A第一局得分
    Integer ascore2;//A第二局得分
    Integer ascore3;//A第三局得分
    Integer atotal;//A第一局得分
    Integer bscore1;//B第一局得分
    Integer bscore2;//B第一局得分
    Integer bscore3;//B第一局得分
    Integer btotal;//B队总得分
    String video;//视频
}
