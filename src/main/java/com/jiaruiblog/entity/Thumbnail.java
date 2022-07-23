package com.jiaruiblog.entity;

import com.jiaruiblog.enums.ThumbnailEnum;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @ClassName Thumbnail
 * @Description TODO
 * @Author luojiarui
 * @Date 2022/7/23 5:57 下午
 * @Version 1.0
 **/
@Document
@Data
public class Thumbnail {

    @Id
    private String id;

    // 对象的id
    private String objectId;

    // 不同种类型
    private ThumbnailEnum thumbnailEnum;

    private String gridfsId;    // 大文件管理GridFS的ID

}
