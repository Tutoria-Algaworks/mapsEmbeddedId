package com.github.paulosalonso.mapsEmbeddedId.service;

import com.github.paulosalonso.mapsEmbeddedId.domain.Dossie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@RequiredArgsConstructor
@Service
public class DossieService {

    private final EntityManager entityManager;

    public List<Dossie> getAll() {
        entityManager.clear(); // Evict the first level cache
        return entityManager.createQuery("from Dossie", Dossie.class).getResultList();
    }

    @Transactional
    public Dossie save(Dossie dossie) {
        return entityManager.merge(dossie);
    }
}
