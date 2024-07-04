package com.ardaeren.graphqlspringboot.Controller;

import com.ardaeren.graphqlspringboot.Entity.BusinessInfo;
import com.ardaeren.graphqlspringboot.Service.BusinessInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BusinessInfoController {

    @Autowired
    private BusinessInfoService businessInfoService;

    @QueryMapping
    List<BusinessInfo> getBusinessInfo() {
        return businessInfoService.getAll();
    }

    @QueryMapping
    List<BusinessInfo> getBusinessInfoByName(@Argument String name) {
        return businessInfoService.getByName(name);
    }

    @MutationMapping
    BusinessInfo createBusinessInfo(@Argument BusinessInfo businessInfo) {
        return businessInfoService.createBusinessInfo(businessInfo);
    }

    @MutationMapping
    BusinessInfo updateBusinessInfoName(@Argument Long id,@Argument String newName) {
        return businessInfoService.updateBusinessInfoName(id,newName);
    }
}
