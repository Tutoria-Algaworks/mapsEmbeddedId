package com.github.paulosalonso.mapsEmbeddedId.service;

import com.github.paulosalonso.mapsEmbeddedId.domain.AdvogadoDossie;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@RequiredArgsConstructor
@Service
public class AdvogadoService {

    private final EntityManager entityManager;

    @Transactional
    public AdvogadoDossie save(AdvogadoDossie advogadoDossie) {
        return entityManager.merge(advogadoDossie);
    }
}
