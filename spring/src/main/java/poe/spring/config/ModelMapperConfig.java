package poe.spring.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    // model mapper 설정
    // DTO -> Entity 변환
    // Entity -> DTO 변환

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
