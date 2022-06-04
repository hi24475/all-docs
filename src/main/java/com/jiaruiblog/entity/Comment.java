package com.jiaruiblog.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @ClassName Comment
 * @Description TODO
 * @Author luojiarui
 * @Date 2022/6/4 10:31 上午
 * @Version 1.0
 **/
@Data
public class Comment {

    @Id
    private Long id;

    @NotNull
    private Integer createUser;

    @NotBlank(message = "")
    private String content;

    private Date createDate;

    private Date updateDate;
}