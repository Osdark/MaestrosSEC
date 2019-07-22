package co.com.sura.salud.sec.maestros.web;

import co.com.sura.salud.sec.maestros.maestros.*;
import co.com.sura.salud.sec.maestros.maestros.causasLlamadaNoContestada.entity.CausasLlamadaNoContestada;
import co.com.sura.salud.sec.maestros.maestros.centroEstadiaTemporal.entity.CentroEstadiaTemporal;
import co.com.sura.salud.sec.maestros.maestros.citasProfesional.entity.CitasProfesional;
import co.com.sura.salud.sec.maestros.maestros.ciudad.entity.Ciudad;
import co.com.sura.salud.sec.maestros.maestros.diagnostico.entity.Diagnostico;
import co.com.sura.salud.sec.maestros.maestros.dosis.entity.Dosis;
import co.com.sura.salud.sec.maestros.maestros.estadoPaciente.entity.EstadoPaciente;
import co.com.sura.salud.sec.maestros.maestros.eventoSoporteNutricional.entity.EventoSoporteNutricional;
import co.com.sura.salud.sec.maestros.maestros.frecuencia.entity.Frecuencia;
import co.com.sura.salud.sec.maestros.maestros.institucion.entity.Institucion;
import co.com.sura.salud.sec.maestros.maestros.listaSondaje.entity.ListaSondaje;
import co.com.sura.salud.sec.maestros.maestros.medicamento.entity.Medicamento;
import co.com.sura.salud.sec.maestros.maestros.motivoAplicacionCuidador.entity.MotivoAplicacionCuidador;
import co.com.sura.salud.sec.maestros.maestros.motivoCancelacion.entity.MotivoCancelacion;
import co.com.sura.salud.sec.maestros.maestros.motivoEgreso.entity.MotivoEgreso;
import co.com.sura.salud.sec.maestros.maestros.motivoFijarCita.entity.MotivoFijarCita;
import co.com.sura.salud.sec.maestros.maestros.municipio.entity.Municipio;
import co.com.sura.salud.sec.maestros.maestros.novedadesPorTipoAdmision.entity.NovedadesPorTipoAdmision;
import co.com.sura.salud.sec.maestros.maestros.permisosTerceros.entity.PermisosTerceros;
import co.com.sura.salud.sec.maestros.maestros.peso.entity.Peso;
import co.com.sura.salud.sec.maestros.maestros.piso.entity.Piso;
import co.com.sura.salud.sec.maestros.maestros.planSalud.entity.PlanSalud;
import co.com.sura.salud.sec.maestros.maestros.profesional.entity.Profesional;
import co.com.sura.salud.sec.maestros.maestros.programa.entity.Programa;
import co.com.sura.salud.sec.maestros.maestros.proveedor.entity.Proveedor;
import co.com.sura.salud.sec.maestros.maestros.sedesSaludEnCasa.entity.SedesSaludEnCasa;
import co.com.sura.salud.sec.maestros.maestros.tipoCuracion.entity.TipoCuracion;
import co.com.sura.salud.sec.maestros.maestros.tipoEquipoBiomedico.entity.TipoEquipoBiomedico;
import co.com.sura.salud.sec.maestros.maestros.tipoMuestra.entity.TipoMuestra;
import co.com.sura.salud.sec.maestros.maestros.tipoNutricion.entity.TipoNutricion;
import co.com.sura.salud.sec.maestros.maestros.tipoSondaje.entity.TipoSondaje;
import co.com.sura.salud.sec.maestros.maestros.tipoSoporteNutricional.entity.TipoSoporteNutricional;
import co.com.sura.salud.sec.maestros.maestros.tipoTerapia.entity.TipoTerapia;
import co.com.sura.salud.sec.maestros.maestros.tiposIdentificacion.entity.TiposIdentificacion;
import co.com.sura.salud.sec.maestros.maestros.valoraciones.entity.Valoraciones;
import co.com.sura.salud.sec.maestros.maestros.viaAdministracion.entity.ViaAdministracion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api_maestros")
@CrossOrigin(value = "*", allowCredentials = "true")
public class MaestrosController {

