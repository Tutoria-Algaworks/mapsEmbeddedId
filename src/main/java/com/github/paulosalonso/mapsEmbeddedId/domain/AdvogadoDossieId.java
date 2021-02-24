package com.github.paulosalonso.mapsEmbeddedId.domain;

import lombok.*;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Builder
@Embeddable
public class AdvogadoDossieId implements Serializable {

	private static final long serialVersionUID = 3584562328728659547L;

	@ToString.Include
	@Column(name = "CPSSOA_ADVOG")
	private Long codigoPessoaAdvogado;

	@Column(name = "CPROCS_JURID")
	private String codigoDossie;

	@Column(name = "CTPO_CLASF_ADVOG")
	private Long codigoTipoAdvogado;
}