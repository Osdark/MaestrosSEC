package co.com.sura.salud.sec.generic;

import co.com.sura.salud.sec.Prestacion;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;

public interface ObjectMapperDomain {
    default <T, E> List<E> mapear(List<T> list, Function<T, E> transform) {
        return list.stream().map(transform).collect(Collectors.toList());
    }

    default <K, T, E> List<E> extractAndMap(Optional<K> opt, Function<K, List<T>> extractor, Function<T, E> tranformer) {
        return opt.map(extractor).map(l -> mapear(l, tranformer)).orElse(emptyList());
    }

    default <K, T, E> List<E> extractAndMapOrNull(Optional<K> opt, Function<K, List<T>> extractor, Function<T, E> tranformer) {
        return opt.map(extractor).map(l -> mapear(l, tranformer)).orElse(null);
    }

    default <T> T findPrestacionById(List<T> list, String id){
        return list.stream().filter(t -> ((Prestacion)t).getId().equals(id)).collect(Collectors.toList()).get(0);
    }
}