    @Autowired
    private CausasLlamadaNoContestadaUseCase causasLlamadaNoContestadaUseCase;
    @Autowired
    private CentroEstadiaTemporalUseCase centroEstadiaTemporalUseCase;
    @Autowired
    private CitasProfesionalUseCase citasProfesionalUseCase;
    @Autowired
    private CiudadUseCase ciudadUseCase;
    @Autowired
    private DiagnosticoUseCase diagnosticoUseCase;
    @Autowired
    private DosisUseCase dosisUseCase;
    @Autowired
    private EstadoPacienteUseCase estadoPacienteUseCase;
    @Autowired
    private EventoSoporteNutricionalUseCase eventoSoporteNutricionalUseCase;
    @Autowired
    private FrecuenciaUseCase frecuenciaUseCase;
    @Autowired
    private InstitucionUseCase institucionUseCase;
    @Autowired
    private ListaSondajeUseCase listaSondajeUseCase;
    @Autowired
    private MedicamentoUseCase medicamentoUseCase;
    @Autowired
    private MotivoAplicacionCuidadorUseCase motivoAplicacionCuidadorUseCase;
    @Autowired
    private MotivoCancelacionUseCase motivoCancelacionUseCase;
    @Autowired
    private MotivoEgresoUseCase motivoEgresoUseCase;
    @Autowired
    private MotivoFijarCitaUseCase motivoFijarCitaUseCase;
    @Autowired
    private MunicipioUseCase municipioUseCase;
    @Autowired
    private NovedadesPorTipoAdmisionUseCase novedadesPorTipoAdmisionUseCase;
    @Autowired
    private PermisosTercerosUseCase permisosTercerosUseCase;
    @Autowired
    private PesoUseCase pesoUseCase;
    @Autowired
    private PisoUseCase pisoUseCase;
    @Autowired
    private PlanSaludUseCase planSaludUseCase;
    @Autowired
    private ProfesionalUseCase profesionalUseCase;
    @Autowired
    private ProgramaUseCase programaUseCase;
    @Autowired
    private ProveedorUseCase proveedorUseCase;
    @Autowired
    private SedesSaludEnCasaUseCase sedesSaludEnCasaUseCase;
    @Autowired
    private TipoCuracionUseCase tipoCuracionUseCase;
    @Autowired
    private TipoEquipoBiomedicoUseCase tipoEquipoBiomedicoUseCase;
    @Autowired
    private TipoMuestraUseCase tipoMuestraUseCase;
    @Autowired
    private TipoNutricionUseCase tipoNutricionUseCase;
    @Autowired
    private TiposIdentificacionUseCase tiposIdentificacionUseCase;
    @Autowired
    private TipoSondajeUseCase tipoSondajeUseCase;
    @Autowired
    private TipoSoporteNutricionalUseCase tipoSoporteNutricionalUseCase;
    @Autowired
    private TipoTerapiaUseCase tipoTerapiaUseCase;
    @Autowired
    private ValoracionesUseCase valoracionesUseCase;
    @Autowired
    private ViaAdministracionUseCase viaAdministracionUseCase;

    @PostMapping("/causasLlamadaNoContestada/nuevo")
    public Mono<CausasLlamadaNoContestada> crearCausasLlamadaNoContestada(
            @RequestBody CausasLlamadaNoContestada causasLlamadaNoContestada
    ) {
        return causasLlamadaNoContestadaUseCase.crearCausasLlamadaNoContestada(causasLlamadaNoContestada);
    }

    @GetMapping("/causasLlamadaNoContestada")
    public Flux<CausasLlamadaNoContestada> consultarCausasLlamadaNoContestada() {
        return causasLlamadaNoContestadaUseCase.consultarCausasLlamadaNoContestada();
    }

