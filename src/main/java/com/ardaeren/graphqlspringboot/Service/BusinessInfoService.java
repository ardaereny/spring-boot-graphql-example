package com.ardaeren.graphqlspringboot.Service;

import com.ardaeren.graphqlspringboot.Entity.BusinessInfo;
import com.ardaeren.graphqlspringboot.Repository.BusinessInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BusinessInfoService {

    @Autowired
    private BusinessInfoRepository businessInfoRepository;

    public List<BusinessInfo> getAll() {
        return businessInfoRepository.findAll();
    }

    public List<BusinessInfo> getByName(String name) {
        return businessInfoRepository.findByName(name);
    }


    public BusinessInfo createBusinessInfo(BusinessInfo businessInfo) {
        return businessInfoRepository.save(businessInfo);
    }

    public BusinessInfo updateBusinessInfoName(Long id,String newName) {
        BusinessInfo businessInfo = businessInfoRepository.findById(id).orElse(null);
        if(businessInfo!=null) {
            businessInfo.setName(newName);
            businessInfoRepository.save(businessInfo);
        }
        return businessInfo;
    }
}
