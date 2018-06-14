package com.zyh.mybatis.mapper;

import com.zyh.mybatis.pojo.Student;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper {
    Student selectStudent(@Param("id")int id);
}
