package com.ardaeren.graphqlspringboot;

import com.ardaeren.graphqlspringboot.Entity.BusinessInfo;
import com.ardaeren.graphqlspringboot.Repository.BusinessInfoRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class GraphQlSpringBootApplication {

    @Autowired
    BusinessInfoRepository businessInfoRepository;

    @PostConstruct
	public void initDB(){
		List<BusinessInfo> businessInfos = Stream.of(
				new BusinessInfo("asd","asd","asd","asd"),
				new BusinessInfo("Smartphone", "Electronics", "39999.99f", "100"),
				new BusinessInfo("Office Chair", "Furniture", "7999.99f", "200"),
				new BusinessInfo("Notebook", "Stationery", "99.99f", "500"),
				new BusinessInfo("Desk Lamp", "Furniture", "1999.99f", "150"),
				new BusinessInfo("Water Bottle", "Accessories", "499.99f", "300"),
                new BusinessInfo("Water Bottle", "3", "499.99f", "300"),
                new BusinessInfo("Water Bottle", "2", "499.99f", "300"),
                new BusinessInfo("Water Bottle", "4", "499.99f", "300")

		).collect(Collectors.toList());
		businessInfoRepository.saveAll(businessInfos);
	}

    public static void main(String[] args) {
        SpringApplication.run(GraphQlSpringBootApplication.class, args);
    }

}
