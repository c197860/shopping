package cn.bdqn.service;

import cn.bdqn.dao.CommentsMapper;
import cn.bdqn.pojo.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    @Autowired
    CommentsMapper commentsMapper;


    public int insertselect(Comments comments) {
        int result=commentsMapper.insertSelective(comments);
        return result;
    }
}
