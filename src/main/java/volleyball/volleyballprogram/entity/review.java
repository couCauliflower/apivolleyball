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
public class review {//回顾表
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String session;//属于哪届
    String img;//照片
    String imgtime;//照片时间
    String imglike;//照片点赞数
    String video;//集锦待定

}
