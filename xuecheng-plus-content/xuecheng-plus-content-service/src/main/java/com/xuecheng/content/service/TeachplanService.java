package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.SaveTeachplanDto;
import com.xuecheng.content.model.dto.TeachplanDto;

import java.util.List;

/**
 * @author 蚂蚁
 * @version 1.0
 * @description TODO
 * @date 2023/3/5 14:47
 */

public interface TeachplanService {

    public List<TeachplanDto> findTeachplayTree(Long courseId);

    /**
    * @description 保存课程计划(新增/修改)
    * @param dto
    * @return void
    * @author 蚂蚁
    * @date 2023/3/6 11:31
    */
    public void saveTeachplan(SaveTeachplanDto dto);

    /**
    * @description 定义删除课程计划的接口
    * @param teachplanId
    * @return void
    * @author 蚂蚁
    * @date 2023/3/6 13:21
    */
    void deleteTeachplan(Long teachplanId);
}
