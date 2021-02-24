package com.github.paulosalonso.mapsEmbeddedId.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table(name = "PROCS_JURID")
public class Dossie {

	@ToString.Include
	@Id
	@Column(name = "CPROCS_JURID")
	@NotBlank
	private String codigoDossie;

	@Column(name = "CEMPR_DEJUR")
	private Long codigoEmpresaDepartamentoJuridico;

	@Column(name = "CSGMTO_NEGOC_ORIGE")
	private Long codigoSgmtoNegocOrige;

	@Column(name = "CRAMO_SEGUR_PRINC")
	private Integer codigoRamoSeguradoPrincipal;

	@Column(name = "CDEPTO_JURID")
	private String codigoDepartamentoJuridico;

	@Column(name = "DABERT_PROCS_JURID")
	private String dataAberturaProcessoJuridico;

	@Column(name = "CTPO_PROCS_JURID")
	private Long codigoTipoProcessoJuridico;

	@Column(name = "CTPO_ACAO_JURID")
	private Long codigoTipoAcaoJuridico;

	@Column(name = "CSIT_PROCS_JURID")
	@NotBlank
	private String codigoSituacaoProcessoJuridico;

	@Column(name = "CPROCS_JURID_ORIGN")
	private String codigoProcessoJuridicoOriginal;

	@Column(name = "CSUCUR_SEGDR_ORIGE")
	private Integer codigoSucursalSeguradoraOrigem;

	@Column(name = "IVARA_JUDIC")
	private String nomeVaraJudicial;

	@Column(name = "NPROCS_JUDIC")
	private String numeroProcessoJudicial;

	@Column(name = "DPETIC_INIC")
	private String dataPeticaoInicial;

	@Column(name = "DCTADO_PROCS_JURID")
	private String dataCtadoProcessoJuridico;

	@Column(name = "CMOEDA_CAUSA_PROCS")
	private Long codigoMoedaCausaProcesso;

	@Column(name = "VCAUSA_PROCS_JURID")
	private Double valorCausaProcessoJuridico;

	@Column(name = "NSNIST_SEGUR")
	private String numeroSinistroSegurado;

	@Column(name = "DSNIST_SEGUR")
	private String dataSinistroSegurado;

	@Column(name = "CTPO_ENCRR_PROCS")
	private Long codigoTipoEncerramentoProcesso;

	@Column(name = "DENCRR_PROCS_JURID")
	private OffsetDateTime dataEncerramentoProcessoJuridico;

	@Column(name = "DPRESC_PROCS_JURID")
	private String dataPrescProcessoJuridico;

	@Column(name = "DCANCT_PROCS_JURID")
	private OffsetDateTime dataCancelamentoProcessoJuridico;

	@Column(name = "CUSUAR_RESP_REABR")
	private Long codigoUsuarioResponsavelReabertura;

	@Column(name = "DREABR_PROCS_JURID")
	private OffsetDateTime dataReaberturaProcessoJuridico;

	@Column(name = "DREMSS_PROCS_ADVOG")
	private OffsetDateTime dataRemssProcessoAdvogado;

	@Column(name = "ROBS_TRAMT_PROCS")
	private String robsTramtProcs;

	@Column(name = "CCLASF_ESTVA")
	private Long codigoClassificacaoEstimativa;

	@Column(name = "CMOTVO_CAUSA_PROCS")
	private Integer codigoMotivoCausaProcesso;

	@Column(name = "CCLASF_CNGRE_SEGUR")
	private String codigoClassificacaoCngreSegurado;

	@Column(name = "PCSSRO")
	private Double pcssro;

	@Column(name = "PRSSRO")
	private Double prssro;

	@Column(name = "VRESER_CTBIL_PROCS")
	private Double valorReservaContabilProcesso;

	@Column(name = "CSIT_RAMO_SNIST")
	private Double codigoSituacaoRamoSinistro;

	@Column(name = "CUSUAR_ULT_ATULZ")
	private Long codigoUsuarioUltimaAtualizacao;

	@Column(name = "DHORA_ULT_ATULZ", nullable = false, updatable = false, insertable = false,
			columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Timestamp dataHoraUltimaAtualizacao;

	@Column(name = "CGRP_SEGRD_ESPCL")
	private Long codigoGrupoSeguradoEspcl;

	@Column(name = "CGERC_RGNAL_DEJUR")
	private Long codigoGercRgnalDejur;

	@Column(name = "CTPO_MODLD_LICTA")
	private Long codigoTipoModldLicta;

	@Column(name = "CIND_RVSAO_PROCS")
	@NotBlank
	private String codigoIndRevisaoProcesso;

	@Column(name = "DDISTR_PROCS_JURID")
	private String dataDistrProcessoJuridico;

	@Column(name = "VECON_FINCR")
	private Double valorEconFinanceiro;

	@Column(name = "NMFILM_PROCS_JURID")
	private String nomeFilmProcessoJuridico;

	@Column(name = "NDIR_JURID")
	private String nomeDirJuridico;

	@Column(name = "CPROCS_JURID_ANEXO")
	private String codigoProcessoJuridicoAnexo;

	@Column(name = "NPROCS_ADMTV")
	private String numeroProcessoAdministrativo;

	@Column(name = "CCOMAR_JUDIC")
	private Long codigoComarca;

	@Column(name = "CIND_PROCS_RKING")
	@NotBlank
	private String codigoIndProcessoRking;

	@Column(name = "CPROCS_ORIGE")
	private String codigoProcessoOrigem;

	@Column(name = "CUSUAR_RESP_ENCRR")
	private Long codigoUsuarioResponsavelEncerramento;

	@Column(name = "CCLASF_FORO_TRAMT")
	private Integer codigoClassificacaoForoTramt;

	@Column(name = "CIND_PROCS_URGEN")
	@NotBlank
	private String codigoIndProcessoUrgente;

	@Column(name = "VRECUP_PROCS")
	private Double valorRecuperacaoProcesso;

	@Column(name = "CMOEDA_RECUP_PROCS")
	private Long codigoMoedaRecuperacaoProcesso;

	@Column(name = "VECON_PROCS")
	private Double valorEconProcesso;

	@Column(name = "VRSARC")
	private Double vrsarc;

	@Column(name = "OVLR_RSARC_LIQ")
	private Long ovlrRsarcLiq;

	@Column(name = "NCTRL_VRSAO")
	private Long nctrlVrsao;

	@Column(name = "CCLASF_PRIM_NVEL")
	private Double codigoClassificacaoPrimeiroNivel;

	@Column(name = "CCLASF_SEGDA_NVEL")
	private Double codigoClassificacaoSegundoNivel;

	@Column(name = "CCLASF_TERC_NVEL")
	private Double codigoClassificacaoTerceirooNivel;

	@Column(name = "CCAUSA_PERDA_OPER")
	private Double codigoCausaPerdaOperacao;

	@Column(name = "CFNCAO_NEGOC_PERDA_OPER")
	private Double codigoFuncaoNegociacaoPerdaOperacao;

	@Column(name = "CEMPR_DEJUR_ORIGN_PROCS")
	private Long codigoEmpresaDJuridicoOriginalProcesso;

	@ToString.Include
	@OneToMany(mappedBy = "dossie", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<AdvogadoDossie> advogadosDossie;
}