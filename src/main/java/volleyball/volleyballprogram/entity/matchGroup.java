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
public class matchGroup {//比赛统计表
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String matchgroup;//所在分组
    String matchgroupgame;//所在赛事阶段
    String matchgrouprange;//排名
    String matchgroupteamname;//球队名称
    String matchgroupscore;//积分
    String matchgroupwinlose;//胜-负
    String matchgroupwinrate;//胜率
}
