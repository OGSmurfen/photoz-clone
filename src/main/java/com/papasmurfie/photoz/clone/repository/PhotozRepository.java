package com.papasmurfie.photoz.clone.repository;

import com.papasmurfie.photoz.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {
}
