package com.github.paulosalonso.mapsEmbeddedId;

import com.github.paulosalonso.mapsEmbeddedId.domain.AdvogadoDossie;
import com.github.paulosalonso.mapsEmbeddedId.domain.AdvogadoDossieId;
import com.github.paulosalonso.mapsEmbeddedId.domain.Dossie;
import com.github.paulosalonso.mapsEmbeddedId.service.AdvogadoService;
import com.github.paulosalonso.mapsEmbeddedId.service.DossieService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.UUID;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class MapsEmbeddedIdApplicationTests {

	@Autowired
	private DossieService dossieService;

	@Autowired
	private AdvogadoService advogadoService;

	@Test
	public void createAndList() {
		System.out.println("\nVerifica se o Dossie existe e faz o insert\n");

		var dossie = dossieService.save(Dossie.builder()
				.codigoDossie(UUID.randomUUID().toString())
				.codigoSituacaoProcessoJuridico(UUID.randomUUID().toString())
				.codigoIndRevisaoProcesso(UUID.randomUUID().toString())
				.codigoIndProcessoRking(UUID.randomUUID().toString())
				.codigoIndProcessoUrgente(UUID.randomUUID().toString())
				.build());

		System.out.println("\nVerifica se o AdvogadoDossie e o Dossie existe e faz o insert\n");

		advogadoService.save(AdvogadoDossie.builder()
				.id(AdvogadoDossieId.builder()
						.codigoPessoaAdvogado(1L)
						.codigoTipoAdvogado(1L)
						.build())
				.dossie(dossie)
				.codigoUsuarioUltimaAtualizacao(1L)
				.build());

		System.out.println("\nBusca todos os dossies\n");

		List<Dossie> dossies = dossieService.getAll();

		System.out.println("\nDossies encontrados\n");
		System.out.println(dossies);
		System.out.println();
	}

}
