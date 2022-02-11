package com.myPark.myPark.repository;

import com.myPark.myPark.model.Automobile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutomobileRepository extends JpaRepository<Automobile, Long> {
}
