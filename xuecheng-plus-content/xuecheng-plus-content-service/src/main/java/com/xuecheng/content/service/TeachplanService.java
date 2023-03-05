package com.xuecheng.content.service;

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
}
