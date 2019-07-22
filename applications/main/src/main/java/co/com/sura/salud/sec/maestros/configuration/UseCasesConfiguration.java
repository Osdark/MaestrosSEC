package co.com.sura.salud.sec.maestros.configuration;

import co.com.sura.salud.sec.maestros.maestros.*;
import co.com.sura.salud.sec.maestros.maestros.causasLlamadaNoContestada.gateway.CausasLlamadaNoContestadaRepository;
import co.com.sura.salud.sec.maestros.maestros.centroEstadiaTemporal.gateway.CentroEstadiaTemporalRepository;
import co.com.sura.salud.sec.maestros.maestros.citasProfesional.gateway.CitasProfesionalRepository;
import co.com.sura.salud.sec.maestros.maestros.ciudad.gateway.CiudadRepository;
import co.com.sura.salud.sec.maestros.maestros.diagnostico.gateway.DiagnosticoRepository;
import co.com.sura.salud.sec.maestros.maestros.dosis.gateway.DosisRepository;
import co.com.sura.salud.sec.maestros.maestros.estadoPaciente.gateway.EstadoPacienteRepository;
import co.com.sura.salud.sec.maestros.maestros.eventoSoporteNutricional.gateway.EventoSoporteNutricionalRepository;
import co.com.sura.salud.sec.maestros.maestros.frecuencia.gateway.FrecuenciaRepository;
import co.com.sura.salud.sec.maestros.maestros.georeferenciacion.gateway.GeoreferenciacionRepository;
import co.com.sura.salud.sec.maestros.maestros.institucion.gateway.InstitucionRepository;
import co.com.sura.salud.sec.maestros.maestros.listaSondaje.gateway.ListaSondajeRepository;
import co.com.sura.salud.sec.maestros.maestros.medicamento.gateway.MedicamentoRepository;
import co.com.sura.salud.sec.maestros.maestros.motivoAplicacionCuidador.gateway.MotivoAplicacionCuidadorRepository;
import co.com.sura.salud.sec.maestros.maestros.motivoCancelacion.gateway.MotivoCancelacionRepository;
import co.com.sura.salud.sec.maestros.maestros.motivoEgreso.gateway.MotivoEgresoRepository;
import co.com.sura.salud.sec.maestros.maestros.motivoFijarCita.gateway.MotivoFijarCitaRepository;
import co.com.sura.salud.sec.maestros.maestros.municipio.gateway.MunicipioRepository;
import co.com.sura.salud.sec.maestros.maestros.novedadesPorTipoAdmision.gateway.NovedadesPorTipoAdmisionRepository;
import co.com.sura.salud.sec.maestros.maestros.permisosTerceros.gateway.PermisosTercerosRepository;
import co.com.sura.salud.sec.maestros.maestros.peso.gateway.PesoRepository;
import co.com.sura.salud.sec.maestros.maestros.piso.gateway.PisoRepository;
import co.com.sura.salud.sec.maestros.maestros.planSalud.gateway.PlanSaludRepository;
import co.com.sura.salud.sec.maestros.maestros.profesional.gateway.ProfesionalRepository;
import co.com.sura.salud.sec.maestros.maestros.programa.gateway.ProgramaRepository;
import co.com.sura.salud.sec.maestros.maestros.proveedor.gateway.ProveedorRepository;
import co.com.sura.salud.sec.maestros.maestros.sedesSaludEnCasa.gateway.SedesSaludEnCasaRepository;
import co.com.sura.salud.sec.maestros.maestros.tipoCuracion.gateway.TipoCuracionRepository;
import co.com.sura.salud.sec.maestros.maestros.tipoEquipoBiomedico.gateway.TipoEquipoBiomedicoRepository;
import co.com.sura.salud.sec.maestros.maestros.tipoMuestra.gateway.TipoMuestraRepository;
import co.com.sura.salud.sec.maestros.maestros.tipoNutricion.gateway.TipoNutricionRepository;
import co.com.sura.salud.sec.maestros.maestros.tipoSondaje.gateway.TipoSondajeRepository;
import co.com.sura.salud.sec.maestros.maestros.tipoSoporteNutricional.gateway.TipoSoporteNutricionalRepository;
import co.com.sura.salud.sec.maestros.maestros.tipoTerapia.gateway.TipoTerapiaRepository;
import co.com.sura.salud.sec.maestros.maestros.tiposIdentificacion.gateway.TiposIdentificacionRepository;
import co.com.sura.salud.sec.maestros.maestros.valoraciones.gateway.ValoracionesRepository;
import co.com.sura.salud.sec.maestros.maestros.viaAdministracion.gateway.ViaAdministracionRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesConfiguration {

    @Bean
    public CausasLlamadaNoContestadaUseCase causasLlamadaNoContestadaUseCase(
            CausasLlamadaNoContestadaRepository causasLlamadaNoContestadaRepository
    ) {
        return new CausasLlamadaNoContestadaUseCase(causasLlamadaNoContestadaRepository);
    }

    @Bean
    public CentroEstadiaTemporalUseCase centroEstadiaTemporalUseCase(
            CentroEstadiaTemporalRepository centroEstadiaTemporalRepository
    ) {
        return new CentroEstadiaTemporalUseCase(centroEstadiaTemporalRepository);
    }

    @Bean
    public CitasProfesionalUseCase citasProfesionalUseCase(CitasProfesionalRepository citasProfesionalRepository) {
        return new CitasProfesionalUseCase(citasProfesionalRepository);
    }

    @Bean
    public CiudadUseCase ciudadUseCase(CiudadRepository ciudadRepository) {
        return new CiudadUseCase(ciudadRepository);
    }

    @Bean
    public DiagnosticoUseCase diagnosticoUseCase(DiagnosticoRepository diagnosticoRepository) {
        return new DiagnosticoUseCase(diagnosticoRepository);
    }

    @Bean
    public DosisUseCase dosisUseCase(DosisRepository dosisRepository) {
        return new DosisUseCase(dosisRepository);
    }

    @Bean
    public EstadoPacienteUseCase estadoPacienteUseCase(EstadoPacienteRepository estadoPacienteRepository) {
        return new EstadoPacienteUseCase(estadoPacienteRepository);
    }

    @Bean
    public EventoSoporteNutricionalUseCase eventoSoporteNutricionalUseCase(
            EventoSoporteNutricionalRepository eventoSoporteNutricionalRepository
    ) {
        return new EventoSoporteNutricionalUseCase(eventoSoporteNutricionalRepository);
    }

    @Bean
    public FrecuenciaUseCase frecuenciaUseCase(FrecuenciaRepository frecuenciaRepository) {
        return new FrecuenciaUseCase(frecuenciaRepository);
    }

    @Bean
    public GeoreferenciacionUseCase georeferenciacionUseCase(GeoreferenciacionRepository georeferenciacionRepository) {
        return new GeoreferenciacionUseCase(georeferenciacionRepository);
    }

    @Bean
    public InstitucionUseCase institucionUseCase(InstitucionRepository institucionRepository) {
        return new InstitucionUseCase(institucionRepository);
    }

    @Bean
    public ListaSondajeUseCase listaSondajeUseCase(ListaSondajeRepository listaSondajeRepository) {
        return new ListaSondajeUseCase(listaSondajeRepository);
    }

    @Bean
    public MedicamentoUseCase medicamentoUseCase(MedicamentoRepository medicamentoRepository) {
        return new MedicamentoUseCase(medicamentoRepository);
    }

    @Bean
    public MotivoAplicacionCuidadorUseCase motivoAplicacionCuidadorUseCase(
            MotivoAplicacionCuidadorRepository motivoAplicacionCuidadorRepository
    ) {
        return new MotivoAplicacionCuidadorUseCase(motivoAplicacionCuidadorRepository);
    }

    @Bean
    public MotivoCancelacionUseCase motivoCancelacionUseCase(MotivoCancelacionRepository motivoCancelacionRepository) {
        return new MotivoCancelacionUseCase(motivoCancelacionRepository);
    }

    @Bean
    public MotivoEgresoUseCase motivoEgresoUseCase(MotivoEgresoRepository motivoEgresoRepository) {
        return new MotivoEgresoUseCase(motivoEgresoRepository);
    }

    @Bean
    public MotivoFijarCitaUseCase motivoFijarCitaUseCase(MotivoFijarCitaRepository motivoFijarCitaRepository) {
        return new MotivoFijarCitaUseCase(motivoFijarCitaRepository);
    }

    @Bean
    public MunicipioUseCase municipioUseCase(MunicipioRepository municipioRepository) {
        return new MunicipioUseCase(municipioRepository);
    }

    @Bean
    public NovedadesPorTipoAdmisionUseCase novedadesPorTipoAdmisionUseCase(
            NovedadesPorTipoAdmisionRepository novedadesPorTipoAdmisionRepository
    ) {
        return new NovedadesPorTipoAdmisionUseCase(novedadesPorTipoAdmisionRepository);
    }

    @Bean
    public PermisosTercerosUseCase permisosTercerosUseCase(PermisosTercerosRepository permisosTercerosRepository) {
        return new PermisosTercerosUseCase(permisosTercerosRepository);
    }

    @Bean
    public PesoUseCase pesoUseCase(PesoRepository pesoRepository) {
        return new PesoUseCase(pesoRepository);
    }

    @Bean
    public PisoUseCase pisoUseCase(PisoRepository pisoRepository) {
        return new PisoUseCase(pisoRepository);
    }

    @Bean
    public PlanSaludUseCase planSaludUseCase(PlanSaludRepository planSaludRepository) {
        return new PlanSaludUseCase(planSaludRepository);
    }

    @Bean
    public ProfesionalUseCase profesionalUseCase(ProfesionalRepository profesionalRepository) {
        return new ProfesionalUseCase(profesionalRepository);
    }

    @Bean
    public ProgramaUseCase programaUseCase(ProgramaRepository programaRepository) {
        return new ProgramaUseCase(programaRepository);
    }

    @Bean
    public ProveedorUseCase proveedorUseCase(ProveedorRepository proveedorRepository) {
        return new ProveedorUseCase(proveedorRepository);
    }

    @Bean
    public SedesSaludEnCasaUseCase sedesSaludEnCasaUseCase(SedesSaludEnCasaRepository sedesSaludEnCasaRepository) {
        return new SedesSaludEnCasaUseCase(sedesSaludEnCasaRepository);
    }

    @Bean
    public TipoCuracionUseCase tipoCuracionUseCase(TipoCuracionRepository tipoCuracionRepository) {
        return new TipoCuracionUseCase(tipoCuracionRepository);
    }

    @Bean
    public TipoEquipoBiomedicoUseCase tipoEquipoBiomedicoUseCase(TipoEquipoBiomedicoRepository tipoEquipoBiomedicoRepository) {
        return new TipoEquipoBiomedicoUseCase(tipoEquipoBiomedicoRepository);
    }

    @Bean
    public TipoMuestraUseCase tipoMuestraUseCase(TipoMuestraRepository tipoMuestraRepository) {
        return new TipoMuestraUseCase(tipoMuestraRepository);
    }

    @Bean
    public TipoNutricionUseCase tipoNutricionUseCase(TipoNutricionRepository tipoNutricionRepository) {
        return new TipoNutricionUseCase(tipoNutricionRepository);
    }

    @Bean
    public TiposIdentificacionUseCase tiposIdentificacionUseCase(
            TiposIdentificacionRepository tiposIdentificacionRepository
    ) {
        return new TiposIdentificacionUseCase(tiposIdentificacionRepository);
    }

    @Bean
    public TipoSondajeUseCase tipoSondajeUseCase(TipoSondajeRepository tipoSondajeRepository) {
        return new TipoSondajeUseCase(tipoSondajeRepository);
    }

    @Bean
    public TipoSoporteNutricionalUseCase tipoSoporteNutricionalUseCase(
            TipoSoporteNutricionalRepository tipoSoporteNutricionalRepository
    ) {
        return new TipoSoporteNutricionalUseCase(tipoSoporteNutricionalRepository);
    }

    @Bean
    public TipoTerapiaUseCase tipoTerapiaUseCase(TipoTerapiaRepository tipoTerapiaRepository) {
        return new TipoTerapiaUseCase(tipoTerapiaRepository);
    }

    @Bean
    public ValoracionesUseCase valoracionesUseCase(ValoracionesRepository valoracionesRepository) {
        return new ValoracionesUseCase(valoracionesRepository);
    }

    @Bean
    public ViaAdministracionUseCase viaAdministracionUseCase(ViaAdministracionRepository viaAdministracionRepository) {
        return new ViaAdministracionUseCase(viaAdministracionRepository);
    }
}
