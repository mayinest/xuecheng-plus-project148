package com.xuecheng.content.model.dto;

import com.xuecheng.content.model.po.CourseCategory;
import lombok.Data;

import java.util.List;

/**
 * @author 蚂蚁
 * @version 1.0
 * @description TODO
 * @date 2023/2/24 15:32
 */

@Data
public class CourseCategoryTreeDto extends CourseCategory {

    //子分类
//    List childrenTreeNodes;

    List<CourseCategoryTreeDto> childrenTreeNodes;
}
