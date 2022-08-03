package com.example.sbawebtest.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.sbawebtest.mapper.NewsMapper;
import com.example.sbawebtest.pojo.News;
import com.example.sbawebtest.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author shiwenan
* @description 针对表【news】的数据库操作Service实现
* @createDate 2022-07-15 13:29:37
*/
@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper, News>
    implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    public List<News> searchAllNews(){
        return newsMapper.selectList(null);
    }

}




