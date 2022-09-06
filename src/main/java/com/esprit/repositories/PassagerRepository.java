package com.esprit.repositories;

import com.esprit.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional()
public interface PassagerRepository extends JpaRepository<Passager, Integer> {
}
