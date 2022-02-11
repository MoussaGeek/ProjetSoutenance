package com.myPark.myPark.repository;

import com.myPark.myPark.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
