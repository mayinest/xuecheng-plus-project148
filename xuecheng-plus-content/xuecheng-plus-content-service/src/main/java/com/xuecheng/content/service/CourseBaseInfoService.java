package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @author 蚂蚁
 * @version 1.0
 * @description 课程管理service
 * @date 2023/2/23 13:05
 */

public interface CourseBaseInfoService {

    /**
    * @description 课程参数
    * @param params 分页参数
     * @param queryCourseParamsDto 查询条件
    * @return com.xuecheng.base.model.PageResult<com.xuecheng.content.model.po.CourseBase>
    * @author 蚂蚁
    * @date 2023/2/23 13:16
    */
    public PageResult<CourseBase> queryCourseBaseList(PageParams params, QueryCourseParamsDto queryCourseParamsDto);
}
