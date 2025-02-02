package center.misaki.pojo;

import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;

@Data
@Accessors(chain = true)
@Entity
@Table(name = "epub")
public class EpubInfo {
    //epub主键ID
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer epubId;
    //epub文件名
    private String epubName;
    //epub文件大小
    private Long size;
    //epub文件保存时间
    private String saveTime;
    //epub文件保存路径
    private String savePath;
    //与之关联的用户Id
    private Integer userId;
}
