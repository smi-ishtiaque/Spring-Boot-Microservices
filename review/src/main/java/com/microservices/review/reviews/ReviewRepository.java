package com.microservices.review.reviews;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    // SELECT * FROM review WHERE company_id=?;
    //reviewRepository.findCompantbyId(1L) will return below
    //SELECT * FROM review WHERE company_id=1;

    List<Review> findByCompanyId(Long companyId);


}