    @DeleteMapping("/causasLlamadaNoContestada/{id}")
    public Mono<Void> eliminarCausaLlamadaNoContestada(@PathVariable String id) {
        return causasLlamadaNoContestadaUseCase.eliminarCausasLlamadaNoContestada(id);
    }

    @PostMapping("/centroEstadiaTemporal/nuevo")
    public Mono<CentroEstadiaTemporal> crearCausasLlamadaNoContestada(
            @RequestBody CentroEstadiaTemporal centroEstadiaTemporal
    ) {
        return centroEstadiaTemporalUseCase.crearCentroEstadiaTemporal(centroEstadiaTemporal);
    }

    @GetMapping("/centroEstadiaTemporal")
    public Flux<CentroEstadiaTemporal> consultarCentroEstadiaTemporal() {
        return centroEstadiaTemporalUseCase.consultarCentroEstadiaTemporal();
    }

    @DeleteMapping("/centroEstadiaTemporal/{id}")
    public Mono<Void> eliminarCentroEstadiaTemporal(@PathVariable String id) {
        return centroEstadiaTemporalUseCase.eliminarCentroEstadiaTemporal(id);
    }

    @PostMapping("/citasProfesional/nuevo")
    public Mono<CitasProfesional> crearCitasProfesional(@RequestBody CitasProfesional citasProfesional) {
        return citasProfesionalUseCase.crearCitasProfesional(citasProfesional);
    }

    @GetMapping("/citasProfesional")
    public Flux<CitasProfesional> consultarCitasProfesional() {
        return citasProfesionalUseCase.consultarCitasProfesional();
    }

    @DeleteMapping("/citasProfesional/{id}")
    public Mono<Void> eliminarCitasProfesional(@PathVariable String id) {
        return citasProfesionalUseCase.eliminarCitasProfesional(id);
    }

    @PostMapping("/ciudad/nuevo")
    public Mono<Ciudad> crearCiudad(@RequestBody Ciudad ciudad) {
        return ciudadUseCase.crearCiudad(ciudad);
    }

    @GetMapping("/ciudad")
    public Flux<Ciudad> consultarCiudad() {
        return ciudadUseCase.consultarCiudad();
    }

    @DeleteMapping("/ciudad/{id}")
    public Mono<Void> eliminarCiudad(@PathVariable String id) {
        return ciudadUseCase.eliminarCiudad(id);
    }

    @PostMapping("/diagnostico/nuevo")
    public Mono<Diagnostico> crearDiagnostico(@RequestBody Diagnostico diagnostico) {
        return diagnosticoUseCase.crearDiagnostico(diagnostico);
    }

    @GetMapping("/diagnostico")
    public Flux<Diagnostico> consultarDiagnostico() {
        return diagnosticoUseCase.consultarDiagnostico();
    }

    @DeleteMapping("/diagnostico/{id}")
    public Mono<Void> eliminarDiagnostico(@PathVariable String id) {
        return diagnosticoUseCase.eliminarDiagnostico(id);
    }

    @PostMapping("/dosis/nuevo")
    public Mono<Dosis> crearDosis(@RequestBody Dosis dosis) {
        return dosisUseCase.crearDosis(dosis);
    }

    @GetMapping("/dosis")
    public Flux<Dosis> consultarDosis() {
        return dosisUseCase.consultarDosis();
    }

    @DeleteMapping("/dosis/{id}")
    public Mono<Void> eliminarDosis(@PathVariable String id) {
        return dosisUseCase.eliminarDosis(id);
    }

    @PostMapping("/esatdoPaciente/nuevo")
    public Mono<EstadoPaciente> crearEstadoPaciente(@RequestBody EstadoPaciente estadoPaciente) {
        return estadoPacienteUseCase.crearEstadoPaciente(estadoPaciente);
    }

    @GetMapping("/estadoPaciente")
    public Flux<EstadoPaciente> consultarEstadoPaciente() {
        return estadoPacienteUseCase.consultarEstadoPaciente();
    }

