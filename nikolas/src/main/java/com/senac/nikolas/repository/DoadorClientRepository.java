package com.senac.nikolas.repository;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name= “doador”, url=“localhost:8080”, path= “/listar”)
public interface DoadorClientRepository {
    @GetMapping(value= “/{id}”)
    public ResponseEntity<Projeto> findById(@PathVariable Long id);
}
