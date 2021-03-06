package com.youlai.admin.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 客户端信息
 */
@Data
public class OauthClientDetails  {

    @TableId(type = IdType.INPUT)
    @ApiModelProperty(value = "客户端ID")
    private String clientId;

    @ApiModelProperty(value = "客户端密钥")
    private String clientSecret;


    @ApiModelProperty(value = "资源id列表")
    private String resourceIds;

    @ApiModelProperty(value = "授权方式")
    private String authorizedGrantTypes;

    @ApiModelProperty("回调地址")
    private String webServerRedirectUri;

    @ApiModelProperty(value = "权限列表")
    private String authorities;

    @ApiModelProperty(value = "请求令牌有效时间")
    private Integer accessTokenValidity;

    @ApiModelProperty(value = "刷新令牌有效时间")
    private Integer refreshTokenValidity;

    @ApiModelProperty(value = "扩展信息")
    private String additionalInformation;

    @ApiModelProperty(value = "是否自动放行")
    private String autoapprove;

}