    @DeleteMapping("/estadoPaciente/{id}")
    public Mono<Void> eliminarEstadoPaciente(@PathVariable String id) {
        return estadoPacienteUseCase.eliminarEstadoPaciente(id);
    }

    @PostMapping("/eveeventoSoporteNutricional/nuevo")
    public Mono<EventoSoporteNutricional> crearEventoSoporteNutricional(
            @RequestBody EventoSoporteNutricional eventoSoporteNutricional
    ) {
        return eventoSoporteNutricionalUseCase.crearEventoSoporteNutricional(eventoSoporteNutricional);
    }

    @GetMapping("/eventoSoporteNutricional")
    public Flux<EventoSoporteNutricional> consultarEventoSoporteNutricional() {
        return eventoSoporteNutricionalUseCase.consultarEventoSoporteNutricional();
    }

    @DeleteMapping("eventoSoporteNutricional/{id}")
    public Mono<Void> eliminarEventoSoporteNutricional(@PathVariable String id) {
        return eventoSoporteNutricionalUseCase.eliminarEventoSoporteNutricional(id);
    }

    @PostMapping("/frecuencia/nuevo")
    public Mono<Frecuencia> crearFrecuencia(@RequestBody Frecuencia frecuencia) {
        return frecuenciaUseCase.crearFrecuencia(frecuencia);
    }

    @GetMapping("/frecuencia")
    public Flux<Frecuencia> consultarFrecuencia() {
        return frecuenciaUseCase.consultarFrecuencia();
    }

    @DeleteMapping("/frecuencia/{id}")
    public Mono<Void> eliminarFrecuencia(@PathVariable String id) {
        return frecuenciaUseCase.eliminarFrecuencia(id);
    }

    @PostMapping("/institucion/nuevo")
    public Mono<Institucion> crearInstitucion(@RequestBody Institucion institucion) {
        return institucionUseCase.crearInstitucion(institucion);
    }

    @GetMapping("/institucion")
    public Flux<Institucion> consultarInstitucion() {
        return institucionUseCase.consultarInstitucion();
    }

    @DeleteMapping("/institucion/{id}")
    public Mono<Void> eliminarInstitucion(@PathVariable String id) {
        return institucionUseCase.eliminarInstitucion(id);
    }

    @PostMapping("/listaSondaje/nuevo")
    public Mono<ListaSondaje> crearListaSondaje(@RequestBody ListaSondaje listaSondaje) {
        return listaSondajeUseCase.crearListaSondaje(listaSondaje);
    }

    @GetMapping("/listaSondaje")
    public Flux<ListaSondaje> consultarListaSondaje() {
        return listaSondajeUseCase.consultarListaSondaje();
    }

    @DeleteMapping("/listaSondaje/{id}")
    public Mono<Void> eliminarListaSondaje(@PathVariable String id) {
        return listaSondajeUseCase.eliminarListaSondaje(id);
    }

    @PostMapping("/medicamento/nuevo")
    public Mono<Medicamento> crearMedicamento(@RequestBody Medicamento medicamento) {
        return medicamentoUseCase.crearMedicamento(medicamento);
    }

    @GetMapping("/medicamento")
    public Flux<Medicamento> consultarMedicamento() {
        return medicamentoUseCase.consultarMedicamento();
    }

    @DeleteMapping("/medicamento/{id}")
    public Mono<Void> eliminarMedicamento(@PathVariable String id) {
        return medicamentoUseCase.eliminarMedicamento(id);
    }

    @PostMapping("/motivoAplicacionCuidador/nuevo")
    public Mono<MotivoAplicacionCuidador> crearMotivoAplicacionCuidador(
            @RequestBody MotivoAplicacionCuidador motivoAplicacionCuidador
    ) {
        return motivoAplicacionCuidadorUseCase.crearMotivoAplicacionCuidador(motivoAplicacionCuidador);
    }

    @GetMapping("/motivoAplicacionCuidador")
    public Flux<MotivoAplicacionCuidador> consultarMotivoAplicacionCuidador() {
        return motivoAplicacionCuidadorUseCase.consultarMotivoAplicacionCuidador();
    }

