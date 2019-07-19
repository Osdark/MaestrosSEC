package co.com.sura.maestros.maestros.adapter;

import co.com.sura.maestros.maestros.gateway.MaestrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MaestrosRepositoryAdapter implements MaestrosRepository {

    @Autowired
    private ConverterMaestros converter;

}
