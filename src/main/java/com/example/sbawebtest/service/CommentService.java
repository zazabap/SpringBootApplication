package com.example.sbawebtest.service;

import com.example.sbawebtest.pojo.Comment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.sbawebtest.pojo.News;
import com.example.sbawebtest.pojo.Comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
* @author shiwenan
* @description 针对表【comment】的数据库操作Service
* @createDate 2022-07-15 13:31:41
*/
public interface CommentService extends IService<Comment> {

    List<Comment> searchAllComments();


}
