package com.photoquince.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.photoquince.backend.entity.ContactInfo;

/**
 *
 * @author arojas
 */
@Repository
public interface ContactInfoRepository extends JpaRepository<ContactInfo, Long> {

}
