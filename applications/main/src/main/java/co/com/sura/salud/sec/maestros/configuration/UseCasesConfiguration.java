package co.com.sura.maestros.configuration;

import co.com.sura.maestros.maestros.MaestrosUseCase;
import co.com.sura.maestros.maestros.gateway.MaestrosRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCasesConfiguration {

    @Bean
    public MaestrosUseCase maestrosUseCase(MaestrosRepository maestrosRepository) {
        return new MaestrosUseCase(maestrosRepository);
    }
}
