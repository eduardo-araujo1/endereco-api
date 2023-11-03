package com.eduardo.endereco.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnderecoBrasilApiDTO {

    private String cep;
    private String street;
    private String neighborhood;
    private String city;
    private String state;

    public CepDTO to(){
        return CepDTO.builder()
                .cep(this.cep)
                .bairro(this.neighborhood)
                .cidade(this.city)
                .estado(this.state)
                .build();
    }
}
