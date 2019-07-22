package co.com.sura.salud.sec.maestros.maestros.adapter;

import co.com.sura.salud.sec.maestros.maestros.causasLlamadaNoContestada.entity.CausasLlamadaNoContestada;
import co.com.sura.salud.sec.maestros.maestros.centroEstadiaTemporal.entity.CentroEstadiaTemporal;
import co.com.sura.salud.sec.maestros.maestros.citasProfesional.entity.CitasProfesional;
import co.com.sura.salud.sec.maestros.maestros.ciudad.entity.Ciudad;
import co.com.sura.salud.sec.maestros.maestros.data.*;
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
import co.com.sura.salud.sec.maestros.maestros.tipoMuestra.gateway.TipoMuestraRepository;
import co.com.sura.salud.sec.maestros.maestros.tipoNutricion.entity.TipoNutricion;
import co.com.sura.salud.sec.maestros.maestros.tipoSondaje.entity.TipoSondaje;
import co.com.sura.salud.sec.maestros.maestros.tipoSoporteNutricional.entity.TipoSoporteNutricional;
import co.com.sura.salud.sec.maestros.maestros.tipoTerapia.entity.TipoTerapia;
import co.com.sura.salud.sec.maestros.maestros.tiposIdentificacion.entity.TiposIdentificacion;
import co.com.sura.salud.sec.maestros.maestros.valoraciones.entity.Valoraciones;
import co.com.sura.salud.sec.maestros.maestros.viaAdministracion.entity.ViaAdministracion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactive.mapper.ObjectMapper;

@Component
public class ConverterMaestros {

    @Autowired
    private ObjectMapper mapper;

    public CausasLlamadaNoContestada toEntity(CausasLlamadaNoContestadaData causasLlamadaNoContestadaData) {
        return mapper.map(causasLlamadaNoContestadaData, CausasLlamadaNoContestada.class);
    }

    public CausasLlamadaNoContestadaData toData(CausasLlamadaNoContestada causasLlamadaNoContestada) {
        return mapper.map(causasLlamadaNoContestada, CausasLlamadaNoContestadaData.class);
    }

    public CentroEstadiaTemporal toEntity(CentroEstadiaTemporalData centroEstadiaTemporalData) {
        return mapper.map(centroEstadiaTemporalData, CentroEstadiaTemporal.class);
    }

    public CentroEstadiaTemporalData toData(CentroEstadiaTemporal centroEstadiaTemporal) {
        return mapper.map(centroEstadiaTemporal, CentroEstadiaTemporalData.class);
    }

    public CitasProfesional toEntity(CitasProfesionalData citasProfesionalData) {
        return mapper.map(citasProfesionalData, CitasProfesional.class);
    }

    public CitasProfesionalData toData(CitasProfesional citasProfesional) {
        return mapper.map(citasProfesional, CitasProfesionalData.class);
    }

    public Ciudad toEntity(CiudadData ciudadData) {
        return mapper.map(ciudadData, Ciudad.class);
    }

    public CiudadData toData(Ciudad ciudad) {
        return mapper.map(ciudad, CiudadData.class);
    }

    public Diagnostico toEntity(DiagnosticoData diagnosticoData) {
        return mapper.map(diagnosticoData, Diagnostico.class);
    }

    public DiagnosticoData toData(Diagnostico diagnostico) {
        return mapper.map(diagnostico, DiagnosticoData.class);
    }

    public Dosis toEntity(DosisData dosisData) {
        return mapper.map(dosisData, Dosis.class);
    }

    public DosisData toData(Dosis dosis) {
        return mapper.map(dosis, DosisData.class);
    }

    public EstadoPaciente toEntity(EstadoPacienteData estadoPacienteData) {
        return mapper.map(estadoPacienteData, EstadoPaciente.class);
    }

    public EstadoPacienteData toData(EstadoPaciente estadoPaciente) {
        return mapper.map(estadoPaciente, EstadoPacienteData.class);
    }

    public EventoSoporteNutricional toEntity(EventoSoporteNutricionalData eventoSoporteNutricionalData) {
        return mapper.map(eventoSoporteNutricionalData, EventoSoporteNutricional.class);
    }

    public EventoSoporteNutricionalData toData(EventoSoporteNutricional eventoSoporteNutricional) {
        return mapper.map(eventoSoporteNutricional, EventoSoporteNutricionalData.class);
    }

