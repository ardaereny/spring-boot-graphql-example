package com.ardaeren.graphqlspringboot.Repository;


import com.ardaeren.graphqlspringboot.Entity.BusinessInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BusinessInfoRepository extends JpaRepository<BusinessInfo,Long> {
    List<BusinessInfo> findByName(String businessName);
}
