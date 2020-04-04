package com.whj.relation.mapper;

import com.whj.relation.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @Author wanghj
 * @Description: com.whj.relation.mapper
 * @Description TODO 数据库中叫 model
 * @Date: 2019/9/19
 **/
@Mapper
public interface UserMapper {
    @Insert({"insert into user(name,account_id,token) values(#{name},#{accountId},#{token})"})
    void insert(User user);
    @Select("select * from user where token=#{token}")
    User findByToken(@Param("token") String token);


}
