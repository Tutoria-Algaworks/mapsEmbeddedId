package com.github.paulosalonso.mapsEmbeddedId.repository;

import com.github.paulosalonso.mapsEmbeddedId.domain.Dossie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DossieRepository extends JpaRepository<Dossie, String> {}
