package com.example.sbawebtest.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.sbawebtest.pojo.News;

import java.util.List;

/**
* @author shiwenan
* @description 针对表【news】的数据库操作Service
* @createDate 2022-07-15 13:29:37
*/
public interface NewsService extends IService<News> {

    List<News> searchAllNews();

}
