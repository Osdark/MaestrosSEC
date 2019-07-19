package co.com.sura.salud.sec.maestros.maestros.georeferenciacion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Georeferenciacion {

    private List<PuntosCardinales> puntosCardinales;
    private List<LetraDeCruce> letraCruce;
    private List<TipoDeVia> tipoVia;

    public static Georeferenciacion cargarGroreferenciacion(){
        return new Georeferenciacion();
    }

    private List<PuntosCardinales> obtenerPuntosCardinales() {
        List<PuntosCardinales> puntosCardinales = new ArrayList<>();
        puntosCardinales.add(new PuntosCardinales("1", "Sur"));
        puntosCardinales.add(new PuntosCardinales("2","Norte"));
        puntosCardinales.add(new PuntosCardinales("3","Oriente"));
        puntosCardinales.add(new PuntosCardinales("4","Occidente"));
        return puntosCardinales;
    }

    private List<LetraDeCruce> obtenerLetraCruce() {
        return Arrays.asList(
                new LetraDeCruce("1", "A"),
                new LetraDeCruce("2", "AA"),
                new LetraDeCruce("3", "AB"),
                new LetraDeCruce("4", "AC"),
                new LetraDeCruce("5", "AD"),
                new LetraDeCruce("6", "AE"),
                new LetraDeCruce("7", "AF"),
                new LetraDeCruce("8", "AG"),
                new LetraDeCruce("9", "AH"),
                new LetraDeCruce("10", "B"),
                new LetraDeCruce("11", "BB"),
                new LetraDeCruce("12", "BA"),
                new LetraDeCruce("13", "BC"),
                new LetraDeCruce("14", "BD"),
                new LetraDeCruce("15", "BE"),
                new LetraDeCruce("16", "BF"),
                new LetraDeCruce("17", "BG"),
                new LetraDeCruce("18", "BH"),
                new LetraDeCruce("19", "C"),
                new LetraDeCruce("20", "CC"),
                new LetraDeCruce("21", "CA"),
                new LetraDeCruce("22", "CB"),
                new LetraDeCruce("23", "CD"),
                new LetraDeCruce("24", "CE"),
                new LetraDeCruce("25", "CF"),
                new LetraDeCruce("26", "CG"),
                new LetraDeCruce("27", "CH"),
                new LetraDeCruce("28", "D"),
                new LetraDeCruce("29", "DD"),
                new LetraDeCruce("30", "DA"),
                new LetraDeCruce("31", "DB"),
                new LetraDeCruce("32", "DC"),
                new LetraDeCruce("33", "DE"),
                new LetraDeCruce("34", "DF"),
                new LetraDeCruce("35", "DG"),
                new LetraDeCruce("36", "DH"),
                new LetraDeCruce("37", "E"),
                new LetraDeCruce("38", "EE"),
                new LetraDeCruce("39", "EA"),
                new LetraDeCruce("40", "EB"),
                new LetraDeCruce("41", "EC"),
                new LetraDeCruce("42", "ED"),
                new LetraDeCruce("43", "EF"),
                new LetraDeCruce("44", "EG"),
                new LetraDeCruce("45", "EH"),
                new LetraDeCruce("46", "F"),
                new LetraDeCruce("47", "FF"),
                new LetraDeCruce("48", "FA"),
                new LetraDeCruce("49", "FB"),
                new LetraDeCruce("50", "FC"),
                new LetraDeCruce("51", "FD"),
                new LetraDeCruce("52", "FE"),
                new LetraDeCruce("53", "FG"),
                new LetraDeCruce("54", "FH"),
                new LetraDeCruce("55", "G"),
                new LetraDeCruce("56", "GG"),
                new LetraDeCruce("57", "GA"),
                new LetraDeCruce("58", "GB"),
                new LetraDeCruce("59", "GC"),
                new LetraDeCruce("60", "GD"),
                new LetraDeCruce("61", "GE"),
                new LetraDeCruce("62", "GF"),
                new LetraDeCruce("63", "GH"),
                new LetraDeCruce("64", "H"),
                new LetraDeCruce("65", "HH"),
                new LetraDeCruce("66", "HA"),
                new LetraDeCruce("67", "HB"),
                new LetraDeCruce("68", "HC"),
                new LetraDeCruce("69", "HD"),
                new LetraDeCruce("70", "HE"),
                new LetraDeCruce("71", "HF"),
                new LetraDeCruce("72", "HG"));
    }

    private List<TipoDeVia> obtenerTipoVia() {
        return Arrays.asList(
                new TipoDeVia("1","Avenida"),
                new TipoDeVia("2", "Autopista"),
                new TipoDeVia("3","Bulevar"),
                new TipoDeVia("4","Calle"),
                new TipoDeVia("5","Carrera"),
                new TipoDeVia("6","Carretera"),
                new TipoDeVia("7","Circular"),
                new TipoDeVia("8","Circunvalar"),
                new TipoDeVia("9","Diagonal"),
                new TipoDeVia("10","Transversal"),
                new TipoDeVia("11","Troncal"),
                new TipoDeVia("12","Variante"),
                new TipoDeVia("13","Vía"),
                new TipoDeVia("14","Corregimiento"),
                new TipoDeVia("15","Kilómetro"),
                new TipoDeVia("16","Pasaje"),
                new TipoDeVia("17","Vereda"));
    }
}
