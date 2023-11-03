package com.eduardo.endereco.client;

import com.eduardo.endereco.dtos.EnderecoBrasilApiDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "brasilapi", url = "https://brasilapi.com.br/")
public interface BrasilApiClient {

    @GetMapping("api/cep/v1/{cep}")
    EnderecoBrasilApiDTO findEndereco(@PathVariable("cep") String cep);
}
