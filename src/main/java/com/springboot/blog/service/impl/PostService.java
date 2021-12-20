package com.springboot.blog.service.impl;

import com.springboot.blog.payload.PostDto;

public interface PostService {
    PostDto createPost(PostDto postDto);
}
