package com.example.sbawebtest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.sbawebtest.pojo.Ad;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
* @author shiwenan
* @description 针对表【ad】的数据库操作Mapper
* @createDate 2022-07-15 13:32:13
* @Entity com.example.mybatisplus.pojo.Ad
*/
@Mapper
public interface AdMapper extends BaseMapper<Ad> {

    Map<String, Object> selectMapById(long id);
    int insert(@Param("ad") Ad ad);
    int update(@Param("ad") Ad ad);
    int delete(@Param("ad") Ad ad);

}




