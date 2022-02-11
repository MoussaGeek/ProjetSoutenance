package com.myPark.myPark.repository;

import com.myPark.myPark.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
