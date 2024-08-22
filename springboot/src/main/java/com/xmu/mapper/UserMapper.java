package com.xmu.mapper;
import com.xmu.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
public interface UserMapper {

    @Select("select * from user")
    public List<User> getAllUsers();
}
