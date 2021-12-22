package com.example.DrawerRelease.Service;



import com.example.DrawerRelease.DTO.LSDRWRRELDto;

import java.util.List;

public interface LSDRWRRELService {

    List<LSDRWRRELDto> GetAllLSDRWRREL();

    LSDRWRRELDto getByRelId(long relid);

//    LSDRWRRELDto getByAcType(String ACTYPE);

    LSDRWRRELDto createLSDRWRREL (LSDRWRRELDto lsdrwrrelDto);

    LSDRWRRELDto updateLSDRWRREL(LSDRWRRELDto lsdrwrrelDto, long relid);

    void deleteLSDRWRRELById(long relid);

//    PostDto updatePost(PostDto postDto, long id);
//
//    void deletePostById(long id);
}
