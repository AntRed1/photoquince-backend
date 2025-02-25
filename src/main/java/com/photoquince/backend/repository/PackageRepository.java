package com.photoquince.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.photoquince.backend.entity.Package;

/**
 *
 * @author arojas
 */
@Repository
public interface PackageRepository extends JpaRepository<Package, Long> {

}
