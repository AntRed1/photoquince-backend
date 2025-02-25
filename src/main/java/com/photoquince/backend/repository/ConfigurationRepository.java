package com.photoquince.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.photoquince.backend.entity.Configuration;

/**
 *
 * @author arojas
 */
@Repository
public interface ConfigurationRepository extends JpaRepository<Configuration, Long> {

}
