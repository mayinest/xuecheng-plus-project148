package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.model.dto.AddCourseDto;
import com.xuecheng.content.model.dto.CourseBaseInfoDto;
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
     * @param params               分页参数
     * @param queryCourseParamsDto 查询条件
     * @return com.xuecheng.base.model.PageResult<com.xuecheng.content.model.po.CourseBase>
     * @description 课程参数
     * @author 蚂蚁
     * @date 2023/2/23 13:16
     */
    public PageResult<CourseBase> queryCourseBaseList(PageParams params, QueryCourseParamsDto queryCourseParamsDto);

    /***
    * @description 新增课程
    * @param companyId 培训机构id
     * @param addCourseDto 新增课程的信息
    * @return 课程信息包括基本信息、营销信息
    * @author 蚂蚁
    * @date 2023/2/27 12:16
    */
    public CourseBaseInfoDto createCourseBase(Long companyId,AddCourseDto addCourseDto);
}
