package com.zyh.mybatis.mapper;

import com.zyh.mybatis.pojo.Course;
import org.apache.ibatis.annotations.Param;

public interface CourseMapper {
    Course selectCourse(@Param("id") int id);
}
