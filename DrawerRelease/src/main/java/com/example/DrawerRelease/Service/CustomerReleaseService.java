package com.example.DrawerRelease.Service;

import com.example.DrawerRelease.DTO.CustomerReleaseDto;
import com.example.DrawerRelease.DTO.LSDRWRRELDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerReleaseService {

    List<CustomerReleaseDto> GetAllRelease();

    CustomerReleaseDto getBySomeColumn(long lckrid);

    CustomerReleaseDto createCustomerRelease(CustomerReleaseDto customerReleaseDto);

    CustomerReleaseDto updateCustomerRelease(CustomerReleaseDto customerReleaseDto, long lckrid);

    void deleteCustomerReleaseById(long lckrid);


//    LSDRWRRELDto updateLSDRWRREL(LSDRWRRELDto lsdrwrrelDto, long relid);
//    Object createCustomerRelease(CustomerReleaseDto customerReleaseDto);
//
//    LSDRWRRELDto createLSDRWRREL (LSDRWRRELDto lsdrwrrelDto);
}
