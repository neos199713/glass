package com.esprit.repositories;

import com.esprit.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional()
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
    List<Reservation> findAllByClient_IdClt(int idClt);
}
