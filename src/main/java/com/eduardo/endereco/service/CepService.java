package com.eduardo.endereco.service;

import com.eduardo.endereco.dtos.CepDTO;

public interface CepService {

    CepDTO findEndereco(String cep);
}