    public Frecuencia toEntity(FrecuenciaData frecuenciaData) {
        return mapper.map(frecuenciaData, Frecuencia.class);
    }

    public FrecuenciaData toData(Frecuencia frecuencia) {
        return mapper.map(frecuencia, FrecuenciaData.class);
    }

    public Institucion toEntity(InstitucionData institucionData) {
        return mapper.map(institucionData, Institucion.class);
    }

    public InstitucionData toData(Institucion institucion) {
        return mapper.map(institucion, InstitucionData.class);
    }

    public ListaSondaje toEntity(ListaSondajeData listaSondajeData) {
        return mapper.map(listaSondajeData, ListaSondaje.class);
    }

    public ListaSondajeData toData(ListaSondaje listaSondaje) {
        return mapper.map(listaSondaje, ListaSondajeData.class);
    }

    public Medicamento toEntity(MedicamentoData medicamentoData) {
        return mapper.map(medicamentoData, Medicamento.class);
    }

    public MedicamentoData toData(Medicamento medicamento) {
        return mapper.map(medicamento, MedicamentoData.class);
    }

    public MotivoAplicacionCuidador toEntity(MotivoAplicacionCuidadorData motivoAplicacionCuidadorData) {
        return mapper.map(motivoAplicacionCuidadorData, MotivoAplicacionCuidador.class);
    }

    public MotivoAplicacionCuidadorData toData(MotivoAplicacionCuidador motivoAplicacionCuidador) {
        return mapper.map(motivoAplicacionCuidador, MotivoAplicacionCuidadorData.class);
    }

    public MotivoCancelacion toEntity(MotivoCancelacionData motivoCancelacionData) {
        return mapper.map(motivoCancelacionData, MotivoCancelacion.class);
    }

    public MotivoCancelacionData toData(MotivoCancelacion motivoCancelacion) {
        return mapper.map(motivoCancelacion, MotivoCancelacionData.class);
    }

    public MotivoEgreso toEntity(MotivoEgresoData motivoEgresoData) {
        return mapper.map(motivoEgresoData, MotivoEgreso.class);
    }

    public MotivoEgresoData toData(MotivoEgreso motivoEgreso) {
        return mapper.map(motivoEgreso, MotivoEgresoData.class);
    }

    public MotivoFijarCita toEntity(MotivoFijarCitaData motivoFijarCitaData) {
        return mapper.map(motivoFijarCitaData, MotivoFijarCita.class);
    }

    public MotivoFijarCitaData toData(MotivoFijarCita motivoFijarCita) {
        return mapper.map(motivoFijarCita, MotivoFijarCitaData.class);
    }

    public Municipio toEntity(MunicipioData municipioData) {
        return mapper.map(municipioData, Municipio.class);
    }

    public MunicipioData toData(Municipio municipio) {
        return mapper.map(municipio, MunicipioData.class);
    }

    public NovedadesPorTipoAdmision toEntity(NovedadesPorTipoAdmisionData novedadesPorTipoAdmisionData) {
        return mapper.map(novedadesPorTipoAdmisionData, NovedadesPorTipoAdmision.class);
    }

    public NovedadesPorTipoAdmisionData toData(NovedadesPorTipoAdmision novedadesPorTipoAdmision) {
        return mapper.map(novedadesPorTipoAdmision, NovedadesPorTipoAdmisionData.class);
    }

    public PermisosTerceros toEntity(PermisosTercerosData permisosTercerosData) {
        return mapper.map(permisosTercerosData, PermisosTerceros.class);
    }

    public PermisosTercerosData toData(PermisosTerceros permisosTerceros) {
        return mapper.map(permisosTerceros, PermisosTercerosData.class);
    }

    public Peso toEntity(PesoData pesoData) {
        return mapper.map(pesoData, Peso.class);
    }

    public PesoData toData(Peso peso) {
        return mapper.map(peso, PesoData.class);
    }

    public Piso toEntity(PisoData pisoData) {
        return mapper.map(pisoData, Piso.class);
    }

    public PisoData toData(Piso piso) {
        return mapper.map(piso, PisoData.class);
    }

    public PlanSalud toEntity(PlanSaludData planSaludData) {
        return mapper.map(planSaludData, PlanSalud.class);
    }

    public PlanSaludData toData(PlanSalud planSalud) {
        return mapper.map(planSalud, PlanSaludData.class);
    }

    public Profesional toEntity(ProfesionalData profesionalData) {
        return mapper.map(profesionalData, Profesional.class);
    }

