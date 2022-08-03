package com.example.sbawebtest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sbawebtest.pojo.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/**
* @author shiwenan
* @description 针对表【comment】的数据库操作Mapper
* @createDate 2022-07-15 13:31:41
* @Entity com.example.mybatisplus.pojo.Comment
*/
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {

    Map<String, Object> selectMapById(long id);
    int insert(@Param("comment") Comment comment);
    int update(@Param("comment") Comment comment);
    int delete(@Param("comment") Comment comment);

}




