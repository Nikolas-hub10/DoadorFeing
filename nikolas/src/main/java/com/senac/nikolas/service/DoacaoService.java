package com.senac.nikolas.service;

import com.senac.nikolas.repository.DoadorRepository;
import com.senac.nikolas.repository.ProjetoFeignClient;
import org.springframework.stereotype.Service;

@Service
public class DoacaoService {
    private final DoadorRepository doacaoRepository;

    private final ProjetoFeignClient projetoFeignClient;

    public DoacaoService(DoadorRepository doacaoRepository, ProjetoFeignClient projetoFeignClient) {
        this.doacaoRepository = doacaoRepository;
        this.projetoFeignClient = projetoFeignClient;
    }
}
