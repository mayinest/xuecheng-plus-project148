package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;

import java.util.List;

/**
 * @author 蚂蚁
 * @version 1.0
 * @description 课程分类操作相关的service
 * @date 2023/2/25 13:46
 */

public interface CourseCategoryService {

    /***
    * @description 课程分类查询
    * @param id
    * @return 根结点下的所有子节点
    * @author 蚂蚁
    * @date 2023/2/25 13:47
    */
    public List<CourseCategoryTreeDto> queryTreeNodes(String id);
}
