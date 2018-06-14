package com.zyh.mybatis.mapper;

import com.zyh.mybatis.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {
    int insert(Teacher teacher);
    Teacher selectTeacher(@Param("id") int id);
}
