package co.com.sura.maestros.maestros.adapter;

import co.com.sura.maestros.generic.ObjectMapperDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactive.mapper.ObjectMapper;

@Component
public class ConverterMaestros implements ObjectMapperDomain {

    @Autowired
    private ObjectMapper mapper;

}
