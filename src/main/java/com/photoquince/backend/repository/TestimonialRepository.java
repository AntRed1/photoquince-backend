package com.photoquince.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.photoquince.backend.entity.Testimonial;

/**
 *
 * @author arojas
 */
@Repository
public interface TestimonialRepository extends JpaRepository<Testimonial, Long> {

}
