package cn.mycookies.pojo.dto;

import cn.mycookies.common.CommentTargetType;
import cn.mycookies.common.JsonBean;
import cn.mycookies.common.PageInfo4Request;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * 评论列表请求参数
 *
 * @author Jann Lee
 * @date 2019-07-04 21:50
 **/
@Data
@JsonBean
@ApiModel
public class CommentListRequest extends PageInfo4Request {
    /**
     * 被评论主体类型
     */
    @ApiModelProperty("被评论主体类型")
    @NotNull
    private CommentTargetType targetType;
}