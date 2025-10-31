package com.senac.nikolas.clientFeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "DoacaoFeing", url = "localhost:8080", path = "/listar")
public interface DoacaoFeignClient {
    @GetMapping(value = "/{id}")
    public ResponseEntity<Doacao> findById(@PathVariable Long id);
}