    @DeleteMapping("/motivoAplicacionCuidador/{id}")
    public Mono<Void> eliminarMotivoAplicacionCuidador(@PathVariable String id) {
        return motivoAplicacionCuidadorUseCase.eliminarMotivoAplicacionCuidador(id);
    }

    @PostMapping("/motivoCancelacion/nuevo")
    public Mono<MotivoCancelacion> crearMotivoCancelacion(@RequestBody MotivoCancelacion motivoCancelacion) {
        return motivoCancelacionUseCase.crearMotivoCancelacion(motivoCancelacion);
    }

    @GetMapping("/motivoCancelacion")
    public Flux<MotivoCancelacion> consultarMotivoCancelacion() {
        return motivoCancelacionUseCase.consultarMotivoCancelacion();
    }

    @DeleteMapping("/motivoCancelacion/{id}")
    public Mono<Void> eliminarMotivoCancelacion(@PathVariable String id) {
        return motivoCancelacionUseCase.eliminarMotivoCancelacion(id);
    }

    @PostMapping("/motivoEgreso/nuevo")
    public Mono<MotivoEgreso> crearMotivoEgreso(@RequestBody MotivoEgreso motivoEgreso) {
        return motivoEgresoUseCase.crearMotivoEgreso(motivoEgreso);
    }

    @GetMapping("/motivoEgreso")
    public Flux<MotivoEgreso> consultarMotivoEgreso() {
        return motivoEgresoUseCase.consultarMotivoEgreso();
    }

    @DeleteMapping("/motivoEgreso/{id}")
    public Mono<Void> eliminarMotivoEgreso(@PathVariable String id) {
        return motivoEgresoUseCase.eliminarMotivoEgreso(id);
    }

    @PostMapping("/motivoFijarCita/nuevo")
    public Mono<MotivoFijarCita> crearMotivoFijarCita(@RequestBody MotivoFijarCita motivoFijarCita) {
        return motivoFijarCitaUseCase.crearMotivoFijarCita(motivoFijarCita);
    }

    @GetMapping("/motivoFijarCita")
    public Flux<MotivoFijarCita> consultarMotivoFijarCita() {
        return motivoFijarCitaUseCase.consultarMotivoFijarCita();
    }

    @DeleteMapping("/motivoFijarCita/{id}")
    public Mono<Void> eliminarMotivoFijarCita(@PathVariable String id) {
        return motivoFijarCitaUseCase.eliminarMotivoFijarCita(id);
    }

    @PostMapping("/municipio/nuevo")
    public Mono<Municipio> crearMunicipio(@RequestBody Municipio municipio) {
        return municipioUseCase.crearMunicipio(municipio);
    }

    @GetMapping("/municipio")
    public Flux<Municipio> consultarMunicipio() {
        return municipioUseCase.consultarMunicipio();
    }

    @DeleteMapping("/municipio/{id}")
    public Mono<Void> eliminarMunicipio(@PathVariable String id) {
        return municipioUseCase.eliminarMunicipio(id);
    }

    @PostMapping("/novedadesPorTipoAdmision/nuevo")
    public Mono<NovedadesPorTipoAdmision> crearNovedadesPorTipoAdmision(
            @RequestBody NovedadesPorTipoAdmision novedadesPorTipoAdmision
    ) {
        return novedadesPorTipoAdmisionUseCase.crearNovedadesPorTipoAdmision(novedadesPorTipoAdmision);
    }

    @GetMapping("/novedadesPorTipoAdmision")
    public Flux<NovedadesPorTipoAdmision> consultarNovedadesPorTipoAdmision() {
        return novedadesPorTipoAdmisionUseCase.consultarNovedadesPorTipoAdmision();
    }

    @DeleteMapping("/novedadesPorTipoAdmision/{id}")
    public Mono<Void> eliminarNovedadesPorTipoAdmision(@PathVariable String id) {
        return novedadesPorTipoAdmisionUseCase.eliminarNovedadesPorTipoAdmision(id);
    }

