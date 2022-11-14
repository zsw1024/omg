package net.lab1024.sa.common.module.support.captcha.domain;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 图形验证码 表单
 *
 * @Author 1024创新实验室-主任: 卓大
 * @Date 2021-09-02 20:21:10
 * @Wechat zhuoda1024
 * @Email lab1024@163.com
 * @Copyright 1024创新实验室 （ https://1024lab.net ）
 */

@Data
public class CaptchaForm {

    /*
    * @NotBlank   放弃验证输入框的内容 不校验字符为空
     * */

    @ApiModelProperty(value = "验证码")
 //   @NotBlank(message = "验证码不能为空")
    private String captchaCode;

    @ApiModelProperty(value = "验证码uuid标识")
  //   @NotBlank(message = "验证码uuid标识不能为空")
    private String captchaUuid;
}
