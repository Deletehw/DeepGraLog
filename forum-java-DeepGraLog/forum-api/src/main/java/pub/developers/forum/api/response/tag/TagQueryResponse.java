package pub.developers.forum.api.response.tag;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Qiangqiang.Bian
 * @create 2020/10/31
 * @desc
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TagQueryResponse implements Serializable {

    private Long id;

    private String groupName;

    /**
     * name
     */
    private String name;

    /**
     * description
     */
    private String description;

    private Long refCount;

}
