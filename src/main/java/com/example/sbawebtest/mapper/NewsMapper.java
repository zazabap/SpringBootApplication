package com.example.sbawebtest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sbawebtest.pojo.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
* @author shiwenan
* @description 针对表【news】的数据库操作Mapper
* @createDate 2022-07-15 13:29:37
* @Entity com.example.mybatisplus.domain.News
*/
@Mapper
public interface NewsMapper extends BaseMapper<News> {

    Map<String, Object> selectMapById(long id);
    int insert(@Param("news") News news);
    int update(@Param("news") News news);
    int delete(@Param("news") News news);

}




