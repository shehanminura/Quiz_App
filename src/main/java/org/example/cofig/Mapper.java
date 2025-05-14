package org.example.cofig;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.swing.plaf.PanelUI;

@Configuration
public class Mapper {
    @Bean
    public ModelMapper getMapper(){
        return new ModelMapper();
    }
}
