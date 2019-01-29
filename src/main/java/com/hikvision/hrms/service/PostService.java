package com.hikvision.hrms.service;

import com.hikvision.hrms.mapper.PositionMapper;
import com.hikvision.hrms.mapper.PostMapper;
import com.hikvision.hrms.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author : yangliu449
 * @date :  2019/1/28
 */
@Service
public class  PostService {
    @Autowired
    PostMapper postMapper;

    public List<Post> findPosts(Map<String, Object> map) {
        return postMapper.findPosts(map);
    }

    public Integer getCount(Map<String, Object> map) {
        return postMapper.getCount(map);
    }
    public Integer addPost(Post post) {
        return postMapper.addPost(post);
    }
    public Integer updatePost(Post post) {
        return  postMapper.updatePost(post);
    }

    public Integer deletePost(Integer id) {
        return postMapper.deletePost(id);
    }

    public Post getPostById(Integer id) {
        return postMapper.getPostById(id);
    }
}
