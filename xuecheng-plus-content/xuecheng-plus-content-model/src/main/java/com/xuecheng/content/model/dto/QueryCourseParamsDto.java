package com.xuecheng.content.model.dto;

import lombok.Data;
import lombok.ToString;

/**
 * @author 蚂蚁
 * @version 1.0
 * @description 课程查询参数Dto
 * @date 2023/2/21 15:55
 */

@Data
@ToString
public class QueryCourseParamsDto {
    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;
}