    @PostMapping("/permisosTerceros/nuevo")
    public Mono<PermisosTerceros> crearPermisosTerceros(@RequestBody PermisosTerceros permisosTerceros) {
        return permisosTercerosUseCase.crearPermisosTerceros(permisosTerceros);
    }

    @GetMapping("/permisosTerceros")
    public Flux<PermisosTerceros> consultarPermisosTerceros() {
        return permisosTercerosUseCase.consultarPermisosTerceros();
    }

    @DeleteMapping("/permisosTerceros/{id}")
    public Mono<Void> eliminarPermisosTerceros(@PathVariable String id) {
        return permisosTercerosUseCase.eliminarPermisosTerceros(id);
    }

    @PostMapping("/peso/nuevo")
    public Mono<Peso> crearPeso(@RequestBody Peso peso) {
        return pesoUseCase.crearPeso(peso);
    }

    @GetMapping("/peso")
    public Flux<Peso> consultarPeso() {
        return pesoUseCase.consultarPeso();
    }

    @DeleteMapping("/peso/{id}")
    public Mono<Void> eliminarPeso(@PathVariable String id) {
        return pesoUseCase.eliminarPeso(id);
    }

    @PostMapping("/piso/nuevo")
    public Mono<Piso> crearPeso(@RequestBody Piso piso) {
        return pisoUseCase.crearPiso(piso);
    }

    @GetMapping("/piso")
    public Flux<Piso> consultarPiso() {
        return pisoUseCase.consultarPiso();
    }

    @DeleteMapping("/piso/{id}")
    public Mono<Void> eliminarPiso(@PathVariable String id) {
        return pisoUseCase.eliminarPiso(id);
    }

    @PostMapping("/planSalud/nuevo")
    public Mono<PlanSalud> crearPlanSalud(@RequestBody PlanSalud planSalud) {
        return planSaludUseCase.crearPlanSalud(planSalud);
    }

    @GetMapping("/planSalud")
    public Flux<PlanSalud> consultarPlanSalud() {
        return planSaludUseCase.consultarPlanSalud();
    }

    @DeleteMapping("/planSalud/{id}")
    public Mono<Void> eliminarPlanSalud(@PathVariable String id) {
        return planSaludUseCase.eliminarPlanSalud(id);
    }

    @PostMapping("/profesional/nuevo")
    public Mono<Profesional> crearProfesional(@RequestBody Profesional profesional) {
        return profesionalUseCase.crearProfesional(profesional);
    }

    @GetMapping
    public Flux<Profesional> consultarProfesional() {
        return profesionalUseCase.consultarProfesional();
    }

    @DeleteMapping("/profesional/{id}")
    public Mono<Void> eliminarProfesional(@PathVariable String id) {
        return profesionalUseCase.eliminarProfesional(id);
    }

    @PostMapping("/programa/nuevo")
    public Mono<Programa> crearPrograma(@RequestBody Programa programa) {
        return programaUseCase.crearPrograma(programa);
    }

    @GetMapping("/programa")
    public Flux<Programa> consultarPrograma() {
        return programaUseCase.consultarPrograma();
    }

    @DeleteMapping("/programa/{id}")
    public Mono<Void> eliminarPrograma(@PathVariable String id) {
        return programaUseCase.eliminarPrograma(id);
    }

    @PostMapping("/proveedor/nuevo")
    public Mono<Proveedor> crearProveedor(@RequestBody Proveedor proveedor) {
        return proveedorUseCase.crearProveedor(proveedor);
    }

    @GetMapping("/proveedor")
    public Flux<Proveedor> consultarProveedor() {
        return proveedorUseCase.consultarProveedor();
    }

    @DeleteMapping("/proveedor/{id}")
    public Mono<Void> eliminarProveedor(@PathVariable String id) {
        return proveedorUseCase.eliminarProveedor(id);
    }

