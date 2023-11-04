package com.eduardo.endereco.service.impl;

import com.eduardo.endereco.client.BrasilApiClient;
import com.eduardo.endereco.client.ViaCepClient;
import com.eduardo.endereco.dtos.CepDTO;
import com.eduardo.endereco.service.CepService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CepServiceImpl implements CepService {

    private final ViaCepClient viaCepClient;
    private final BrasilApiClient brasilApiClient;

    @Override
    @CircuitBreaker(name = "endereco", fallbackMethod = "fallBackFindEndereco")
    public CepDTO findEndereco(String cep) {
        if (cep.contains("0")){
            throw new RuntimeException("Error: ViaCep indisponivel.");
        }
        return viaCepClient.findEndereco(cep).to();
    }

    public CepDTO fallBackFindEndereco(String cep){
        return brasilApiClient.findEndereco(cep).to();
    }
}
