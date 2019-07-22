package co.com.sura.salud.sec.maestros.maestros.adapter;

import co.com.sura.salud.sec.maestros.maestros.causasLlamadaNoContestada.entity.CausasLlamadaNoContestada;
import co.com.sura.salud.sec.maestros.maestros.causasLlamadaNoContestada.gateway.CausasLlamadaNoContestadaRepository;
import co.com.sura.salud.sec.maestros.maestros.centroEstadiaTemporal.entity.CentroEstadiaTemporal;
import co.com.sura.salud.sec.maestros.maestros.centroEstadiaTemporal.gateway.CentroEstadiaTemporalRepository;
import co.com.sura.salud.sec.maestros.maestros.citasProfesional.entity.CitasProfesional;
import co.com.sura.salud.sec.maestros.maestros.citasProfesional.gateway.CitasProfesionalRepository;
import co.com.sura.salud.sec.maestros.maestros.ciudad.entity.Ciudad;
import co.com.sura.salud.sec.maestros.maestros.ciudad.gateway.CiudadRepository;
import co.com.sura.salud.sec.maestros.maestros.data.*;
import co.com.sura.salud.sec.maestros.maestros.diagnostico.entity.Diagnostico;
import co.com.sura.salud.sec.maestros.maestros.diagnostico.gateway.DiagnosticoRepository;
import co.com.sura.salud.sec.maestros.maestros.dosis.entity.Dosis;
import co.com.sura.salud.sec.maestros.maestros.dosis.gateway.DosisRepository;
import co.com.sura.salud.sec.maestros.maestros.estadoPaciente.entity.EstadoPaciente;
import co.com.sura.salud.sec.maestros.maestros.estadoPaciente.gateway.EstadoPacienteRepository;
import co.com.sura.salud.sec.maestros.maestros.eventoSoporteNutricional.entity.EventoSoporteNutricional;
import co.com.sura.salud.sec.maestros.maestros.eventoSoporteNutricional.gateway.EventoSoporteNutricionalRepository;
import co.com.sura.salud.sec.maestros.maestros.frecuencia.entity.Frecuencia;
import co.com.sura.salud.sec.maestros.maestros.frecuencia.gateway.FrecuenciaRepository;
import co.com.sura.salud.sec.maestros.maestros.institucion.entity.Institucion;
import co.com.sura.salud.sec.maestros.maestros.institucion.gateway.InstitucionRepository;
import co.com.sura.salud.sec.maestros.maestros.listaSondaje.entity.ListaSondaje;
import co.com.sura.salud.sec.maestros.maestros.listaSondaje.gateway.ListaSondajeRepository;
import co.com.sura.salud.sec.maestros.maestros.medicamento.entity.Medicamento;
import co.com.sura.salud.sec.maestros.maestros.medicamento.gateway.MedicamentoRepository;
import co.com.sura.salud.sec.maestros.maestros.motivoAplicacionCuidador.entity.MotivoAplicacionCuidador;
import co.com.sura.salud.sec.maestros.maestros.motivoAplicacionCuidador.gateway.MotivoAplicacionCuidadorRepository;
import co.com.sura.salud.sec.maestros.maestros.motivoCancelacion.entity.MotivoCancelacion;
import co.com.sura.salud.sec.maestros.maestros.motivoCancelacion.gateway.MotivoCancelacionRepository;
import co.com.sura.salud.sec.maestros.maestros.motivoEgreso.entity.MotivoEgreso;
import co.com.sura.salud.sec.maestros.maestros.motivoEgreso.gateway.MotivoEgresoRepository;
import co.com.sura.salud.sec.maestros.maestros.motivoFijarCita.entity.MotivoFijarCita;
import co.com.sura.salud.sec.maestros.maestros.motivoFijarCita.gateway.MotivoFijarCitaRepository;
import co.com.sura.salud.sec.maestros.maestros.municipio.entity.Municipio;
import co.com.sura.salud.sec.maestros.maestros.municipio.gateway.MunicipioRepository;
import co.com.sura.salud.sec.maestros.maestros.novedadesPorTipoAdmision.entity.NovedadesPorTipoAdmision;
import co.com.sura.salud.sec.maestros.maestros.novedadesPorTipoAdmision.gateway.NovedadesPorTipoAdmisionRepository;
import co.com.sura.salud.sec.maestros.maestros.permisosTerceros.entity.PermisosTerceros;
import co.com.sura.salud.sec.maestros.maestros.permisosTerceros.gateway.PermisosTercerosRepository;
import co.com.sura.salud.sec.maestros.maestros.peso.entity.Peso;
import co.com.sura.salud.sec.maestros.maestros.peso.gateway.PesoRepository;
import co.com.sura.salud.sec.maestros.maestros.piso.entity.Piso;
import co.com.sura.salud.sec.maestros.maestros.piso.gateway.PisoRepository;
import co.com.sura.salud.sec.maestros.maestros.planSalud.entity.PlanSalud;
import co.com.sura.salud.sec.maestros.maestros.planSalud.gateway.PlanSaludRepository;
import co.com.sura.salud.sec.maestros.maestros.profesional.entity.Profesional;
import co.com.sura.salud.sec.maestros.maestros.profesional.gateway.ProfesionalRepository;
import co.com.sura.salud.sec.maestros.maestros.programa.entity.Programa;
import co.com.sura.salud.sec.maestros.maestros.programa.gateway.ProgramaRepository;
import co.com.sura.salud.sec.maestros.maestros.proveedor.entity.Proveedor;
import co.com.sura.salud.sec.maestros.maestros.proveedor.gateway.ProveedorRepository;
import co.com.sura.salud.sec.maestros.maestros.sedesSaludEnCasa.entity.SedesSaludEnCasa;
import co.com.sura.salud.sec.maestros.maestros.sedesSaludEnCasa.gateway.SedesSaludEnCasaRepository;
import co.com.sura.salud.sec.maestros.maestros.tipoCuracion.entity.TipoCuracion;
import co.com.sura.salud.sec.maestros.maestros.tipoCuracion.gateway.TipoCuracionRepository;
import co.com.sura.salud.sec.maestros.maestros.tipoEquipoBiomedico.entity.TipoEquipoBiomedico;
import co.com.sura.salud.sec.maestros.maestros.tipoEquipoBiomedico.gateway.TipoEquipoBiomedicoRepository;
import co.com.sura.salud.sec.maestros.maestros.tipoMuestra.entity.TipoMuestra;
import co.com.sura.salud.sec.maestros.maestros.tipoMuestra.gateway.TipoMuestraRepository;
import co.com.sura.salud.sec.maestros.maestros.tipoNutricion.entity.TipoNutricion;
import co.com.sura.salud.sec.maestros.maestros.tipoNutricion.gateway.TipoNutricionRepository;
import co.com.sura.salud.sec.maestros.maestros.tipoSondaje.entity.TipoSondaje;
import co.com.sura.salud.sec.maestros.maestros.tipoSondaje.gateway.TipoSondajeRepository;
import co.com.sura.salud.sec.maestros.maestros.tipoSoporteNutricional.entity.TipoSoporteNutricional;
import co.com.sura.salud.sec.maestros.maestros.tipoSoporteNutricional.gateway.TipoSoporteNutricionalRepository;
import co.com.sura.salud.sec.maestros.maestros.tipoTerapia.entity.TipoTerapia;
import co.com.sura.salud.sec.maestros.maestros.tipoTerapia.gateway.TipoTerapiaRepository;
import co.com.sura.salud.sec.maestros.maestros.tiposIdentificacion.entity.TiposIdentificacion;
import co.com.sura.salud.sec.maestros.maestros.tiposIdentificacion.gateway.TiposIdentificacionRepository;
import co.com.sura.salud.sec.maestros.maestros.valoraciones.entity.Valoraciones;
import co.com.sura.salud.sec.maestros.maestros.valoraciones.gateway.ValoracionesRepository;
import co.com.sura.salud.sec.maestros.maestros.viaAdministracion.entity.ViaAdministracion;
import co.com.sura.salud.sec.maestros.maestros.viaAdministracion.gateway.ViaAdministracionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public class MaestrosRepositoryAdapter implements CausasLlamadaNoContestadaRepository, CentroEstadiaTemporalRepository,
        CitasProfesionalRepository, CiudadRepository, DiagnosticoRepository, DosisRepository, EstadoPacienteRepository,
        EventoSoporteNutricionalRepository, FrecuenciaRepository, InstitucionRepository, ListaSondajeRepository,
        MedicamentoRepository, MotivoAplicacionCuidadorRepository, MotivoCancelacionRepository, MotivoEgresoRepository,
        MotivoFijarCitaRepository, MunicipioRepository, NovedadesPorTipoAdmisionRepository, PermisosTercerosRepository,
        PesoRepository, PisoRepository, PlanSaludRepository, ProfesionalRepository, ProgramaRepository,
        ProveedorRepository, SedesSaludEnCasaRepository, TipoCuracionRepository, TipoEquipoBiomedicoRepository,
        TipoMuestraRepository, TipoNutricionRepository, TiposIdentificacionRepository, TipoSondajeRepository,
        TipoSoporteNutricionalRepository, TipoTerapiaRepository, ValoracionesRepository, ViaAdministracionRepository {

    @Autowired
    private ConverterMaestros converter;

    @Autowired
    private CausasLlamadaNoContestadaDataRepository causasLlamadaNoContestadaDataRepository;
    @Autowired
    private CentroEstadiaTemporalDataRepository centroEstadiaTemporalDataRepository;
    @Autowired
    private CitasProfesionalDataRepository citasProfesionalDataRepository;
    @Autowired
    private CiudadDataRepository ciudadDataRepository;
    @Autowired
    private DiagnosticoDataRepository diagnosticoDataRepository;
    @Autowired
    private DosisDataRepository dosisDataRepository;
    @Autowired
    private EstadoPacienteDataRepository estadoPacienteDataRepository;
    @Autowired
    private EventoSoporteNutricionalDataRepository eventoSoporteNutricionalDataRepository;
    @Autowired
    private FrecuenciaDataRepository frecuenciaDataRepository;
    @Autowired
    private InstitucionDataRepository institucionDataRepository;
    @Autowired
    private ListaSondajeDataRepository listaSondajeDataRepository;
    @Autowired
    private MedicamentoDataRepository medicamentoDataRepository;
    @Autowired
    private MotivoAplicacionCuidadorDataRepository motivoAplicacionCuidadorDataRepository;
    @Autowired
    private MotivoCancelacionDataRepository motivoCancelacionDataRepository;
    @Autowired
    private MotivoEgresoDataRepository motivoEgresoDataRepository;
    @Autowired
    private MotivoFijarCitaDataRepository motivoFijarCitaDataRepository;
    @Autowired
    private MunicipioDataRepository municipioDataRepository;
    @Autowired
    private NovedadesPorTipoAdmisionDataRepository novedadesPorTipoAdmisionDataRepository;
    @Autowired
    private PermisosTercerosDataRepository permisosTercerosDataRepository;
    @Autowired
    private PesoDataRepository pesoDataRepository;
    @Autowired
    private PisoDataRepository pisoDataRepository;
    @Autowired
    private PlanSaludDataRepository planSaludDataRepository;
    @Autowired
    private ProfesionalDataRepository profesionalDataRepository;
    @Autowired
    private ProgramaDataRepository programaDataRepository;
    @Autowired
    private ProveedorDataRepository proveedorDataRepository;
    @Autowired
    private SedesSaludEnCasaDataRepository sedesSaludEnCasaDataRepository;
    @Autowired
    private TipoCuracionDataRepository tipoCuracionDataRepository;
    @Autowired
    private TipoEquipoBiomedicoDataRepository tipoEquipoBiomedicoDataRepository;
    @Autowired
    private TipoMuestraDataRepository tipoMuestraDataRepository;
    @Autowired
    private TipoNutricionDataRepository tipoNutricionDataRepository;
    @Autowired
    private TipoSondajeDataRepository tipoSondajeDataRepository;
    @Autowired
    private TipoSoporteNutricionalDataRepository tipoSoporteNutricionalDataRepository;
    @Autowired
    private TipoTerapiaDataRepository tipoTerapiaDataRepository;
    @Autowired
    private TiposIdentificacionDataRepository tiposIdentificacionDataRepository;
    @Autowired
    private ValoracionesDataRepository valoracionesDataRepository;
    @Autowired
    private ViaAdministracionDataRepository viaAdministracionDataRepository;

    @Override
    public Mono<CausasLlamadaNoContestada> crearCausasLlamadaNoContestada(CausasLlamadaNoContestada causasLlamadaNoContestada) {
        return Mono.just(causasLlamadaNoContestada)
                .map(converter::toData)
                .flatMap(causasLlamadaNoContestadaDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<CausasLlamadaNoContestada> consultarCausasLlamadaNoContestada() {
        return causasLlamadaNoContestadaDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarCausasLlamadaNoContestada(String id) {
        return causasLlamadaNoContestadaDataRepository.deleteById(id);
    }

    @Override
    public Mono<CentroEstadiaTemporal> crearCentroEstadiaTemporal(CentroEstadiaTemporal centroEstadiaTemporal) {
        return Mono.just(centroEstadiaTemporal)
                .map(converter::toData)
                .flatMap(centroEstadiaTemporalDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<CentroEstadiaTemporal> consultarCentroEstadiaTemporal() {
        return centroEstadiaTemporalDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarCentroEstadiaTemporal(String id) {
        return centroEstadiaTemporalDataRepository.deleteById(id);
    }

    @Override
    public Mono<CitasProfesional> crearCitasProfesional(CitasProfesional citasProfesional) {
        return Mono.just(citasProfesional)
                .map(converter::toData)
                .flatMap(citasProfesionalDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<CitasProfesional> consultarCitasProfesional() {
        return citasProfesionalDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarCitasProfesional(String idCita) {
        return citasProfesionalDataRepository.deleteById(idCita);
    }

    @Override
    public Mono<Ciudad> crearCiudad(Ciudad ciudad) {
        return Mono.just(ciudad)
                .map(converter::toData)
                .flatMap(ciudadDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<Ciudad> consultarCiudad() {
        return ciudadDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarCiudad(String id) {
        return ciudadDataRepository.deleteById(id);
    }

    @Override
    public Mono<Diagnostico> crearDiagnostico(Diagnostico diagnostico) {
        return Mono.just(diagnostico)
                .map(converter::toData)
                .flatMap(diagnosticoDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<Diagnostico> consultarDiagnostico() {
        return diagnosticoDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarDiagnostico(String id) {
        return diagnosticoDataRepository.deleteById(id);
    }

    @Override
    public Mono<Dosis> crearDosis(Dosis dosis) {
        return Mono.just(dosis)
                .map(converter::toData)
                .flatMap(dosisDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<Dosis> consultarDosis() {
        return dosisDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarDosis(String id) {
        return dosisDataRepository.deleteById(id);
    }

    @Override
    public Mono<EstadoPaciente> crearEstadoPaciente(EstadoPaciente estadoPaciente) {
        return Mono.just(estadoPaciente)
                .map(converter::toData)
                .flatMap(estadoPacienteDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<EstadoPaciente> consultarEstadoPaciente() {
        return estadoPacienteDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarEstadoPaciente(String id) {
        return estadoPacienteDataRepository.deleteById(id);
    }

    @Override
    public Mono<EventoSoporteNutricional> creEventoSoporteNutricional(EventoSoporteNutricional eventoSoporteNutricional) {
        return Mono.just(eventoSoporteNutricional)
                .map(converter::toData)
                .flatMap(eventoSoporteNutricionalDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<EventoSoporteNutricional> consultarEventoSoporteNutricional() {
        return eventoSoporteNutricionalDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarEventoSoporteNutricional(String id) {
        return eventoSoporteNutricionalDataRepository.deleteById(id);
    }

    @Override
    public Mono<Frecuencia> crearFrecuencia(Frecuencia frecuencia) {
        return Mono.just(frecuencia)
                .map(converter::toData)
                .flatMap(frecuenciaDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<Frecuencia> consultaFrecuencia() {
        return frecuenciaDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarFrecuencia(String id) {
        return frecuenciaDataRepository.deleteById(id);
    }

    @Override
    public Mono<Institucion> crearInstitucion(Institucion institucion) {
        return Mono.just(institucion)
                .map(converter::toData)
                .flatMap(institucionDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<Institucion> consultarInstitucion() {
        return institucionDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarInstitucion(String id) {
        return institucionDataRepository.deleteById(id);
    }

    @Override
    public Mono<ListaSondaje> crearListaSondaje(ListaSondaje listaSondaje) {
        return Mono.just(listaSondaje)
                .map(converter::toData)
                .flatMap(listaSondajeDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<ListaSondaje> consultarListaSondaje() {
        return listaSondajeDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarListaSondaje(String idTipoSondaje) {
        return listaSondajeDataRepository.deleteById(idTipoSondaje);
    }

    @Override
    public Mono<Medicamento> crearMedicamento(Medicamento medicamento) {
        return Mono.just(medicamento)
                .map(converter::toData)
                .flatMap(medicamentoDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<Medicamento> consultarMedicamento() {
        return medicamentoDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarMedicamento(String id) {
        return medicamentoDataRepository.deleteById(id);
    }

    @Override
    public Mono<MotivoAplicacionCuidador> crearMotivoAplicacionCuidador(MotivoAplicacionCuidador motivoAplicacionCuidador) {
        return Mono.just(motivoAplicacionCuidador)
                .map(converter::toData)
                .flatMap(motivoAplicacionCuidadorDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<MotivoAplicacionCuidador> consultarMotivoAplicacionCuidador() {
        return motivoAplicacionCuidadorDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarMotivoAplicacionCuidador(String id) {
        return motivoAplicacionCuidadorDataRepository.deleteById(id);
    }

    @Override
    public Mono<MotivoCancelacion> crearMotivoCancelacion(MotivoCancelacion motivoCancelacion) {
        return Mono.just(motivoCancelacion)
                .map(converter::toData)
                .flatMap(motivoCancelacionDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<MotivoCancelacion> consultarMotivoCancelacion() {
        return motivoCancelacionDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarMOtiMotivoCancelacion(String id) {
        return motivoCancelacionDataRepository.deleteById(id);
    }

    @Override
    public Mono<MotivoEgreso> crearMotivoEgreso(MotivoEgreso motivoEgreso) {
        return Mono.just(motivoEgreso)
                .map(converter::toData)
                .flatMap(motivoEgresoDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<MotivoEgreso> consultarMotivoEgreso() {
        return motivoEgresoDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarMotivoEgreso(String id) {
        return motivoEgresoDataRepository.deleteById(id);
    }

    @Override
    public Mono<MotivoFijarCita> crearmoMotivoFijarCita(MotivoFijarCita motivoFijarCita) {
        return Mono.just(motivoFijarCita)
                .map(converter::toData)
                .flatMap(motivoFijarCitaDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<MotivoFijarCita> consultarMotivoFijarCita() {
        return motivoFijarCitaDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarMotivoFijarCita(String id) {
        return motivoFijarCitaDataRepository.deleteById(id);
    }

    @Override
    public Mono<Municipio> crearMunicipio(Municipio municipio) {
        return Mono.just(municipio)
                .map(converter::toData)
                .flatMap(municipioDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<Municipio> consultarMunicipio() {
        return municipioDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarMunicipio(String id) {
        return municipioDataRepository.deleteById(id);
    }

    @Override
    public Mono<NovedadesPorTipoAdmision> crearNovedadesPorTipoAdmision(NovedadesPorTipoAdmision novedadesPorTipoAdmision) {
        return Mono.just(novedadesPorTipoAdmision)
                .map(converter::toData)
                .flatMap(novedadesPorTipoAdmisionDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<NovedadesPorTipoAdmision> consultarNovedadesPorTipoAdmision() {
        return novedadesPorTipoAdmisionDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarNovedadesPorTipoAdmision(String id) {
        return novedadesPorTipoAdmisionDataRepository.deleteById(id);
    }

    @Override
    public Mono<PermisosTerceros> crearPermisosTerceros(PermisosTerceros permisosTerceros) {
        return Mono.just(permisosTerceros)
                .map(converter::toData)
                .flatMap(permisosTercerosDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<PermisosTerceros> consultarPermisosTerceros() {
        return permisosTercerosDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarPermisosTerceros(String id) {
        return permisosTercerosDataRepository.deleteById(id);
    }

    @Override
    public Mono<Peso> crearPeso(Peso peso) {
        return Mono.just(peso)
                .map(converter::toData)
                .flatMap(pesoDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<Peso> consultarPeso() {
        return pesoDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarPeso(String id) {
        return pesoDataRepository.deleteById(id);
    }

    @Override
    public Mono<Piso> crearPiso(Piso piso) {
        return Mono.just(piso)
                .map(converter::toData)
                .flatMap(pisoDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<Piso> consultarPiso() {
        return pisoDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarPiso(String idPiso) {
        return pisoDataRepository.deleteById(idPiso);
    }

    @Override
    public Mono<PlanSalud> crearPlanSalud(PlanSalud planSalud) {
        return Mono.just(planSalud)
                .map(converter::toData)
                .flatMap(planSaludDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<PlanSalud> consultarPlanSalud() {
        return planSaludDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarPlanSalud(String id) {
        return planSaludDataRepository.deleteById(id);
    }

    @Override
    public Mono<Profesional> crearProfesional(Profesional profesional) {
        return Mono.just(profesional)
                .map(converter::toData)
                .flatMap(profesionalDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<Profesional> consultarProfesional() {
        return profesionalDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarProfesional(String id) {
        return profesionalDataRepository.deleteById(id);
    }

    @Override
    public Mono<Programa> crearPrograma(Programa programa) {
        return Mono.just(programa)
                .map(converter::toData)
                .flatMap(programaDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<Programa> consultarPrograma() {
        return programaDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarPrograma(String id) {
        return programaDataRepository.deleteById(id);
    }

    @Override
    public Mono<Proveedor> crearProveedor(Proveedor proveedor) {
        return Mono.just(proveedor)
                .map(converter::toData)
                .flatMap(proveedorDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<Proveedor> consultarProveedor() {
        return proveedorDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarProveedor(String id) {
        return proveedorDataRepository.deleteById(id);
    }

    @Override
    public Mono<SedesSaludEnCasa> crearSedesSaludEnCasa(SedesSaludEnCasa sedesSaludEnCasa) {
        return Mono.just(sedesSaludEnCasa)
                .map(converter::toData)
                .flatMap(sedesSaludEnCasaDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<SedesSaludEnCasa> consultarSedesSaludEnCasa() {
        return sedesSaludEnCasaDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarSedesSaludEnCasa(String id) {
        return sedesSaludEnCasaDataRepository.deleteById(id);
    }

    @Override
    public Mono<TipoCuracion> crearTipoCuracion(TipoCuracion tipoCuracion) {
        return Mono.just(tipoCuracion)
                .map(converter::toData)
                .flatMap(tipoCuracionDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<TipoCuracion> consultarTipoCuracion() {
        return tipoCuracionDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarTipoCuracion(String id) {
        return tipoCuracionDataRepository.deleteById(id);
    }

    @Override
    public Mono<TipoEquipoBiomedico> crearTipoEquipoBiomedico(TipoEquipoBiomedico tipoEquipoBiomedico) {
        return Mono.just(tipoEquipoBiomedico)
                .map(converter::toData)
                .flatMap(tipoEquipoBiomedicoDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<TipoEquipoBiomedico> consultarTipoEquipoBiomedico() {
        return tipoEquipoBiomedicoDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarTipoEquipoBiomedico(String id) {
        return tipoEquipoBiomedicoDataRepository.deleteById(id);
    }

    @Override
    public Mono<TipoMuestra> crearTipoMuestra(TipoMuestra tipoMuestra) {
        return Mono.just(tipoMuestra)
                .map(converter::toData)
                .flatMap(tipoMuestraDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<TipoMuestra> consultarTipoMuestra() {
        return tipoMuestraDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarTipoMuestra(String id) {
        return tipoMuestraDataRepository.deleteById(id);
    }

    @Override
    public Mono<TipoNutricion> crearTipoNutricion(TipoNutricion tipoNutricion) {
        return Mono.just(tipoNutricion)
                .map(converter::toData)
                .flatMap(tipoNutricionDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<TipoNutricion> consultarTipoNutricion() {
        return tipoNutricionDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarTipoNutricion(String id) {
        return tipoNutricionDataRepository.deleteById(id);
    }

    @Override
    public Mono<TipoSondaje> crearTipoSondaje(TipoSondaje tipoSondaje) {
        return Mono.just(tipoSondaje)
                .map(converter::toData)
                .flatMap(tipoSondajeDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<TipoSondaje> consultarTipoSondaje() {
        return tipoSondajeDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarTipoSondaje(String id) {
        return tipoSondajeDataRepository.deleteById(id);
    }

    @Override
    public Mono<TipoSoporteNutricional> crearTipoSoporteNutricional(TipoSoporteNutricional tipoSoporteNutricional) {
        return Mono.just(tipoSoporteNutricional)
                .map(converter::toData)
                .flatMap(tipoSoporteNutricionalDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<TipoSoporteNutricional> consultarTipoSoporteNutricional() {
        return tipoSoporteNutricionalDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarTipoSoporteNutricional(String idTipo) {
        return tipoSoporteNutricionalDataRepository.deleteById(idTipo);
    }

    @Override
    public Mono<TipoTerapia> crearTipoTerapia(TipoTerapia tipoTerapia) {
        return Mono.just(tipoTerapia)
                .map(converter::toData)
                .flatMap(tipoTerapiaDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<TipoTerapia> consultarTipoTerapia() {
        return tipoTerapiaDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarTipoTerapia(String id) {
        return tipoTerapiaDataRepository.deleteById(id);
    }

    @Override
    public Mono<TiposIdentificacion> crearTiposIdentificacion(TiposIdentificacion tiposIdentificacion) {
        return Mono.just(tiposIdentificacion)
                .map(converter::toData)
                .flatMap(tiposIdentificacionDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<TiposIdentificacion> consultarTiposIdentificacion() {
        return tiposIdentificacionDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarTiposIdentificacion(String id) {
        return tiposIdentificacionDataRepository.deleteById(id);
    }

    @Override
    public Mono<Valoraciones> crearValoraciones(Valoraciones valoraciones) {
        return Mono.just(valoraciones)
                .map(converter::toData)
                .flatMap(valoracionesDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<Valoraciones> consultarValoraciones() {
        return valoracionesDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarValoraciones(String id) {
        return valoracionesDataRepository.deleteById(id);
    }

    @Override
    public Mono<ViaAdministracion> crearViaAdministracion(ViaAdministracion viaAdministracion) {
        return Mono.just(viaAdministracion)
                .map(converter::toData)
                .flatMap(viaAdministracionDataRepository::save)
                .map(converter::toEntity);
    }

    @Override
    public Flux<ViaAdministracion> consultarViaAdministracion() {
        return viaAdministracionDataRepository.findAll()
                .map(converter::toEntity);
    }

    @Override
    public Mono<Void> eliminarViaAdministracion(String id) {
        return viaAdministracionDataRepository.deleteById(id);
    }
}