    @PostMapping("/sedesSaludEnCasa/nuevo")
    public Mono<SedesSaludEnCasa> crearSedesSaludEnCasa(@RequestBody SedesSaludEnCasa sedesSaludEnCasa) {
        return sedesSaludEnCasaUseCase.crearSedesSaludEnCasa(sedesSaludEnCasa);
    }

    @GetMapping("/sedesSaludEnCasa")
    public Flux<SedesSaludEnCasa> consultarSedesSaludEnCasa() {
        return sedesSaludEnCasaUseCase.consultarSedesSaludEnCasa();
    }

    @DeleteMapping("/sedesSaludEnCasa/{id}")
    public Mono<Void> eliminarSedesSaludEnCasa(@PathVariable String id) {
        return sedesSaludEnCasaUseCase.eliminarSedesSaludEnCasa(id);
    }

    @PostMapping("/tipoCuracion/nuevo")
    public Mono<TipoCuracion> crearTipoCuracion(@RequestBody TipoCuracion tipoCuracion) {
        return tipoCuracionUseCase.crearTipoCuracion(tipoCuracion);
    }

    @GetMapping("/tipoCuracion")
    public Flux<TipoCuracion> consultarTipoCuracion() {
        return tipoCuracionUseCase.consultarTipoCuracion();
    }

    @DeleteMapping("/tipoCuracion/{id}")
    public Mono<Void> eliminarTipoCuracion(@PathVariable String id) {
        return tipoCuracionUseCase.eliminarTipoCuracion(id);
    }

    @PostMapping("/tipoEquipoBiomedico/nuevo")
    public Mono<TipoEquipoBiomedico> crearTipoEquipoBiomedico(@RequestBody TipoEquipoBiomedico tipoEquipoBiomedico) {
        return tipoEquipoBiomedicoUseCase.crearTipoEquipoBiomedico(tipoEquipoBiomedico);
    }

    @GetMapping("/tipoEquipoBiomedico")
    public Flux<TipoEquipoBiomedico> consultarTipoEquipoBiomedico() {
        return tipoEquipoBiomedicoUseCase.consultarTipoEquipoBiomedico();
    }

    @DeleteMapping("/tipoEquipoBiomedico/{id}")
    public Mono<Void> eliminarTipoEquipoBiomedico(@PathVariable String id) {
        return tipoEquipoBiomedicoUseCase.eliminarTipoEquipoBiomedico(id);
    }

    @PostMapping("/tipoMuestra/nuevo")
    public Mono<TipoMuestra> crearTipoMuestra(@RequestBody TipoMuestra tipoMuestra) {
        return tipoMuestraUseCase.crearTipoMuestra(tipoMuestra);
    }

    @GetMapping("/tipoMuestra")
    public Flux<TipoMuestra> consultarTipoMuestra() {
        return tipoMuestraUseCase.consultarTipoMuestra();
    }

    @DeleteMapping("/tipoMuestra/{id}")
    public Mono<Void> eliminarTipoMuestra(@PathVariable String id) {
        return tipoMuestraUseCase.eliminarTipoMuestra(id);
    }

    @PostMapping("/tipoNutricion/nuevo")
    public Mono<TipoNutricion> crearTipoNutricion(@RequestBody TipoNutricion tipoNutricion) {
        return tipoNutricionUseCase.crearTipoNutricion(tipoNutricion);
    }

    @GetMapping("/tipoNutricion")
    public Flux<TipoNutricion> consultarTipoNutricion() {
        return tipoNutricionUseCase.consultarTipoNutricion();
    }

    @PostMapping("/tipoNutricion/{id}")
    public Mono<Void> eliminartipoNutricion(@PathVariable String id) {
        return tipoNutricionUseCase.eliminarTipoNutricion(id);
    }

    @PostMapping("/tiposIdentificacion/nuevo")
    public Mono<TiposIdentificacion> crearTiposIdentificacion(@RequestBody TiposIdentificacion tiposIdentificacion) {
        return tiposIdentificacionUseCase.crearTiposIdentificacion(tiposIdentificacion);
    }

