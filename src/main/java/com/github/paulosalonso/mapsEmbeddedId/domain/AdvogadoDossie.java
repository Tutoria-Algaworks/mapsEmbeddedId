package com.github.paulosalonso.mapsEmbeddedId.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table(name = "ADVOG_PROCS_JURID")
public class AdvogadoDossie {

	@ToString.Include
	@EmbeddedId
	private AdvogadoDossieId id;

	@JsonIgnore
	@MapsId("codigoDossie")
	@ManyToOne
	@JoinColumn(name = "CPROCS_JURID", referencedColumnName = "CPROCS_JURID", insertable = false, updatable = false)
	private Dossie dossie;

	@Column(name = "CUSUAR_ULT_ATULZ")
	@NotNull
	private Long codigoUsuarioUltimaAtualizacao;

	@UpdateTimestamp
	@Column(name = "DHORA_ULT_ATULZ", nullable = false, updatable = true, insertable = true,
			columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp dataHoraUltimaAtualizacao;

	@Column(name = "DINIC_ACOMP_ADVOG")
	private String dataInicioAcompAdvogado;
}