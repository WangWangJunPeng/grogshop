package com.wjp.mapper;

import com.wjp.pojo.UserStatus;
import com.wjp.pojo.UserStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserStatusMapper {
    int countByExample(UserStatusExample example);

    int deleteByExample(UserStatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserStatus record);

    int insertSelective(UserStatus record);

    List<UserStatus> selectByExample(UserStatusExample example);

    UserStatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserStatus record, @Param("example") UserStatusExample example);

    int updateByExample(@Param("record") UserStatus record, @Param("example") UserStatusExample example);

    int updateByPrimaryKeySelective(UserStatus record);

    int updateByPrimaryKey(UserStatus record);
}