    @GetMapping("/tiposIdentificacion")
    public Flux<TiposIdentificacion> consultarTiposIdentificacion() {
        return tiposIdentificacionUseCase.consultarTiposIdentificacion();
    }

    @DeleteMapping("/tiposIdentificacion/{id}")
    public Mono<Void> eliminarTiposIdentificacion(@PathVariable String id) {
        return tiposIdentificacionUseCase.eliminarTiposIdentificacion(id);
    }

    @PostMapping("/tipoSondaje/nuevo")
    public Mono<TipoSondaje> crearTipoSondaje(@RequestBody TipoSondaje tipoSondaje) {
        return tipoSondajeUseCase.crearTipoSondaje(tipoSondaje);
    }

    @GetMapping("/tipoSondaje")
    public Flux<TipoSondaje> consultarTipoSondaje() {
        return tipoSondajeUseCase.consultarTipoSondaje();
    }

    @DeleteMapping("tipoSondaje/{id}")
    public Mono<Void> eliminarTipoSondaje(@PathVariable String id) {
        return tipoSondajeUseCase.eliminarTipoSondaje(id);
    }

    @PostMapping("/tipoSoporteNutricional/nuevo")
    public Mono<TipoSoporteNutricional> crearTipoSoporteNutricional(
            @RequestBody TipoSoporteNutricional tipoSoporteNutricional
    ) {
        return tipoSoporteNutricionalUseCase.crearTipoSoporteNutricional(tipoSoporteNutricional);
    }

    @GetMapping("/tipoSoporteNutricional")
    public Flux<TipoSoporteNutricional> consutlarTipoSoporteNutricional() {
        return tipoSoporteNutricionalUseCase.consultarTipoSoporteNutricional();
    }

    @DeleteMapping("/tipoSoporteNutricional/{id}")
    public Mono<Void> eliminarTipoSoporteNutricional(@PathVariable String id) {
        return tipoSoporteNutricionalUseCase.eliminarTipoSoporteNutricional(id);
    }

    @PostMapping("/tipoTerapia/nuevo")
    public Mono<TipoTerapia> crearTipoTerapia(@RequestBody TipoTerapia tipoTerapia) {
        return tipoTerapiaUseCase.crearTipoTerapia(tipoTerapia);
    }

    @GetMapping("/tipoTerapia")
    public Flux<TipoTerapia> consultarTipoTerapia() {
        return tipoTerapiaUseCase.consultarTipoTerapia();
    }

    @DeleteMapping("/tipoTerapia/{id}")
    public Mono<Void> eliminarTipoTerapia(@PathVariable String id) {
        return tipoTerapiaUseCase.eliminarTipoTerapia(id);
    }

    @PostMapping("/valoracinoes/nuevo")
    public Mono<Valoraciones> crearValoracinoes(@RequestBody Valoraciones valoraciones) {
        return valoracionesUseCase.crearValoraciones(valoraciones);
    }

    @GetMapping("/valoracinoes")
    public Flux<Valoraciones> consultarValoracinoes() {
        return valoracionesUseCase.consultarValoraciones();
    }

    @DeleteMapping("/valoracinoes/{id}")
    public Mono<Void> eliminarValoracinoes(@PathVariable String id) {
        return valoracionesUseCase.eliminarValoraciones(id);
    }

    @PostMapping("/viaAdministracion/nuevo")
    public Mono<ViaAdministracion> crearViaAdministracion(@RequestBody ViaAdministracion viaAdministracion) {
        return viaAdministracionUseCase.crearViaAdministracion(viaAdministracion);
    }

    @GetMapping("/viaAdministracion")
    public Flux<ViaAdministracion> consultarViaAdministracion() {
        return viaAdministracionUseCase.consultarViaAdministracion();
    }

    @DeleteMapping("/viaAdministracion/{id}")
    public Mono<Void> eliminarViaAdministracion(@PathVariable String id) {
        return viaAdministracionUseCase.eliminarViaAdministracion(id);
    }
}