    public ProfesionalData toData(Profesional profesional) {
        return mapper.map(profesional, ProfesionalData.class);
    }

    public Programa toEntity(ProgramaData programaData) {
        return mapper.map(programaData, Programa.class);
    }

    public ProgramaData toData(Programa programa) {
        return mapper.map(programa, ProgramaData.class);
    }

    public Proveedor toEntity(ProveedorData proveedorData) {
        return mapper.map(proveedorData, Proveedor.class);
    }

    public ProveedorData toData(Proveedor proveedor){
        return mapper.map(proveedor, ProveedorData.class);
    }

    public SedesSaludEnCasa toEntity(SedesSaludEnCasaData sedesSaludEnCasaData) {
        return mapper.map(sedesSaludEnCasaData, SedesSaludEnCasa.class);
    }

    public SedesSaludEnCasaData toData(SedesSaludEnCasa sedesSaludEnCasa) {
        return mapper.map(sedesSaludEnCasa, SedesSaludEnCasaData.class);
    }

    public TipoCuracion toEntity(TipoCuracionData tipoCuracionData) {
        return mapper.map(tipoCuracionData, TipoCuracion.class);
    }

    public TipoCuracionData toData(TipoCuracion tipoCuracion) {
        return mapper.map(tipoCuracion, TipoCuracionData.class);
    }

    public TipoEquipoBiomedico toEntity(TipoEquipoBiomedicoData tipoEquipoBiomedicoData) {
        return mapper.map(tipoEquipoBiomedicoData, TipoEquipoBiomedico.class);
    }

    public TipoEquipoBiomedicoData toData(TipoEquipoBiomedico tipoEquipoBiomedico) {
        return mapper.map(tipoEquipoBiomedico, TipoEquipoBiomedicoData.class);
    }

    public TipoMuestra toEntity(TipoMuestraData tipoMuestraData) {
        return mapper.map(tipoMuestraData, TipoMuestra.class);
    }

    public TipoMuestraData toData(TipoMuestra tipoMuestra) {
        return mapper.map(tipoMuestra, TipoMuestraData.class);
    }

    public TipoNutricion toEntity(TipoNutricionData tipoNutricionData) {
        return mapper.map(tipoNutricionData, TipoNutricion.class);
    }

    public TipoNutricionData toData(TipoNutricion tipoNutricion) {
        return mapper.map(tipoNutricion, TipoNutricionData.class);
    }

    public TiposIdentificacion toEntity(TiposIdentificacionData tiposIdentificacionData) {
        return mapper.map(tiposIdentificacionData, TiposIdentificacion.class);
    }

    public TiposIdentificacionData toData(TiposIdentificacion tiposIdentificacion) {
        return mapper.map(tiposIdentificacion, TiposIdentificacionData.class);
    }

    public TipoSondaje toEntity(TipoSondajeData tipoSondajeData) {
        return mapper.map(tipoSondajeData, TipoSondaje.class);
    }

    public TipoSondajeData toData(TipoSondaje tipoSondaje) {
        return mapper.map(tipoSondaje, TipoSondajeData.class);
    }

    public TipoSoporteNutricional toEntity(TipoSoporteNutricionalData tipoSoporteNutricionalData) {
        return mapper.map(tipoSoporteNutricionalData, TipoSoporteNutricional.class);
    }

    public TipoSoporteNutricionalData toData(TipoSoporteNutricional tipoSoporteNutricional) {
        return mapper.map(tipoSoporteNutricional, TipoSoporteNutricionalData.class);
    }

    public TipoTerapia toEntity(TipoTerapiaData tipoTerapiaData) {
        return mapper.map(tipoTerapiaData, TipoTerapia.class);
    }

    public TipoTerapiaData toData(TipoTerapia tipoTerapia) {
        return mapper.map(tipoTerapia, TipoTerapiaData.class);
    }

    public Valoraciones toEntity(ValoracionesData valoracionesData) {
        return mapper.map(valoracionesData, Valoraciones.class);
    }

    public ValoracionesData toData(Valoraciones valoraciones) {
        return mapper.map(valoraciones, ValoracionesData.class);
    }

    public ViaAdministracion toEntity(ViaAdministracionData viaAdministracionData) {
        return mapper.map(viaAdministracionData, ViaAdministracion.class);
    }

    public ViaAdministracionData toData(ViaAdministracion viaAdministracion) {
        return mapper.map(viaAdministracion, ViaAdministracionData.class);
    }
}
