package com.whj.relation.mapper;

import com.whj.relation.model.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author wanghj
 * @Description: com.whj.relation.mapper
 * @Description TODO
 * @Date: 2019/9/28
 **/
@Mapper
public interface StudentMapper {
    @Select("select * from student where sno=#{sno}")
    Student findBySno(@Param("sno") String sno);


    ;
}
