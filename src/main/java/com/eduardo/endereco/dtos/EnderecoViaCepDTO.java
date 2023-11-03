package com.eduardo.endereco.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnderecoViaCepDTO {

    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

    public CepDTO to(){
        return CepDTO.builder()
                .cep(this.cep)
                .bairro(this.bairro)
                .cidade(this.localidade)
                .estado(this.uf)
                .build();
    }
}
