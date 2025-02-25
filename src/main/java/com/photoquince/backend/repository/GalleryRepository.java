package com.photoquince.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.photoquince.backend.entity.Gallery;

/**
 *
 * @author arojas
 */
@Repository
public interface GalleryRepository extends JpaRepository<Gallery, Long> {

}
