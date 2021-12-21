package com.springboot.blog.service.impl;

import com.springboot.blog.entity.Post;
import com.springboot.blog.exception.ResourceNotFoundException;
import com.springboot.blog.payload.PostDto;
import com.springboot.blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {
    private PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        //convert DTO to entity
//        Post post = new Post();
//        post.setTitle(postDto.getTitle());
//        post.setDescription(postDto.getDescription());
//        post.setContent(postDto.getContent());
        Post post = mapToEntity(postDto);
        Post newPost = postRepository.save(post);

        //Convert Entity to DTO
        PostDto postResponse = mapToDTO(newPost);

        return postResponse;
    }

    @Override
    public List<PostDto> getAllPosts() {
        List<Post> posts = postRepository.findAll();
        return posts.stream().map(post -> mapToDTO(post)).collect(Collectors.toList());

    }

    @Override
    public PostDto getPostById(long id) {
        Post post;
        post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        return mapToDTO(post);
    }

    @Override
    public PostDto updatePost(PostDto postDto, long id) {
        // get Post by Id from the database
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));

        post.setLckrid(postDto.getLckrid());
        post.setLckrcod(postDto.getLckrcod());
        post.setLckrnam(postDto.getLckrnam());
        post.setVencod(postDto.getVencod());
        post.setBrandcod(postDto.getBrandcod());
        post.setNumofdrwr(postDto.getNumofdrwr());
        post.setLckrdes(postDto.getLckrdes());
        post.setRemarks(postDto.getRemarks());
        post.setOprstamp(postDto.getOprstamp());
        post.setOprtimstamp(postDto.getOprtimstamp());
        post.setUpdstamp(postDto.getUpdstamp());
        post.setUpdtimstamp(postDto.getUpdtimstamp());
        post.setActflg(postDto.getActflg());
        post.setBokflg(postDto.getBokflg());
        post.setAppflg(postDto.getAppflg());
        post.setAppstamp(postDto.getAppstamp());
        post.setApptimstamp(postDto.getApptimstamp());

        Post updatedPost = postRepository.save(post);
        return mapToDTO(updatedPost);
    }

    @Override
    public void deletePostById(long id) {
        // get Post by Id from the database
        Post post = postRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Post", "id", id));
        postRepository.delete(post);
    }

    //convert Entity Into DTO
    private PostDto mapToDTO(Post post) {
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setLckrid(post.getLckrid());
        postDto.setLckrcod(post.getLckrcod());
        postDto.setLckrnam(post.getLckrnam());
        postDto.setVencod(post.getVencod());
        postDto.setBrandcod(post.getBrandcod());
        postDto.setNumofdrwr(post.getNumofdrwr());
        postDto.setLckrdes(post.getLckrdes());
        postDto.setRemarks(post.getRemarks());
        postDto.setOprstamp(post.getOprstamp());
        postDto.setOprtimstamp(post.getOprtimstamp());
        postDto.setUpdstamp(post.getUpdstamp());
        postDto.setUpdtimstamp(post.getUpdtimstamp());
        postDto.setActflg(post.getActflg());
        postDto.setBokflg(post.getBokflg());
        postDto.setAppflg(post.getAppflg());
        postDto.setAppstamp(post.getAppstamp());
        postDto.setApptimstamp(post.getApptimstamp());


        return postDto;
    }

    private Post mapToEntity(PostDto postDto) {
        Post post = new Post();
        post.setLckrid(postDto.getLckrid());
        post.setLckrcod(postDto.getLckrcod());
        post.setLckrnam(postDto.getLckrnam());
        post.setVencod(postDto.getVencod());
        post.setBrandcod(postDto.getBrandcod());
        post.setNumofdrwr(postDto.getNumofdrwr());
        post.setLckrdes(postDto.getLckrdes());
        post.setRemarks(postDto.getRemarks());
        post.setOprstamp(postDto.getOprstamp());
        post.setOprtimstamp(postDto.getOprtimstamp());
        post.setUpdstamp(postDto.getUpdstamp());
        post.setUpdtimstamp(postDto.getUpdtimstamp());
        post.setActflg(postDto.getActflg());
        post.setBokflg(postDto.getBokflg());
        post.setAppflg(postDto.getAppflg());
        post.setAppstamp(postDto.getAppstamp());
        post.setApptimstamp(postDto.getApptimstamp());
        return post;
    }
}
