package ch.ny.schnupperer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SchnuppererRepository extends JpaRepository<Schnupperer, Long> {

}