package cn.dao;

import cn.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 用户登录持久层接口
 * */
public interface UserDao {

    @Select("select * from user_table where username = #{username}")
    User findByUsername(String username);

    @Insert("insert into user_table (username,password) values (#{username},#{password})")
    void registerByUsernameAndPassword(@Param("username")String username,
                                       @Param("password")String password);
}
