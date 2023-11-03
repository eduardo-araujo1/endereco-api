package com.eduardo.endereco.dtos;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CepDTO {

    private String cep;
    private String logradouro;
    private String cidade;
    private String estado;
    private String bairro;

}
