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
public class TeamMember {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;
//    里面字段有：id,teamName(所属球队名称),
//    type(标识是队长或队员),nickName(成员名称),studyNumber(成员学号),faceUrl(成员头像)，
//    number(球服号码)，position(比赛位置，二传或其他)
    String teamName;
    String type;
    String nickName;
    String studyNumber;
    String faceUrl;
    String number;
    String position;
}
