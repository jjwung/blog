package cn.mycookies.pojo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Jann Lee
 * @description 字段修改与添加
 * @date 2019-06-30 22:20
 */
@ApiModel("添加博客实体类")
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlogAddRequest {

    @ApiModelProperty(value = "博客id", hidden = true)
    private Integer id;

    @Length(min = 1, max = 20, message = "title长度需在1-20之间")
    @ApiModelProperty(value = "标题", required = true)
    private String title;

    @NotNull
    @ApiModelProperty(value = "分类id", required = true)
    private Integer categoryId;

    @ApiModelProperty(value = "标签id")
    private List<Integer> tags;

    @ApiModelProperty(value = "封面图片url")
    private String coverImgUrl;

    @NotNull
    @Length(min = 1)
    @ApiModelProperty(value = "摘要", required = true)
    private String summary;

    @ApiModelProperty(value = "正文", required = true)
    private String content;

    @ApiModelProperty(value = "作者")
    private String author;
    /**
     * 置顶 转载
     */
    @ApiModelProperty(value = "标识code", allowableValues = "0-普通博客，1-置顶")
    private Integer code;

    @ApiModelProperty(value = "作为草稿，发布，删除", required = true)
    @NotNull
    private Integer status;

}